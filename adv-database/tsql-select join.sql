USE [TSQL]
GO

SELECT [custid]
        ,[companyname]
        ,[contactname]
        ,[contacttitle]
        ,[address]
        ,[city]
        ,[region]
        ,[postalcode]
        ,[country]
        ,[phone]
        ,[fax]
FROM [Sales].[Customers]
GO

SELECT * FROM Sales.Customers;

SELECT
custid, companyname, contactname, contacttitle, address, city, region, postalcode,
country, phone, fax
FROM Sales.Customers;

SELECT *
FROM
[Sales].[Customers];

SELECT DISTINCT
country
FROM Sales.Customers;

SELECT
c.contactname, c.contacttitle
FROM Sales.Customers AS c;

SELECT
c.contactname AS Name, c.contacttitle AS Title, c.companyname AS [Company Name]
FROM Sales.Customers AS c;

SELECT
p.categoryid, p.productname
FROM Production.Products AS p;

SELECT
p.categoryid, p.productname,
CASE
        WHEN p.categoryid = 1 THEN 'Beverages'
        WHEN p.categoryid = 2 THEN 'Condiments'
        WHEN p.categoryid = 3 THEN 'Confections'
        WHEN p.categoryid = 4 THEN 'Dairy Products'
        WHEN p.categoryid = 5 THEN 'Grains/Cereals'
        WHEN p.categoryid = 6 THEN 'Meat/Poultry'
        WHEN p.categoryid = 7 THEN 'Produce'
        WHEN p.categoryid = 8 THEN 'Seafood'
        ELSE 'Other'
END AS CategoryName
FROM Production.Products AS p;

SELECT
p.categoryid, p.productname,
CASE
        WHEN p.categoryid = 1 THEN 'Beverages'
        WHEN p.categoryid = 2 THEN 'Condiments'
        WHEN p.categoryid = 3 THEN 'Confections'
        WHEN p.categoryid = 4 THEN 'Dairy Products'
        WHEN p.categoryid = 5 THEN 'Grains/Cereals'
        WHEN p.categoryid = 6 THEN 'Meat/Poultry'
        WHEN p.categoryid = 7 THEN 'Produce'
        WHEN p.categoryid = 8 THEN 'Seafood'
        ELSE 'Other'
END AS CategoryName,
CASE
        WHEN p.categoryid IN (1, 7, 8) THEN 'Campaign Products'
        ELSE 'Non-Campaign Products'
END AS iscampaign
FROM Production.Products AS p;



SELECT
p.categoryid, p.productname,
CASE
    WHEN p.categoryid = 1 THEN 'Beverages'
    WHEN p.categoryid = 2 THEN 'Condiments'
    WHEN p.categoryid = 3 THEN 'Confections'
    WHEN p.categoryid = 4 THEN 'Dairy Products'
    WHEN p.categoryid = 5 THEN 'Grains/Cereals'
    WHEN p.categoryid = 6 THEN 'Meat/Poultry'
    WHEN p.categoryid = 7 THEN 'Produce'
    WHEN p.categoryid = 8 THEN 'Seafood'
    ELSE 'Other'
END AS CategoryName,
CASE
    WHEN p.categoryid IN (1, 7, 8) THEN 'Campaign Products'
    ELSE 'Non-Campaign Products'
END AS iscampaign
FROM Production.Products AS p
WHERE p.categoryid = 8;

SELECT
e.firstname AS FIRST_NAME, e.lastname AS LAST_NAME, e.city AS CITY, e.country AS COUNTRY
FROM HR.Employees AS e
WHERE e.country = 'USA' AND e.city = 'Seattle';

-- PRAKTIKUM BAGIAN 5
SELECT
custid, companyname, contactname, address, city, country, phone
FROM Sales.Customers
WHERE
country IN ('Brazil', 'UK', 'USA');

SELECT
c.custid, c.companyname, o.orderid
FROM Sales.Customers AS c
LEFT OUTER JOIN Sales.Orders AS o ON c.custid = o.custid AND c.city = 'Paris';

SELECT
c.custid, c.companyname, o.orderid
FROM Sales.Customers AS c
LEFT OUTER JOIN Sales.Orders AS o ON c.custid = o.custid AND c.city = 'Paris'
WHERE c.city = 'London' OR c.city = 'Berlin';

-- PRAKTIKUM BAGIAN 6
SELECT c.custid, c.custname, o.orderid, o.orderdate
FROM Sales.Customers AS c
INNER JOIN Sales.Orders AS o ON c.custid = o.custid
WHERE o.orderdate >= '2008-04-01'
ORDER BY o.orderdate DESC, c.custid ASC;

SELECT
e.empid, e.lastname, e.firstname, e.title, e.mgrid,
m.lastname AS mgrlastname, m.firstname AS mgrfirstname
FROM HR.Employees AS e
INNER JOIN HR.Employees AS m ON e.mgrid = m.empid
WHERE
m.lastname = N'Buck';

SELECT
e.empid, e.lastname, e.firstname, e.title, e.mgrid,
m.lastname AS mgrlastname, m.firstname AS mgrfirstname
FROM HR.Employees AS e
INNER JOIN HR.Employees AS m ON e.mgrid = m.empid
ORDER BY m.firstname, e.firstname;


SELECT
e.empid, e.lastname, e.firstname, e.title, e.mgrid,
m.lastname AS mgrlastname, m.firstname AS mgrfirstname
FROM HR.Employees AS e
INNER JOIN HR.Employees AS m ON e.mgrid = m.empid
ORDER BY mgrlastname, mgrfirstname;

-- PRAKTIKUM BAGIAN 7
SELECT
p.productname, p.unitprice
FROM Production.Products AS p
ORDER BY p.unitprice DESC;

SELECT TOP 8
p.productname, p.unitprice
FROM Production.Products AS p
ORDER BY p.unitprice DESC;

-- PRAKTIKUM BAGIAN 8
SELECT TOP 20
s.custid, s.orderid, s.orderdate 
FROM Sales.Orders AS s
ORDER BY s.orderdate, s.orderid;

SELECT
s.custid, s.orderid, s.orderdate 
FROM Sales.Orders AS s
ORDER BY s.orderdate, s.orderid
OFFSET 20 ROWS
FETCH NEXT 20 ROWS ONLY;

-- PRAKTIKUM BAGIAN 9
SELECT
productid,
productname
FROM
Production.Products
WHERE
categoryid = 4;

SELECT
P.productid,
P.productname
FROM
Production.Products P INNER JOIN Sales.OrderDetails OD
ON
P.productid = OD.productid
GROUP BY
P.productid, P.productname
HAVING
SUM(OD.qty * OD.unitprice) > 50000;

SELECT productid, productname
FROM Production.Products
WHERE categoryid = 4
UNION
SELECT P.productid, P.productname
FROM Production.Products P
INNER JOIN Sales.OrderDetails OD ON P.productid = OD.productid
GROUP BY P.productid, P.productname
HAVING SUM(OD.qty * OD.unitprice) > 50000;


SELECT TOP 10
c.custid, c.companyname, o.orderid, o.orderdate
FROM Sales.Customers AS c
UNION
SELECT TOP 10
c.custid, c.companyname, o.orderid, o.orderdate
FROM Sales.Customers AS c
INNER JOIN Sales.Orders AS o ON c.custid = o.custid
ORDER BY orderdate ASC, orderdate DESC;

-- Tuliskan SQL untuk menampilkan 10 pelanggan yang membeli paling awal serta 10 pelanggan yang membeli paling akhir.
-- Buat dahulu query untuk menampilkan data pelanggan yang membeli paling awal dan lalu UNION kan dengan paling akhir
-- Lakukan INNER JOIN antara tabel 'Sales.Customers' & 'Sales.Order'

SELECT TOP 10
c.custid, c.companyname, o.orderid, o.orderdate
FROM Sales.Customers AS c
INNER JOIN Sales.Orders AS o ON c.custid = o.custid
ORDER BY o.orderdate ASC;

SELECT TOP 10
c.custid, c.companyname, o.orderid, o.orderdate
FROM Sales.Customers AS c
INNER JOIN Sales.Orders AS o ON c.custid = o.custid
ORDER BY o.orderdate DESC;

