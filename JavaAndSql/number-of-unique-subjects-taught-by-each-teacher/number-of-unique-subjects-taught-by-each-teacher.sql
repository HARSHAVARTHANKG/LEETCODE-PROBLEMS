# Write your MySQL query statement below  

select x.tid as teacher_id,count(x.tid) as cnt from
(select teacher_id as tid from teacher 
group by subject_id,teacher_id)x
group by x.tid;

