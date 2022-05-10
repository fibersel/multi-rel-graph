
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
