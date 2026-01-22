select round((count(*)/(select count(distinct customer_id)from Delivery))*100,2)
immediate_percentage from Delivery
where datediff(order_date,customer_pref_delivery_date)=0 and (customer_id,order_date)
in (select customer_id,min(order_date)from Delivery group by customer_id)