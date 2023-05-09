# Write your MySQL query statement below

select employee_id 
from employees as e
where salary<30000
and manager_id<>all(select employee_id from employees )
order by employee_id;