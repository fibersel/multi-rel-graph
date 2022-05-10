def get_idx(attrs, fk, src=True):
    for i, a in enumerate(attrs):
        if src and a.name == fk.source_attr_name:
            return i, a
        elif not src and a.name == fk.target_attr_name:
            return i, a

def fk_from_node(node, fks):
    r = []
    for fk in fks:
        if fk.target_table == node.label:
            i, _ = get_idx(node.attr, fk)
            r.append(node.vals[i])
    return tuple(r)

def match_fk(n1, n2, tpl, tbl):
    for fk in tbl.fk:
        i, _ = get_idx(tbl.attr, fk)
        v1 = tpl[i]
        
        if fk.target_table == n1.label:
            i, _ = get_idx(n1.attr, fk, False)
            v2 = n1.vals[i]
            if v1 != v2:
                return False
            
        if fk.target_table == n2.label:
            i, _ = get_idx(n2.attr, fk, False)
            v2 = n2.vals[i]
            if v1 != v2:
                return False
    return True


def get_nodes(m2m_tbl, tpl, nodeClasses):
    src, dst = m2m_tbl.extract_tables()
    for nc in nodeClasses:
        if nc.label == src:
            src_nc = nc
        if nc.label == dst:
            dst_nc = nc
    for n1 in src_nc.nodes:
        for n2 in dst_nc.nodes:
            if n1.label == src and n2.label == dst and match_fk(n1, n2, tpl, m2m_tbl):
                return n1, n2