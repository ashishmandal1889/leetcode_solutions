# Write your MySQL query statement below
SELECT 
E.name as Employee
FROM
Employee as E
JOIN
Employee as M ON 
E.managerId = M.Id
WHERE
E.salary>M.salary