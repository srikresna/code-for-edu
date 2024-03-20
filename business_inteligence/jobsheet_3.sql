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

