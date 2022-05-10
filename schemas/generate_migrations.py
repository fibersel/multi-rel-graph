STR_TYPES = {
    'character varying',
    'text',
    'bpchar',
    'character',
    'bytea',
    'date'
}

create_node_tpl = """CREATE (:{} {{{}}});"""
edge_w_attr_creation_tpl = """
    MATCH (a:{0}), (b:{1})
    WHERE a.{2} = {3} AND b.{4} = {5}
    CREATE (a)-[:{6}]->(b);
"""
drop_q = """MATCH (n) DETACH DELETE n;"""
edge_creation_tpl = """MATCH (a:{0}), (b:{1}) WHERE a.{2} = b.{3} CREATE (a)-[:{4}]->(b);"""
edge_w_attr_creation_tpl = """MATCH (a:{0}), (b:{1}) WHERE a.{2} = {3} AND b.{4} = {5} CREATE (a)-[:{6} {{{7}}}]->(b);"""


def format_attrs(attr, values):
    pairs = []
    for a, v in zip(attr, values):
        if v is None:
            continue
        
        if a.data_type in STR_TYPES:
            v = '"{}"'.format(v)
        else:
            v = '{}'.format(v)
        payload = str(a.name) + ": " + v
        pairs.append(payload)
        
    payload = ", ".join(pairs)
    return payload


def generate_neo4j_inserts(table):
    inserts = []
    
    for row in table.tuples:
        payload = format_attrs(table.attr, row)
        q = create_node_tpl.format(table.name, payload)
        inserts.append(q)
        
    return inserts


def get_idx(attrs, fk):
    for i, a in enumerate(attrs):
        if a.name == fk.source_attr_name:
            return i, a


def generate_neo4j_migrations(tables, filename):
    with open(filename, "w") as out:
        out.write(drop_q + "\n\n")
        
        for _, table in tables.items():
            if not table.is_m2m():
                inserts = generate_neo4j_inserts(table)
                for line in inserts:
                    out.write(line + "\n")

                out.write("\n\n")
                
        for _, table in tables.items():
            if not table.is_m2m():
                for fk in table.fk:
                    edge_creation_q = edge_creation_tpl.format(
                        table.name, 
                        fk.target_table,
                        fk.source_attr_name,
                        fk.target_attr_name,
                        fk.source_attr_name,
                    )
                    out.write(edge_creation_q + "\n")
                    
        for _, table in tables.items():
            for row in table.tuples:
                if table.is_m2m():
                    fk1, fk2 = table.fk
                    fk1_idx, lhs_a = get_idx(table.attr, fk1)
                    fk2_idx, rhs_a = get_idx(table.attr, fk2)

                    lhs_val = row[fk1_idx]
                    rhs_val = row[fk2_idx]

                    if lhs_a.data_type in STR_TYPES:
                        lhs_val = '"{}"'.format(lhs_val)

                    if rhs_a.data_type in STR_TYPES:
                        rhs_val = '"{}"'.format(rhs_val)

                    q = edge_w_attr_creation_tpl.format(
                        fk1.target_table,
                        fk2.target_table,
                        fk1.target_attr_name,
                        lhs_val,
                        fk2.target_attr_name,
                        rhs_val,
                        table.name,
                        format_attrs(table.attr, row)
                    )
                    
                    out.write(q + "\n")
            out.write("\n\n")


def generate_deletion(nc):
    query = f"""DROP TABLE IF EXISTS {nc.label};"""
    
    return query

def generate_migration(nc):
    tablename = nc.label
    query = f"""CREATE TABLE {tablename} """ + " (\n"
    parts = []
    for attr in nc.attr:
        part = ""
        if attr.data_type == float:
            tp = ' real'
        elif attr.data_type == int:
            tp = ' smallint'
        elif attr.data_type == str:
            tp = ' text'
        part += f"\t{attr.name} {tp}"
        if attr.nullable:
            part += " NOT NULL"
        parts.append(part)
        # query += ",\n"
    query += ",\n".join(parts)
    return query + "\n);"

def generate_pk_constraint(nc):
    tablename = nc.label
    pk = list(nc.pk)[0]
    q_tpl = f"ALTER TABLE ONLY {tablename} ADD CONSTRAINT pk_{tablename} PRIMARY KEY ({pk});"
    return q_tpl

def generate_inserts_for_nodeClass(nc):
    
    tpl = "INSERT INTO {} ({}) VALUES ({});"
    res = []
    for node in nc.nodes:
        t = []

        for val in node.vals:
            if isinstance(val, str):
                val = val.replace("'", "''")
                val = "\'" + val + "\'"
            else:
                val = str(val)
            t.append(val)
            
        res.append(tpl.format(node.label, ",".join(node.attr), ",".join(t)))
    return res
        
    return [tpl.format(node.label, ",".join(node.attr), node.vals) for node in nc.nodes]

def generate_inserts_for_edgeClass(ec):
    
    tpl = "INSERT INTO {} ({}) VALUES {};"
        
    return [tpl.format(edge.label, ",".join(edge.attr), edge.vals) for edge in ec.edges]


def generate_psql_migrations(ncs, ecs, database, filename):
    with open(filename, "w") as out:

        print(f"DROP DATABASE {database};", file=out)
        print(f"CREATE DATABASE {database};", file=out)
        print(f"\c {database};", file=out)
        print("\n\n", file=out)
        
        for nc in ncs:
            deletion = generate_deletion(nc)
            migration = generate_migration(nc)
            print(deletion, file=out)
            print(migration, file=out)
            print("\n\n", file=out)

        for nc in ncs:
            print(*generate_inserts_for_nodeClass(nc), sep='\n', file=out)
            print("\n\n", file=out)

        for nc in ncs:
            print(generate_pk_constraint(nc), file=out)

        print("\n\n", file=out)
        for ec in ecs:
            src_many, tgt_many, has_attr = ec.is_m2m()
            if has_attr or (src_many and tgt_many):
                print(generate_deletion(ec), file=out)
                print(generate_migration(ec), file=out)
                print(*generate_inserts_for_edgeClass(ec), sep="\n", file=out)
                print("\n\n", file=out)

        for ec in ecs:
            src_many, tgt_many, has_attr = ec.is_m2m()
            if not has_attr and (not src_many or not tgt_many):
                if src_many:
                    source, target = ec.source, ec.target
                    q = f"ALTER TABLE ONLY {source} ADD CONSTRAINT fk_{source}_{target} FOREIGN KEY ({ec.label}) REFERENCES {target};"
                    print(q, file=out)
                if tgt_many:
                    source, target = ec.source, ec.target
                    q = f"ALTER TABLE ONLY {target} ADD CONSTRAINT fk_{target}_{source} FOREIGN KEY ({ec.label}) REFERENCES {source};"
                    print(q, file=out)

            else:
                source, target = ec.source, ec.target
                for nc in ncs:
                    if nc.label == source:
                        source_nc = nc
                for attr in ec.attr:
                    if attr.name in source_nc.pk:
                        source_fk = attr.name

                for nc in ncs:
                    if nc.label == target:
                        target_nc = nc
                for attr in ec.attr:
                    if attr.name in target_nc.pk:
                        target_fk = attr.name

                q = f"ALTER TABLE ONLY {ec.label} ADD CONSTRAINT pk_{ec.label} PRIMARY KEY ({source_fk}, {target_fk});"
                print(q, file=out)

                q = f"ALTER TABLE ONLY {ec.label} ADD CONSTRAINT fk_{ec.label}_{source} FOREIGN KEY ({source_fk}) REFERENCES {source};"
                print(q, file=out)
                q = f"ALTER TABLE ONLY {ec.label} ADD CONSTRAINT fk_{ec.label}_{target} FOREIGN KEY ({target_fk}) REFERENCES {target};"
                print(q, file=out)
