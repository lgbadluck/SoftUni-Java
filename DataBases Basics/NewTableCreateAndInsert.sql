
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