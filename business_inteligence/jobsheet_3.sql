CREATE DATABASE dw_LegendVehicle;
CREATE DATABASE test;
use test

use dw_LegendVehicle;

CREATE TABLE dimDate(
    id_dimDate int not null AUTO_INCREMENT PRIMARY KEY,
    date DATE,
    year INT,
    month INT,
    day INT
);

SELECT * FROM dimDate;

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

DROP TABLE dimEmployees;

SELECT * FROM dimEmployees;

DROP TABLE dimEmployees;

CREATE TABLE FactOmset(
    id_dimEmployees INT NOT NULL,
    id_dimDate INT NOT NULL,
    amount DECIMAL(10,2) NOT NULL
);

SELECT * FROM FactOmset;