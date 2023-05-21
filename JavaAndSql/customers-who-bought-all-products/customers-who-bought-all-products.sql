# Write your MySQL query statement below



select x.cid as customer_id from
(select customer_id as cid ,count(distinct(product_key)) as cntpk
from customer
group by customer_id)x

join

(select count(distinct(product_key)) as ypk from product)y

where x.cntpk=y.ypk;
