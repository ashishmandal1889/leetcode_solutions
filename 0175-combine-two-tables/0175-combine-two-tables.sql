-- # Write your MySQL query statement below
SELECT
P.firstname, P.lastname,A.city,A.state
FROM person as P
LEFT JOIN
address as A ON P.personId = A.personId;


