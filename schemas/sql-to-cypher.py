import psycopg2
from dataclasses import dataclass
import matplotlib.pyplot as plt
import networkx as nx
from pygraphviz import *
from helpers import *
from entities import *
from generate_migrations import generate_neo4j_migrations

def get_tables_list(cursor, DB):

    q_get_tbls_tpl = """
        select distinct table_name
        from information_schema.columns
        where table_catalog = '{}' and table_schema = 'public';
    """

    cursor.execute(q_get_tbls_tpl.format(DB))

    table_names = list(map(lambda x: x[0], cursor.fetchall()))

    return table_names

def get_table_attributes(cursor, DB, table_names):
    q_get_tbl_attrs_tpl = """
        select column_name, data_type, is_nullable
        from information_schema.columns
        where table_catalog = '{}' and table_schema = 'public' and table_name = '{}';
    """

    tables = {}
    for table_name in table_names:
        q = q_get_tbl_attrs_tpl.format(DB, table_name)
        cursor.execute(q)
        
        table = Table(table_name)
        for column_name, data_type, is_nullable in cursor.fetchall():
            is_nullable = True if is_nullable == "YES" else False
            attr = Attr(column_name, data_type, is_nullable)
            table.add_attr(attr)
            
        tables[table_name] = table

    return tables


def fill_table_foreign_keys(cursor, tables):
    q_get_tbl_foreign_keys_tpl = """
        SELECT
            tc.table_name, 
            kcu.column_name, 
            ccu.table_name AS foreign_table_name,
            ccu.column_name AS foreign_column_name 
        FROM 
            information_schema.table_constraints AS tc 
            JOIN information_schema.key_column_usage AS kcu
            ON tc.constraint_name = kcu.constraint_name
            AND tc.table_schema = kcu.table_schema
            JOIN information_schema.constraint_column_usage AS ccu
            ON ccu.constraint_name = tc.constraint_name
            AND ccu.table_schema = tc.table_schema
        WHERE tc.constraint_type = 'FOREIGN KEY' AND tc.table_name in {};
    """

    q = cursor.execute(q_get_tbl_foreign_keys_tpl.format(tuple(tables.keys())))

    for source_table_name, source_attribute, target_table_name, target_attribute in cursor.fetchall():
        source_table = tables[source_table_name]
        target_table = tables[target_table_name]
        target_table.is_referenced = True
        source_table.add_fk(source_attribute, target_table_name, target_attribute)


def fill_table_primary_keys(cursor, tables):
    q_get_tbl_primary_keys_tpl = """
        SELECT c.column_name, tc.table_name
        FROM information_schema.table_constraints tc 
        JOIN information_schema.constraint_column_usage AS ccu USING (constraint_schema, constraint_name) 
        JOIN information_schema.columns AS c ON c.table_schema = tc.constraint_schema
        AND tc.table_name = c.table_name AND ccu.column_name = c.column_name
        WHERE constraint_type = 'PRIMARY KEY' and tc.table_name in {};
    """

    q = cursor.execute(q_get_tbl_primary_keys_tpl.format(tuple(tables.keys())))

    for column_name, table_name in cursor.fetchall():
        table = tables[table_name]
        table.add_pk(column_name)


def fill_table_tuples(cursor, tables):
    q_fill_tbl_tuples_tpl = """
        SELECT {}
        FROM {}
    """

    for name, table in tables.items():
        q = q_fill_tbl_tuples_tpl.format(", ".join(map(lambda x: x.name, table.attr)), name)
        cursor.execute(q)
        table.tuples = cursor.fetchall()

def get_nodes_fk(fk, src, nodeClasses):
    for nc in nodeClasses:
        if nc.label == src:
            src_nc = nc
        if nc.label == fk.target_table:
            dst_nc = nc
    
    for n1 in src_nc.nodes:
        for n2 in dst_nc.nodes:
            lhs_i, _ = get_idx(n1.attr, fk)
            rhs_i, _ = get_idx(n2.attr, fk, False)
            lhs = n1.vals[lhs_i]
            rhs = n2.vals[rhs_i]
            if lhs == rhs:
                yield n1, n2

def relational_to_graph(relSchema):
    nodeClasses = []
    edgeClasses = []
    edges = []
    G = nx.DiGraph()
    edge_labels = {}
    
    for name, table in relSchema.tables.items():
        if not table.is_m2m():
            t = [Node(name, table.attr, tpl) for tpl in table.tuples]
            nc = NodeClass(name, table.attr, table.pk, t)
            nodeClasses.append(nc)
            
            G.add_node(name)
    
    for name, table in relSchema.tables.items():
        if table.is_m2m():
            edges = []
            for tpl in table.tuples:
                table.extract_tables()
                src, dst = get_nodes(table, tpl, nodeClasses)
                edge = Edge(name, table.attr, tpl, src, dst)
                edges.append(edge)
            src, dst = table.extract_tables()
            ec = EdgeClass(name, src, dst, table.attr, edges)
            edgeClasses.append(ec)
            
            G.add_edge(src, dst)
            edge_labels[(src, dst)] = name

    for name, table in relSchema.tables.items():
        if not table.is_m2m():
            for fk in table.fk:
                dst_tbl = tables[fk.target_table]
                edges = []
                attrs = [fk.source_attr_name, fk.target_attr_name]
                i1, _ = get_idx(table.attr, fk)
                i2, _ = get_idx(dst_tbl.attr, fk, False)

                edges = []
                for n1, n2 in get_nodes_fk(fk, name, nodeClasses):
                    vals = [n1.vals[i1], n2.vals[i2]]
                    edge = Edge(fk.source_attr_name, n1, n2, attrs, vals)
                    edges.append(edge)
                ec = EdgeClass(fk.source_attr_name, name, fk.target_table, attrs, edges)
                edgeClasses.append(ec)
                
                G.add_edge(name, fk.target_table)
                edge_labels[(name, fk.target_table)] = fk.target_attr_name
                
    return GraphSchema(nodeClasses, edgeClasses), G, edge_labels

if __name__ == "__main__":
    DB = "northwind"
    conn = psycopg2.connect("dbname={} user=postgres password=password".format(DB))
    cursor = conn.cursor()

    table_names = get_tables_list(cursor, DB)

    tables = get_table_attributes(cursor, DB, table_names)
    fill_table_foreign_keys(cursor, tables)
    fill_table_primary_keys(cursor, tables)
    fill_table_tuples(cursor, tables)

    # for k, v in tables.items():
    #     print(k, v.is_m2m(), v.fk, v.pk)

    # rel schema is ready
    rel_schema = RelationalSchema(tables)

    # map rel schema to graph schema
    graphSchema, G, edge_labels = relational_to_graph(rel_schema)

    filename = "/Users/a.palagashvili/coursework/neo4j/queries/tmp.cypher"

    # generate neo4j migrations
    generate_neo4j_migrations(tables, filename)