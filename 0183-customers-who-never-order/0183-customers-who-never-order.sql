# Write your MySQL query statement below
-- Using NOT IN
-- SELECT name AS Customers 
-- FROM Customers 
-- WHERE id NOT IN (SELECT customerId FROM Orders);

-- Using LEFT JOIN
SELECT c.name AS Customers 
FROM Customers c 
LEFT JOIN Orders o ON c.id = o.customerId 
WHERE o.customerId IS NULL;