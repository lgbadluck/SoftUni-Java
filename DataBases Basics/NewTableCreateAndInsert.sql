
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

SELECT productid, productname, unitprice,
	RANK() OVER(ORDER BY unitprice DESC) AS rankbyprice
FROM Production.Products
ORDER BY rankbyprice

SELECT productid, productname, unitprice,
	DENSE_RANK() OVER(ORDER BY unitprice DESC) AS dense_rankbyprice
FROM Production.Products
ORDER BY dense_rankbyprice

SELECT productid, productname, unitprice,
	NTILE(5) OVER(ORDER BY unitprice DESC) AS ntile_rankbyprice -- Ntile makes them in N-th groups
FROM Production.Products
ORDER BY ntile_rankbyprice

SELECT productid, unitprice,
IIF(unitprice>50, 'high', 'low') AS pricepoint
FROM Production.Products
ORDER BY pricepoint

SELECT CHOOSE (3, 'Beverages', 'Condiments', 'Confections') AS choose_result;

--ISDATE
DECLARE @Name nvarchar(50) = 'XY14822'
DECLARE @DiscontinuedDate datetime = '12/4/2012'
SELECT ISDATE(@Name) AS NameISDATE,
		ISDATE(@DiscontinuedDate) AS DiscontinuedDateISDATE;

--ISNUMERIC
DECLARE @Name nvarchar(50) = 'XY14822'
DECLARE @DiscontinuedDate datetime = '12/4/2012'
DECLARE @DaysToManufacture int = 100
SELECT ISNUMERIC(@Name) AS NameISNUMERIC,
		ISNUMERIC(@DiscontinuedDate) AS DiscontinuedDateISNUMERIC,
		ISNUMERIC(@DaysToManufacture) AS DaysToManufactureISNUMERIC;

--Same resultsm but with CASE
SELECT productid, unitprice,
CASE
	WHEN unitprice > 53 THEN 'high'
	WHEN unitprice < 53 THEN 'low'
	ELSE 'Who knows'
END AS 'pricepoint'
FROM Production.Products
ORDER BY unitprice DESC

--A simple IF statement
IF OBJECT_ID('HR.Employees') IS NULL
BEGIN
	PRINT 'The specified object does not exist';
END
ELSE
BEGIN
	PRINT 'The specified object exists';
END

--Converting NULL with ISNULL
SELECT custid, city, ISNULL(region, 'ami Nqma') AS region, country
FROM Sales.Customers
ORDER BY region ASC

--COALESCE to Return Non-NULL Values
SELECT custid, country, region, city,
country + ', ' + COALESCE(region + ', ', ' ') + city as location
FROM Sales.Customers

--First, set up sample date
CREATE TABLE dbo.employee_goals(emp_id INT, goal int, actual int);
GO
--Populate the sample data
INSERT INTO dbo.employee_goals
VALUES (1,100, 110), (2,90, 90), (3,100, 90), (4,100, 80);
--Show the sample date
SELECT emp_id, goal, actual
FROM dbo.employee_goals
--USE NULLIF to show which employees have actual
--values different from their goals
SELECT emp_id, NULLIF(actual, goal) AS actual_if_different
FROM dbo.employee_goals


--T-SQL VIEWs (Views can be wrappers for simple or complex SELECT statements)
--(Views are executed as a query)
-- |CREATE VIEW <schema_name,view_name> 
-- |AS
-- |SELECT

CREATE VIEW HR.getFullNames
AS
SELECT empid, firstname + N' '+lastname as fullname
FROM HR.Employees


SELECT empid, fullname
FROM HR.getFullNames
WHERE empid=3

CREATE VIEW Sales.fullOrderDetails
AS
SELECT o.orderid, o.orderdate, od.productid, od.unitprice, od.qty
FROM Sales.Orders AS o
JOIN Sales.OrderDetails AS od
ON o.orderid = od.orderid

SELECT orderid, orderdate, productid, unitprice, qty
FROM Sales.fullOrderDetails

CREATE VIEW Sales.employeeSalesByYear
AS
SELECT empid, YEAR(orderdate) AS orderyear,
COUNT(custid) AS all_custs,
COUNT(DISTINCT custid) AS unique_custs
FROM Sales.Orders
GROUP BY empid, YEAR(orderdate)

SELECT empid, orderyear, all_custs, unique_custs
FROM Sales.employeeSalesByYear
WHERE orderyear=2006

----------------
-- SUBQUERIES --
----------------
--SELECT ...
--FROM <table or view>
--WHERE <column> = (
--	select ..
--	....
--	);

-- NON-Correlated Subqueries
SELECT orderid, orderdate, custid
FROM Sales.Orders
WHERE custid IN (
	SELECT custid
	FROM Sales.Customers
	WHERE city = 'London'
	)
ORDER BY orderdate DESC;

-- Correlated Subqueries
SELECT custid, orderid, orderdate, empid
FROM Sales.Orders AS O1
WHERE orderid = (
	SELECT MAX(O2.orderid)
	FROM Sales.Orders O2
	WHERE O2.custid = O1.custid
	)
ORDER BY custid ASC

DECLARE @maxid AS INT = (
SELECT MAX(orderid)
FROM Sales.Orders
);

SELECT orderid, orderdate, empid, custid
FROM Sales.Orders
WHERE orderid = @maxid
GO

SELECT orderid, orderdate, custid, empid
FROM Sales.Orders
WHERE orderid = (
	SELECT MAX(O.orderid)
	FROM Sales.Orders AS O
);

--42 Rows of employees that have lastname begining with 'B'
SELECT orderid
FROM Sales.Orders
WHERE empid = (
	SELECT E.empid
	FROM HR.Employees AS E
	WHERE E.lastname LIKE N'B%'
);
-- THIS will FAIL -> SUBQUERY with multiple scalar results
SELECT orderid
FROM Sales.Orders
WHERE empid = (
	SELECT E.empid -- to fix "SELECT TOP 1 E.empid"
	FROM HR.Employees AS E
	WHERE E.lastname LIKE N'D%'
);

--No results, no employee with lastname begining with A
SELECT orderid
FROM Sales.Orders
WHERE empid = (
	SELECT E.empid
	FROM HR.Employees AS E
	WHERE E.lastname LIKE N'A%'
);

--With join
SELECT O.orderid
FROM HR.Employees AS E
JOIN Sales.Orders AS O
ON E.empid = O.empid
WHERE E.lastname LIKE N'D%'

-- With Subquery
SELECT O.custid, O.orderid, O.orderdate, O.empid
FROM Sales.Orders AS O
WHERE O.custid IN (
	SELECT C.custid
	FROM Sales.Customers AS C
	WHERE C.country = N'UK'
) AND empid IN (
	SELECT E.empid
	FROM HR.Employees AS E
	WHERE E.country = N'UK'
);

-- With JOIN
SELECT O.custid, O.orderid, O.orderdate, O.empid
FROM Sales.Orders AS O
JOIN Sales.Customers AS C
ON O.custid = C.custid
JOIN HR.Employees AS E
ON O.empid = E.empid
WHERE c.country = N'UK' AND e.country = N'UK'

--Self contained multivalued subquery
--ALL customers WITHOUT orders
SELECT custid, companyname
FROM Sales.Customers
WHERE custid NOT IN (
	SELECT O.custid
	FROM Sales.Orders AS O
);

GO
CREATE VIEW totalSumPerOrder AS
SELECT O.orderid, O.custid, SUM(OD.unitprice*OD.qty) AS Total
FROM Sales.Orders as O
JOIN Sales.OrderDetails as OD
ON O.orderid = OD.orderid
GROUP BY O.orderid, O.custid
GO

SELECT *
FROM totalSumPerOrder
ORDER BY custid DESC

--USE THE VIEW in Correlated subquery
-- we can use OrderValues VIEW instead
SELECT orderid, custid, total,
CAST (100*total/ (
					SELECT SUM (TS2.total)
					FROM totalSumPerOrder AS TS2
					WHERE TS2.custid = TS1.custid
					)
	AS NUMERIC(5,2)) AS pct
FROM totalSumPerOrder AS TS1
ORDER BY custid, orderid DESC

-- Use EXISTS in subquery
SELECT custid, companyname
FROM Sales.Customers AS c
WHERE country = N'Spain'
AND EXISTS (
	SELECT * FROM Sales.Orders AS o
	WHERE o.custid = c.custid
);

-- Use NOT EXISTS in subquery
SELECT custid, companyname
FROM Sales.Customers AS c
WHERE country = N'Spain'
AND NOT EXISTS (
	SELECT * FROM Sales.Orders AS o
	WHERE o.custid = c.custid
);


GO
CREATE VIEW Sales.qtyPerYear
AS
SELECT
  YEAR(o.orderdate) as orderyear,
  SUM(od.qty) as qty
FROM Sales.Orders as o
JOIN Sales.OrderDetails as od
  ON OD.orderid = o.orderid
GROUP BY YEAR(orderdate);
GO

-- Create Subquery with aggregate functions
SELECT orderyear, qty,
(
	SELECT SUM (q2.qty)
	FROM Sales.qtyPerYear AS q2
	WHERE q2.orderyear <= q1.orderyear
) asaggregateQty
FROM Sales.qtyPerYear AS q1
ORDER BY orderyear
=======

