-- Agregar índice en la columna City y CustomerName
-- Se puede usar un índice compuesto. Un índice compuesto en (City, CustomerName) puede ser particularmente eficiente porque beneficia tanto al filtro WHERE como a la ordenación.
-- Agregar LIMIT

SELECT CustomerName FROM Customers WHERE City = 'London' ORDER BY CustomerName;
