from dataclasses import dataclass
from typing import Any
import typing as tp

@dataclass
class Attr:
    name: str
    data_type: str
    nullable: bool


@dataclass
class FK:
    source_attr_name: str
    target_table: str
    target_attr_name: str


# for sql

class RelationalSchema:
    
    def __init__(self, tables):
        self.tables = tables


class Table:
    def __init__(self, name):
        self.name = name
        self.attr = []
        self.fk = []
        self.pk = set()
        self.is_referenced = False
        self.tuples = []
        
    def add_attr(self, attr):
        self.attr.append(attr)
        
    def add_fk(self, source_attribute, target_table_name, target_attribute):
        self.fk.append(FK(source_attribute, target_table_name, target_attribute))
        
    def add_pk(self, attr):
        self.pk.add(attr)
        
    def is_m2m(self):
        if self.is_referenced:
            return False
        
        refcnt = 0
        c = set()
        for fk in self.fk:
            if fk.source_attr_name not in self.pk:
                return False
            if fk.target_table not in c:
                c.add(fk.target_table)
                refcnt += 1
        if refcnt != 2:
            return False
        
        return True
    
    def extract_tables(self):
        if not self.is_m2m():
            raise RuntimeError("exctracting edges is possible only for m2m tables")
            
        targets = []
        for fk in self.fk:
            target_table = fk.target_table
            targets.append(target_table)
            
        return sorted(targets) 


# for graph

class GraphSchema:
    
    def __init__(self, nodes, edges):
        self.nodes = nodes
        self.edges = edges

@dataclass(frozen=True)
class Node:
    label: str
    attr: tp.List[str]
    vals: tp.List[Any]
        
@dataclass(frozen=True)
class Edge:
    label: str
    attr: tp.List[str]
    vals: tp.List[Any]
    source: Node
    target: Node

class NodeClass:
    def __init__(self, label, attr, pk, nodes):
        self.label = label
        self.pk = pk
        self.nodes = nodes
        self.attr = attr

class EdgeClass:
    def __init__(self, label, source, target, attr, edges):
        self.label = label
        self.source = source
        self.target = target
        self.attr = attr
        self.edges = edges

    def is_m2m(self):
        sources = set()
        targets = set()
        src_many = False
        tgt_many = False
        has_attr = False
        
        for e in self.edges:
            if e.vals:
                has_attr = True
            
            if e.source in sources:
                tgt_many = True
            sources.add(e.source)
            
            if e.target in targets:
                src_many = True
            targets.add(e.target)
            
            
        return src_many, tgt_many, has_attr
