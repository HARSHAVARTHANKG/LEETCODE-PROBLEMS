# Write your MySQL query statement below

select y.c_id as contest_id
,round(((y.ccid/y1.cuid)*100),2)
as percentage from
(select x1.cntuid as cuid from
(select count(user_id) as cntuid,user_id 
as uid from users)x1)y1

 join

 (select x.cntcid as ccid,x.cid as c_id from 
(select contest_id as cid, count(contest_id) 
 as cntcid from register
group by contest_id)x)y

order by percentage desc,contest_id asc;

