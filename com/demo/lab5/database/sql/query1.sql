-- La OrderDetails.OrderID debe estar indexada.
-- Indexar la columna OrderDetails.Quantity
-- Considerar agregar una columna TotalPrice que ya tenga almacenada la multiplicación OrderDetails.Quantity * OrderDetails.UnitPrice
-- Se pueden utilizar vistas materializadas para hacer el precálculo del TotalPrice si no se desea agregar como columna.

SELECT Orders.OrderID, SUM(OrderDetails.Quantity * OrderDetails.UnitPrice) AS TotalPrice
FROM Orders
JOIN OrderDetails ON Orders.OrderID = OrderDetails.OrderID
WHERE OrderDetails.Quantity > 10
GROUP BY Orders.OrderID;


--Si TotalPrice ya está almacenado, entonces solo queda hacer la suma
SELECT Orders.OrderID, SUM(OrderDetails.TotalPrice) AS TotalPrice
FROM Orders
JOIN OrderDetails ON Orders.OrderID = OrderDetails.OrderID
WHERE OrderDetails.Quantity > 10
GROUP BY Orders.OrderID;