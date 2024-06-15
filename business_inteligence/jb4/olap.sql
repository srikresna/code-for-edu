CREATE DATABASE dw_OzaiEnterprise;
use dw_OzaiEnterprise;

CREATE TABLE dimDate(
    id_dimDate int not null AUTO_INCREMENT PRIMARY KEY,
    date date,
    year int,
    month int,
    day int
);

SELECT * FROM dimDate;