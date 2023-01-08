MATCH (o:orders{ship_country: "Switzerland"})
RETURN o.ship_name;


MATCH (o:orders{ship_country: "Switzerland"})<-[od:order_details]-(p:products) 
RETURN sum(od.quantity * od.unit_price);


MATCH (p:products)-[:category_id]->(c:categories) 
RETURN c.category_name, count(*);


MATCH (o:orders)<-[:order_details]-(p:products)
RETURN o.ship_name, p.product_name;


MATCH (e:employees)<-[:employee_id]-(o:orders)-[:customer_id]->(c:customers)
WHERE o.ship_city = 'Reims' 
RETURN e.title, c.postal_code;