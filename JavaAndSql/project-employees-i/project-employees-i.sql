# Write your MySQL query statement below



select t.p1 as project_id, round((t.e1)/t.c,2) as average_years from
(select p.project_id as p1,sum(e.experience_years) as e1,count(e.experience_years) as c
from project as p,employee as e
where p.employee_id=e.employee_id
group by p.project_id)t
group by t.p1;