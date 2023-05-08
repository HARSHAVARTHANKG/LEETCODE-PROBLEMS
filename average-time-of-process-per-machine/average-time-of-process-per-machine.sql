# Write your MySQL query statement below


select s1.m1 as machine_id,round(avg(s1.t1-s2.t2),3) as processing_time
from
(select machine_id as m2,process_id as p2,timestamp 
as t2 from activity as a2 where 
a2.activity_type='start')s2 
join
(select machine_id as m1,process_id as p1,timestamp 
as t1 from activity as a1 where 
a1.activity_type='end')s1
where s1.m1=s2.m2 and s1.p1=s2.p2 
group by s1.m1,s2.m2;





