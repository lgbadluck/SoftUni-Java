
CREATE TABLE dbo.Data
(
    OrderID   INT IDENTITY(1,1),
    OrderDate DATETIME2
);
 
INSERT dbo.Data(OrderDate) VALUES
 ('20110630 23:59:59.9999999'),
 ('20110730 15:32:00.0000000'),
 ('20110730 23:59:59.9999999'),
 ('20110731 00:00:00.0000000'),
 ('20110731 23:59:59.9999999'),
 ('20110801 00:00:00.0000000');


 SELECT TOP (1000) [OrderID]
      ,[OrderDate]
  FROM [TSQL2012].[dbo].[Data]

  SELECT OrderID, OrderDate
  FROM dbo.Data
  WHERE OrderDate Between '20110701' AND '20110731'; 

  SELECT TOP (1000) [OrderID]
      ,[OrderDate]
  FROM [TSQL2012].[dbo].[Data]
  SELECT OrderID, OrderDate
  FROM dbo.Data
  WHERE OrderDate >= '20110701' AND OrderDate < '20110801';

SELECT TOP (1000) [OrderID],[OrderDate]
  FROM [TSQL2012].[dbo].[Data]
SELECT OrderID, OrderDate, CONVERT(SMALLDATETIME, OrderDate) AS ConvertDate
  FROM dbo.Data
  WHERE CONVERT(SMALLDATETIME, OrderDate)
  BETWEEN '20110701' AND '20110731';

  SELECT COUNT(*) AS numorderlines, SUM(qty*unitprice) AS totalsales
  FROM Sales.OrderDetails

  SELECT TOP(5) productid, productname, unitprice,
  RANK() OVER(ORDER BY unitprice DESC) AS rankByPrice
  FROM Production.Products
  ORDER BY rankByPrice

SELECT ABS(-1.0), ABS(0.0), ABS(1.0);
SELECT CAST(SYSDATETIME() AS DATE) AS [curretDate]
SELECT DATENAME (dw, CAST (SYSDATETIME () AS DATE)) [currentDay]

SELECT DB_NAME() AS [Current Database]

SELECT COUNT(*) AS numorders, SUM(unitprice) AS totalSales
from Sales.OrderDetails