use dw_LegendVehicle;

CREATE TABLE DimProduct (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(255),
    ProductCategory VARCHAR(255),
    ProductPrice DECIMAL(10,2)
);

CREATE TABLE DimTime (
    TimeID INT PRIMARY KEY,
    Date DATE,
    Month INT,
    Year INT
);

CREATE TABLE DimLocation (
    LocationID INT PRIMARY KEY,
    StoreName VARCHAR(255),
    City VARCHAR(255),
    Country VARCHAR(255)
);

CREATE TABLE FactSales (
    SalesID INT PRIMARY KEY,
    ProductID INT,
    TimeID INT,
    LocationID INT,
    QuantitySold INT,
    TotalRevenue DECIMAL(10,2),
    FOREIGN KEY (ProductID) REFERENCES DimProduct(ProductID),
    FOREIGN KEY (TimeID) REFERENCES DimTime(TimeID),
    FOREIGN KEY (LocationID) REFERENCES DimLocation(LocationID)
);