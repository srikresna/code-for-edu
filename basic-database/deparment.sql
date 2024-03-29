CREATE DATABASE DEPARTMENT;
USE DEPARTMENT;

CREATE TABLE EMPLOYEE(
	EmpId char(5),
	FirstName char(25),
    MiddleName char(25),
    Gender char(1),
    BirthDate char(10)
);

INSERT INTO EMPLOYEE VALUES ('1', 'King', 'Kon', 'M', '11/1/1960');
INSERT INTO EMPLOYEE VALUES ('2', 'May', 'Dem', 'F', '10/10/1970');
INSERT INTO EMPLOYEE VALUES ('3', 'Pete', 'Cap', 'M', '5/5/1980');
INSERT INTO EMPLOYEE VALUES ('4', 'Joyce', 'Sun', 'F', '11/10/1980');
INSERT INTO EMPLOYEE VALUES ('5', 'Joe', 'Uno', 'M', '1/1/1975');
INSERT INTO EMPLOYEE VALUES ('6', 'MJ', 'John', 'M', '10/30/1981');
INSERT INTO EMPLOYEE VALUES ('7', 'KJ', 'Zinugan', 'M', '6/27/1979');
INSERT INTO EMPLOYEE VALUES ('8', 'July', 'Nur', 'F', '5/26/1980');
INSERT INTO EMPLOYEE VALUES ('9', 'Annie', 'Maxx', 'F', '4/28/1979');
INSERT INTO EMPLOYEE VALUES ('10', 'Carla', 'Met', 'F', '3/29/1980');
INSERT INTO EMPLOYEE VALUES ('11', 'Fredo', 'Cur', 'M', '2/29/1980');

SELECT FirstName FROM EMPLOYEE;

SELECT FirstName, MiddleName FROM EMPLOYEE;

SELECT FirstName FROM EMPLOYEE WHERE FirstName = 'King';

SELECT * FROM EMPLOYEE WHERE BirthDate LIKE '%1980';

SELECT * FROM EMPLOYEE WHERE BirthDate LIKE '1%';

SELECT * FROM EMPLOYEE WHERE BirthDate LIKE '%1980' AND Gender LIKE 'M';

SELECT * FROM EMPLOYEE;

SELECT FirstName FROM EMPLOYEE WHERE Gender = 'F';

