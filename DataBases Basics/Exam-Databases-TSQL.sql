-- 1).    От таблицата с продажбите извлечете името на продукта, неговата цена и 15% великденска отстъпка.
--        Името на колата с информацията за цената да е "Current Price", а на тази с отстъпката да е "Easter Discount"
SELECT productname, unitprice AS [Current Price], (unitprice*0.85) as [Easter Discount]
FROM Production.Products;

-- 2).    От таблицата със служителите извлечете двете имена на служителя и двете имена на служителите на които той е мениджър.
--        Колоните с имената на подчинения да са: "empfname" и "emplname"
SELECT m.firstname, m.lastname, e.firstname as empfname, e.lastname as emplname
FROM HR.Employees AS e
JOIN HR.Employees AS m
ON m.empid=e.mgrid
ORDER BY m.empid ASC

-- 3).    От таблицата с информацията за продажбите извлечете сумата на продажбите групирани по служител и общата сума
--        на продажбите  направени през септември 2006 година
SELECT o.empid, COUNT(od.unitprice*od.qty) AS total_sales_emp,YEAR(orderdate) as Year
FROM Sales.Orders AS o
JOIN Sales.OrderDetails AS od
ON o.orderid = od.orderid
GROUP BY YEAR(orderdate), o.empid
HAVING YEAR(orderdate) = '2006'

-- 4).    Използвайки променливи @pagestart и @pageresults направете заявка за извличане на информация за име и пълен адрес 
--        на доставчик от таблицата с доставчици. Информацията за пълния адрес трябва да бъде съставена от данните от колоните: 
--        "country, region, city, postalcode, address" и да е с име "FullAddress". Заявката да показва @pageresults резултати 
--        започвайки от @pagestart, които да са подредени по азбучен ред по име на доставчика
DECLARE @pagestart INT
SET @pagestart = 6
DECLARE @pageresults INT
SET @pageresults = 20
SELECT companyname, CONCAT(country, ', ', COALESCE(region + ', ', ' '), city,', ', postalcode,', ', address) AS FullAddress
FROM Production.Suppliers
ORDER BY companyname ASC
OFFSET @pagestart ROWS FETCH FIRST @pageresults ROWS ONLY;

-- 5).    От таблиците с продажбите извлечете средноаритментичната сума на продажбите по клиент
--	
SELECT
    o.custid,
    SUM(od.unitprice * od.qty) AS TotalSalesAmount,
    AVG(od.unitprice * od.qty) AS AverageSalesAmount
FROM Sales.Orders AS o
INNER JOIN Sales.OrderDetails AS od 
ON o.orderid = od.orderid
GROUP BY o.custid
ORDER BY o.custid;

-- 6).    Намерете продажбите, които са направени в последния ден от месеца.
--         *може да се използват функциите EOMONTH() или DATEADD()
SELECT orderid, orderdate AS LastDayOfMonth
FROM Sales.Orders
WHERE OrderDate = EOMONTH(orderdate)
ORDER BY orderdate;
