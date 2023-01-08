
-- q1

SELECT count(*)
FROM order_details
WHERE order_id = 10262;

-- q2

SELECT order_id, product_id, unit_price
FROM order_details
WHERE order_id = 10262;

-- q3

SELECT product_id, unit_price, shipped_date
FROM 
    order_details 
        JOIN 
    orders 
    ON order_details.order_id = orders.order_id
WHERE order_details.order_id = 10262;

-- q4

SELECT employees.employee_id, city, territory_id 
FROM 
    employees 
        JOIN 
    employee_territories 
    ON employees.employee_id = employee_territories.employee_id;

-- q5

SELECT order_id, sum(unit_price) 
FROM order_details 
GROUP BY order_id;

-- q6

SELECT ship_city, sum(unit_price)
FROM
    order_details
        JOIN
    orders
    ON order_details.order_id = orders.order_id
GROUP BY ship_city
ORDER BY ship_city;


-- ###################################

-- psql northwind

-- cypher-shell neo4j 201998

SELECT ship_name
FROM orders
WHERE ship_country = 'Switzerland';


SELECT sum(od.quantity * od.unit_price) 
FROM 
    orders o 
JOIN 
    order_details od 
ON o.order_id = od.order_id  
WHERE o.ship_country = 'Switzerland';


SELECT count(*), category_name 
FROM 
    products 
JOIN 
    categories 
ON 
    products.category_id = categories.category_id 
GROUP BY category_name;