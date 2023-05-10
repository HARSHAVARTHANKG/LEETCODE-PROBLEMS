# Write your MySQL query statement below

/**/






select t.pid as product_id
,round(sum(t.pro)/sum(t.unit),2) as average_price from 

(select u.units as unit,u.product_id 
as uid,p.product_id as pid,(p.price*u.units) as pro from
prices as p,unitssold as u 
where u.purchase_date between start_date and end_date 
and p.product_id =u.product_id)T
group by t.pid




