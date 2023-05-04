# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below

DELETE P FROM PERSON  P , PERSON  Q 
WHERE P.ID>Q.ID AND P.EMAIL=Q.EMAIL;