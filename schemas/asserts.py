from neo4j import GraphDatabase
import psycopg2


# neo4j creds
uri = "neo4j://localhost:7687"
user = "neo4j"
password = "password"

def assert_table_len(tablename):
    lhs = session.run(f"match (n:{tablename}) return count(*) as cnt;").peek().get("cnt")
    cursor.execute(f"select count(*) from {tablename};")
    rhs = cursor.fetchall()[0][0]

    assert lhs == rhs

def assert_m2m_table_len(tablename):
    lhs = session.run(f"match (a)-[:{tablename}]->(b) return count(*) as cnt;").peek().get("cnt")
    cursor.execute(f"select count(*) from {tablename};")
    rhs = cursor.fetchall()[0][0]

    assert lhs == rhs

if __name__ == "__main__":
    driver = GraphDatabase.driver(uri, auth=(user, password))
    session = driver.session()

    conn = psycopg2.connect("dbname={} user=postgres password=password".format("northwind_map"))
    cursor = conn.cursor()

    for tbl in ["suppliers", "territories", "shippers", "orders", "employees", "categories", "customers", "products"]:
        assert_table_len(tbl)

    for tbl in ["employee_territories", "order_details"]:
        assert_m2m_table_len(tbl)
