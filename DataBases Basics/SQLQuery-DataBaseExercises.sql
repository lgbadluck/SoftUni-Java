SELECT companyname, country
FROM Sales.Customers;

SELECT qty, unitprice, (qty*unitprice)
FROM Sales.OrderDetails;

SELECT DISTINCT country, companyname
FROM Sales.Customers;

SELECT orderid ID, unitprice PRICE, qty Quantity
FROM Sales.OrderDetails;

SELECT shipperid, companyname, phone
FROM Sales.Shippers;

SELECT *
FROM Sales.Shippers;

SELECT productid, productname, categoryid, unitprice
FROM Production.Products;

SELECT productid, productname, unitprice, (unitprice*1.1) as PROMO
FROM Production.Products;

SELECT orderid, productid, unitprice, qty, (unitprice*qty) as FULLPRICE
FROM Sales.OrderDetails;

SELECT DISTINCT custid, shipcity, shipcountry
FROM Sales.Orders;

SELECT empid as employeeid, firstname as given, lastname as surname
FROM HR.Employees;

SELECT productid, productname, unitprice, (unitprice*1.1) as markup
FROM Production.Products;

SELECT empid as ID, lastname as Surname, YEAR(hiredate) as YearHired
FROM HR.Employees;

SELECT SO.orderid, SO.orderdate, SO.empid
FROM Sales.Orders as SO;

SELECT productname, categoryname, description
FROM Production.Products AS PO
INNER JOIN Production.Categories AS PC
ON PO.categoryid = PC.categoryid

SELECT productname, categoryname, description
FROM Production.Products AS PO, Production.Categories AS PC
WHERE PO.categoryid = PC.categoryid

SELECT DISTINCT e.city, e.country
FROM Sales.Customers AS c
JOIN HR.Employees AS e
	ON c.city = e.city AND
	c.country = e.country

SELECT c.custid, c.contactname, o.orderdate, o.shipaddress
FROM Sales.Customers AS C
LEFT OUTER JOIN Sales.Orders AS O
	ON c.custid = o.custid

SELECT c.companyname, o.orderdate
FROM Sales.Customers AS c JOIN Sales.Orders AS o
ON c.custid=o.custid

SELECT c.companyname, o.orderdate
FROM Sales.Customers AS c, Sales.Orders AS o
WHERE c.custid=o.custid;

SELECT c.companyname, o.orderdate
FROM Sales.Customers AS c, Sales.Orders AS o;

SELECT c.companyname, o.orderdate
FROM Sales.Customers AS c JOIN Sales.Orders AS o
ON c.custid=o.custid;

SELECT c.companyname, o.orderdate
FROM Sales.Customers AS c JOIN Sales.Orders AS o;
-- ON c.custid=o.custid

SELECT e.city, e.country
FROM Sales.Customers AS c
JOIN HR.Employees AS e
	ON c.city = e.city AND
	c.country = e.country

SELECT c.custid, c.companyname, o.orderid, o.orderdate, od.productid,
od.qty, p.productname, p.supplierid, p.unitprice, pc.categoryname, hr.firstname
FROM Sales.Customers AS c
JOIN Sales.Orders AS o ON c.custid = o.custid 
JOIN Sales.OrderDetails AS od ON o.orderid = od.orderid
JOIN Production.Products AS p ON od.productid = p.productid
JOIN Production.Categories AS pc ON pc.categoryid = p.categoryid
JOIN HR.Employees AS hr ON o.empid = hr.empid;

SELECT c.custid, c.contactname, o.orderdate, o.shipaddress
FROM Sales.Customers AS C
LEFT OUTER JOIN Sales.Orders AS O
	ON c.custid = o.custid

SELECT e1.firstname, e2.lastname
FROM HR.Employees AS e1
CROSS JOIN HR.Employees AS e2;

SELECT e.empid, e.lastname as empname, e.title, e.mgrid, m.lastname as mgrname
FROM HR.Employees AS e
LEFT JOIN HR.Employees AS m
ON e.mgrid=m.empid
ORDER BY e.title;

SELECT SO.orderid, SO.custid, SO.orderdate
FROM Sales.Orders as SO
ORDER BY so.orderdate;

SELECT SO.orderid, SO.custid, YEAR(SO.orderdate) AS OrderYear
FROM Sales.Orders as SO
ORDER BY so.orderdate;

SELECT SO.orderid, SO.custid, YEAR(SO.orderdate) AS OrderYear
FROM Sales.Orders as SO
ORDER BY so.orderdate DESC; 

SELECT hiredate, firstname, lastname
FROM HR.Employees 
ORDER BY hiredate DESC, lastname ASC; 

SELECT contactname, country
FROM Sales.Customers
WHERE country = 'Spain';

SELECT contactname, country
FROM Sales.Customers
WHERE country IN ('Spain', 'Germany')
ORDER BY country;

SELECT orderid, orderdate
FROM Sales.Orders
WHERE orderdate > '20070203';

SELECT orderid, orderdate
FROM Sales.Orders
WHERE orderdate >= '20070203' AND orderdate < '20080203';

SELECT city
FROM Sales.Customers
WHERE city LIKE 'Paris';

SELECT city
FROM Sales.Customers
WHERE city LIKE 'a%';

SELECT city
FROM Sales.Customers
WHERE city LIKE '%a';

SELECT city
FROM Sales.Customers
WHERE city LIKE '%a%';


-- TOP Clause Syntax
-- Filter only for the first 5 rows
SELECT TOP (5) shipcity,shipregion
FROM Sales.Orders;

-- Filter only for the first 5% of rows
SELECT TOP (5) PERCENT shipcity,shipregion
FROM Sales.Orders;

-- Filter only for the first 10 rows, but if they have duplicates - show them!
SELECT TOP (10) WITH TIES shipcity,shipregion
FROM Sales.Orders
ORDER BY shipcity;

-- FILTERING with ORDER BY and OFFSET-FETCH
-- ORDER BY <order_by_list>
-- OFFSET <offset_value> ROW(S)
-- FETCH FIRST|NEXT <fetch_value> ROW(S) ONLY
-- Retrieve first 50 rows only (alternative to TOP)
SELECT orderid, custid, orderdate
FROM Sales.Orders
ORDER BY orderdate, orderid DESC
OFFSET 0 ROWS FETCH FIRST 50 ROWS ONLY;

-- Retrieve rows 51-100
SELECT orderid, custid, orderdate
FROM Sales.Orders
ORDER BY orderdate, orderid DESC
OFFSET 50 ROWS FETCH FIRST 50 ROWS ONLY;

--OFFSET and FETCH can e cariables though
DECLARE @offval INT
SET @offval = 50
DECLARE @fetchval INT
SET @fetchval = 150
-- Retrieve rows 51-151
SELECT orderid, custid, empid, orderdate
FROM Sales.Orders
ORDER BY orderdate, orderid DESC
OFFSET @offval ROWS FETCH FIRST @fetchval ROWS ONLY;

--Handling NULL in Queries
SELECT custid,city,region,country
FROM Sales.Customers
WHERE region IS NOT NULL;

--31 rows
SELECT COUNT(region)
FROM Sales.Customers;

--91 rows
SELECT region
FROM Sales.Customers
ORDER BY region DESC;

--interesting, huh? so... 28records here
SELECT custid, country, region, city
FROM Sales.Customers
where region <> N'WA';

--3records here = 31 records (same as the COUNT)
SELECT custid, country, region, city
FROM Sales.Customers
where region = N'WA';

--where are all other records though? -- 88 records
SELECT custid, country, region, city
FROM Sales.Customers
where region <> N'WA' OR region is NULL;

-- Working with Aggregate Functions
--SELECT AVG(unitprice) AS avg_price
--MIN(qty) AS min_qty
--MAX(discount) AS max_discount
--FROM Sales.OrderDetails


--ERROR no GROUP BY
SELECT orderid, productid, AVG(unitprice), MAX(qty), MAX(discount)
FROM Sales.OrderDetails


-- Select and execute the following query to show
-- The use of aggreagates with non-numeric data types:
SELECT MIN(companyname) AS first_cust, MAX(companyname) as last_cust --, AVG(companyname) as avg_cust -> This will give error for non-numeric types
FROM Sales.Customers;

SELECT MIN(orderdate) AS earliest, MAX(orderdate) as latest --, AVG(orderdate) as avg_date -- -> This will give error for non-numeric types
FROM Sales.Orders;

SELECT shippeddate
FROM Sales.Orders
ORDER BY shippeddate;

SELECT 
MIN(shippeddate) as earliest,
MAX(shippeddate) as latest,
COUNT(shippeddate) as [count_shippeddate],
COUNT(*) as COUNT_all
FROM Sales.Orders;


-- Using GROUP BY Clause
--SELECT <select_list>
--FROM <table_source>
--WHERE <search_condition>
--GROUP BY <group_by_list>;

SELECT empid, COUNT(*) AS cnt
FROM Sales.Orders
GROUP BY empid;

SELECT custid, COUNT(*) AS cnt
FROM Sales.Orders
GROUP BY custid
ORDER BY cnt DESC

SELECT productid, MAX(qty) AS largest_order
FROM Sales.OrderDetails
GROUP BY productid
ORDER BY largest_order DESC

--Filtering Grouped Data with HAVING
-- HAVING = WHERE, but for GROUP BY
SELECT custid, COUNT(*) AS cnt
FROM Sales.Orders
GROUP BY custid
HAVING COUNT(*)>10

SELECT c.contactname, c.custid, COUNT(*) AS cnt
FROM Sales.Customers AS c
JOIN Sales.Orders AS o ON c.custid = o.custid
GROUP BY c.custid, c.contactname
HAVING COUNT(*) > 1

SELECT p.productname, p.productid, COUNT(*) AS cnt
FROM Production.Products AS p
JOIN Sales.OrderDetails AS o ON p.productid = o.productid
GROUP BY p.productid, p.productname
HAVING COUNT(*) >= 10
ORDER BY cnt DESC


SELECT empid, COUNT(*) AS cnt
FROM Sales.Orders
GROUP BY empid
ORDER BY cnt DESC

SELECT custid, YEAR(orderdate) AS [year], COUNT(*) AS cnt
FROM Sales.Orders
WHERE empid = 4
GROUP BY custid, YEAR(orderdate)
ORDER BY cnt DESC

SELECT COUNT(*) AS cnt, AVG(qty) AS [avg_qty]
FROM Production.Products AS p
JOIN Sales.OrderDetails AS od ON p.productid = od.productid
WHERE od.qty > 20
GROUP BY p.categoryid


SELECT COUNT(*) AS cnt, AVG(qty) AS [avg_qty]
FROM Production.Products AS p
JOIN Sales.OrderDetails AS od ON p.productid = od.productid
GROUP BY p.categoryid
HAVING AVG(qty) > 20

SELECT empid, COUNT(*) AS cnt
FROM Sales.Orders
GROUP BY empid 
--ORDER BY empid

SELECT empid, COUNT(*) AS cnt
FROM Sales.Orders
GROUP BY empid WITH ROLLUP

SELECT empid, YEAR(orderdate) as YR, COUNT(*) AS cnt
FROM Sales.Orders
GROUP BY empid, YEAR(orderdate) WITH ROLLUP

SELECT empid, YEAR(orderdate) as YR, COUNT(*) AS cnt
FROM Sales.Orders
GROUP BY empid, YEAR(orderdate) WITH CUBE

SELECT empid, YEAR(orderdate) as YR, COUNT(*) AS cnt
FROM Sales.Orders
GROUP BY GROUPING SETS (	empid,YEAR(orderdate),	());

SELECT empid, YEAR(orderdate) as YR, COUNT(*) AS cnt
FROM Sales.Orders
GROUP BY GROUPING SETS (
	(empid,YEAR(orderdate)),
	(empid),
	(YEAR(orderdate)),
	());

	--WORKING WITH DATAYPES
SELECT 1 + '2' AS result
SELECT '1' + 2 AS result
SELECT '1' + '2' AS result
SELECT 1 + 2 AS result

--THIS WILL FAIL
SELECT 1 + 'abc' AS result

SELECT CAST(12 AS VARCHAR(10)) + 'abc' AS result
SELECT CONVERT(VARCHAR(10), 12) + 'abc' AS result

--TRY_CAST (expression AS data_type [(length)] )
SELECT TRY_CAST ('13/31/2012' AS date) AS YearEndDate;
SELECT TRY_CONVERT (date, '13/31/2012', 101) AS YearEndDateUS;

DECLARE @dtvalue DATETIME
SET @dtvalue = '2007-05-08 12:35:29.123';
SELECT CONVERT (varchar(16), @dtvalue, 120)

SELECT PARSE('12/31/2012' AS date) AS YearEndDateUS;
--ERROR --SELECT PARSE('31/12/2012' AS date USING 'en-US') AS YearEndDate;
SELECT PARSE('31/12/2012' AS date USING 'en-GB') AS YearEndDateUK;

SELECT TRY_PARSE('12/31/2012' AS date) AS YearEndDateUS;
SELECT TRY_PARSE('31/12/2012' AS date USING 'en-US') AS YearEndDate; --NULL not error like when using PARSE directly
SELECT TRY_PARSE('31/12/2012' AS date USING 'en-GB') AS YearEndDateUK;

SELECT empid, lastname, firstname, firstname + N' ' + lastname AS fullname --N is for National UTF encode of the string in ' ' (space in the example)
FROM HR.Employees


--ISDATE
DECLARE @Name nvarchar(50) = 'XY14822'
DECLARE @DiscontinuedDate datetime = '12/4/2012'
SELECT ISDATE(@Name) AS NameISDATE,
	ISDATE(@DiscontinuedDate) AS DiscontinuedDateISDATE;

--ISNUMERIC
DECLARE @Name nvarchar(50) = 'XY14822'
DECLARE @DiscontinuedDate datetime = '12/4/2012'
DECLARE @DayToManufacture int = 100
SELECT ISNUMERIC(@Name) AS NameIISNUMERIC,
	ISNUMERIC(@DiscontinuedDate) AS DiscontinuedDateISNUMERIC,
	ISNUMERIC(@DayToManufacture) AS DaysToManucatureISNUMERIC;

--Use string functions in a query
SELECT SUBSTRING('Microsoft SQL Server',11,3);
SELECT LEFT('Microsoft SQL Server',9);
SELECT RIGHT('Microsoft SQL Server',6);
SELECT LEN('Microsoft SQL Server                '); --20
SELECT DATALENGTH('Microsoft SQL Server       '); --25 Why is it different from LEN? (counts ' ')
SELECT CHARINDEX('SQL','Microsoft SQL Server'); --try with %SQL% before showing PATINDEX
SELECT PATINDEX('%SQL%','Microsoft SQL Server');
SELECT REPLACE('Microsoft SQL Server Denali', 'Denali', '2012');
SELECT UPPER('Microsoft SQL Server');
SELECT LOWER('Microsoft SQL Server');
SELECT REPLICATE('MARKETBRIDGE ', 5);

--Date and Time DATA TYPES
--Display various current date and time functions

SELECT
	GETDATE()				AS [GetDate],
	CURRENT_TIMESTAMP		AS [Current_Timestamp],
	GETUTCDATE()			AS [GetUTCDate],
	SYSDATETIME()			AS [SYSDateTime],
	SYSUTCDATETIME()		AS [SYSUTCDateTime],
	SYSDATETIMEOFFSET()		AS [SYSDateTimeOffset];

--Display Various functions which return a portion of date or time
SELECT DATENAME(year, '20120212');
SELECT DAY('20120212') AS [Day],
		MONTH('20120212') AS [Month],
		YEAR('20120212') AS [Year];

--Display various functions which return a date or time from parts
SELECT DATETIMEFROMPARTS(2012,2,12,8,30,0,0) AS Result; --7
SELECT DATETIME2FROMPARTS(2012,2,12,8,30,0,0,0) AS Result; --8

--Demonstrate DATEDIFF with this to show difference in precision:
--Shows the difference between two dates (measure, start, end)
SELECT DATEDIFF(millisecond, GETDATE(), SYSDATETIME());
SELECT DATEDIFF(day, '2008-06-05', '2008-08-05') AS DifferenceInDays

--Use ISDATE to check validity of inputs:
SELECT ISDATE('20120212'); --is valid
SELECT ISDATE('20120230'); --February doesn't have 30 days

DECLARE @STARTDATE DATETIME = GETDATE()
SELECT EOMONTH (@STARTDATE) AS ThisMonthLastDay
SELECT EOMONTH (@STARTDATE, 1) AS NEXTMonthLastDay
SELECT EOMONTH (@STARTDATE, -1) AS PREVIOUSMonthLastDay

