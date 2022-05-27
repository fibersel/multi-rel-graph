
// q1

match ()-[o:order_details{order_id: 10262}]->() 
return count(*);

// q2

match ()-[o:order_details{order_id: 10262}]->() 
return o.order_id, o.product_id, o.unit_price;

// q3

match ()-[od:order_details]->(o:orders) 
where od.order_id = 10262 
return od.product_id, od.unit_price, o.shipped_date;

// q4

match ()-[et:employee_territories]->(e:employees) 
return e.employee_id, e.city, et.territory_id;

// q5

match ()-[od:order_details]->(o:orders)  
return o.ship_city, sum(od.unit_price) 
order by o.ship_city;
