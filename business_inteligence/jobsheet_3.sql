CREATE DATABASE dw_LegendVehicle;
use dw_LegendVehicle;

CREATE TABLE dimDate(
    id_dimDate int not null AUTO_INCREMENT PRIMARY KEY,
    date DATE,
    year INT,
    month INT,
    day INT
);

SELECT * FROM dimDate;

DROP TABLE dimDate;

CREATE TABLE dimEmployees(
    id_dimEmployees int not null AUTO_INCREMENT PRIMARY KEY,
    employeeNumber int,
    firstName varchar(50),
    lastname varchar(50),
    jobtitle varchar(50),
    boss_firstname varchar(50),
    boss_lastname varchar(50),
    updated date DEFAULT CURRENT_DATE
);


SELECT * FROM dimEmployees;

DROP TABLE dimEmployees;


CREATE TABLE FactOmset(
    id_dimEmployees INT,
    id_dimDate INT,
    amount DECIMAL(10,2)
);

SELECT * FROM FactOmset;

DROP TABLE FactOmset;


