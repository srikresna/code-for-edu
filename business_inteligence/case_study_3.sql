use dw_LegendVehicle;

DROP TABLE IF EXISTS FactSales2;
DROP TABLE IF EXISTS DimProduct2;
DROP TABLE IF EXISTS DimOrder;
DROP TABLE IF EXISTS DimCustomer;
DROP TABLE IF EXISTS DimDate2;


CREATE TABLE DimProduct2 (
    ProductID INT AUTO_INCREMENT PRIMARY KEY,
    ProductCode VARCHAR(100),
    ProductName VARCHAR(255),
    BuyPrice DECIMAL(10,2),
    MSRP DECIMAL(10,2),
    Stock INT,
    updated DATE DEFAULT CURRENT_DATE
);


CREATE TABLE DimDate2 (
    DateID INT AUTO_INCREMENT PRIMARY KEY,
    Date DATE,
    Year INT,
    Month INT,
    Day INT
)

CREATE TABLE DimOrder (
    OrderID INT PRIMARY KEY,
    Status VARCHAR(100),
    updated DATE DEFAULT CURRENT_DATE
);

CREATE TABLE DimCustomer (
    CustomerID INT PRIMARY KEY,
    Country VARCHAR(100),
    updated DATE DEFAULT CURRENT_DATE
);

CREATE TABLE FactSales2 (
    ProductID INT,
    DateID INT,
    -- CustomerID INT,
    Ordered INT,
    SellPrice DECIMAL(10,2)
);

SELECT * FROM DimProduct2;
SELECT * FROM DimOrder;
SELECT * FROM DimCustomer;
SELECT * FROM DimDate2;
SELECT * FROM FactSales2;
