# Write your MySQL query statement below

SELECT NAME FROM SALESPERSON
WHERE SALES_ID<>ALL(SELECT ORDERS.SALES_ID FROM ORDERS,COMPANY
WHERE ORDERS.COM_ID=COMPANY.COM_ID AND COMPANY.NAME='RED');