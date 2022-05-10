from neo4j import GraphDatabase
from dataclasses import dataclass
from collections import defaultdict
from typing import Any
import argparse

from entities import Node, NodeClass, Edge, EdgeClass, Attr, FK
from generate_migrations import generate_psql_migrations


TABLE_PRIMARY_KEYS = {
    "suppliers": {'supplier_id'},
    "customer_demographics": {'customer_type_id'},
    "territories": {'territory_id'},
    "shippers": {'shipper_id'},
    "orders": {'order_id'},
    "customer_customer_demo": {'customer_type_id', 'customer_id'},
    "order_details": {'product_id', 'order_id'},
    "employees": {'employee_id'},
    "categories": {'category_id'},
    "employee_territories": {'employee_id', 'territory_id'},
    "customers": {'customer_id'},
    "products": {'product_id'},
    "region": {'region_id'},
    "us_states": {'state_id'}
}

uri = "neo4j://localhost:7687"
user = "neo4j"
password = "password"

def nodeMapper(nodeRec):
    label = list(nodeRec.labels)[0]
    attrs = tuple(k for k in nodeRec)
    vals = tuple(nodeRec[k] for k in nodeRec)
    return Node(label, attrs, vals)

def edgeMapper(edgeRec, src, dst):
    label = edgeRec.type
    attrs = tuple(k for k in edgeRec)
    vals = tuple(edgeRec[k] for k in edgeRec)
    return Edge(label, attrs, vals, src, dst)


def extract_triplets(session):
    result = session.run("match (a)-[b]->(c) return a,b,c")
    triplets = []

    for s, e, t in result:
        s = nodeMapper(s)
        t = nodeMapper(t)
        e = edgeMapper(e, s, t)
        triplets.append((s, e, t))

    return triplets


def merge_separate_nodes(session, tuples):
    results2 = session.run("match (a) return a") # merge nodes without edges

    for n1 in results2:
        for n2 in n1:
            s = nodeMapper(n2)
            l = s.label
            tuples[l].add(s)


def build_ncs(tuples):
    ncs = []
    for k, v in tuples.items():
        label = k
        a2t = {}
        for n in v:
            attrs = n.attr
            vals = n.vals
            for i in range(len(attrs)):
                attr = attrs[i]
                tp = type(vals[i])    
                a2t[attr] = tp
        attrs = [Attr(k, a2t[k], False) for k in a2t]
        nc = NodeClass(label, attrs, set(), v)
        ncs.append(nc)

    return ncs


def build_ecs(edgesSets):
    ecs = []
    for k, v in edgesSets.items():
        label = k
        a2t = {}
        for e in v:
            attrs = e.attr
            vals = e.vals
            source = e.source.label
            target = e.target.label
            for i in range(len(attrs)):
                attr = attrs[i]
                tp = type(vals[i])
                a2t[attr] = tp
                
        attrs = [Attr(k, a2t[k], False) for k in a2t]
        ec = EdgeClass(label, source, target, attrs, v)
        ecs.append(ec)

    return ecs


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("-f", "--filename", type=str)
    parser.add_argument("-db", "--database", type=str)
    args = parser.parse_args()

    driver = GraphDatabase.driver(uri, auth=(user, password))
    session = driver.session()

    triplets = extract_triplets(session)
        
    tuples = defaultdict(set) # mapping node label -> set(nodes)

    for n1, _, n2 in triplets:
        l = n1.label
        tuples[l].add(n1)
        l = n2.label
        tuples[l].add(n2)

    merge_separate_nodes(session, tuples)
        
    for k in tuples:
        tuples[k] = list(tuples[k])

    session.close()

    ncs = build_ncs(tuples)

    edgesSets = defaultdict(set) # mapping edge label -> set(sdges)

    for s, e, t in triplets:
        label = e.label
        edgesSets[label].add(e)
    
    ecs = build_ecs(edgesSets)

    for nc in ncs:
        keys = TABLE_PRIMARY_KEYS[nc.label]
        nc.pk = keys

    generate_psql_migrations(ncs, ecs, args.database, args.filename)
