# Write your MySQL query statement below


select(SELECT T.NUM FROM
(SELECT NUM,COUNT(NUM) AS CNT FROM MYNUMBERS
GROUP BY NUM)T
WHERE T.CNT=1
ORDER BY T.NUM DESC LIMIT 1) as num;