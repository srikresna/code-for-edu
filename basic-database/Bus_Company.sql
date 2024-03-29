CREATE DATABASE Bus_Company;
USE Bus_Company;

CREATE TABLE Route (
    routeID INT PRIMARY KEY,
    routeNumber INT,
    averagePassengersPerDay INT
);

CREATE TABLE Town (
    townID INT PRIMARY KEY,
    townName VARCHAR(255)
);

CREATE TABLE RouteTown (
    routeTownID INT PRIMARY KEY,
    routeID INT,
    townID INT,
    distance INT,
    FOREIGN KEY (routeID) REFERENCES Route(routeID),
    FOREIGN KEY (townID) REFERENCES Town(townID)
);

CREATE TABLE Driver (
    driverID INT PRIMARY KEY,
    employeeNumber INT,
    name VARCHAR(255),
    address VARCHAR(255),
    telephoneNumber VARCHAR(255)
);

CREATE TABLE RouteStage (
    routeStageID INT PRIMARY KEY,
    routeID INT,
    driverID INT,
    capacityUsed INT,
    FOREIGN KEY (routeID) REFERENCES Route(routeID),
    FOREIGN KEY (driverID) REFERENCES Driver(driverID)
);

CREATE TABLE Garage (
    garageID INT PRIMARY KEY,
    townID INT,
    FOREIGN KEY (townID) REFERENCES Town(townID)
);

CREATE TABLE SingleDeckerBus (
    busID INT PRIMARY KEY,
    registrationNumber VARCHAR(255),
    passengerCapacity INT,
    garageID INT,
    FOREIGN KEY (garageID) REFERENCES Garage(garageID)
);

CREATE TABLE DoubleDeckerBus (
    busID INT PRIMARY KEY,
    registrationNumber VARCHAR(255),
    passengerCapacity INT,
    garageID INT,
    FOREIGN KEY (garageID) REFERENCES Garage(garageID)
);
