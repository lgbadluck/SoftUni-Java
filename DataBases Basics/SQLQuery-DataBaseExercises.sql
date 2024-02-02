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
SET @fetchval = 100
-- Retrieve rows 51-151
SELECT orderid, custid, empid, orderdate
FROM Sales.Orders
ORDER BY orderdate, orderid DESC
OFFSET @offval ROWS FETCH FIRST @fetchval ROWS ONLY;

