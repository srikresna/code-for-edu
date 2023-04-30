CREATE DATABASE Company_Database;
USE Company_Database;

CREATE TABLE EMPLOYEE (
    Fname VARCHAR(255) NOT NULL,
    Lname VARCHAR(255) NOT NULL,
    Ssn INT NOT NULL,
    Bdata DATE NOT NULL,
    Address VARCHAR(255) NOT NULL,
    Salary INT NOT NULL,
    Dno INT NOT NULL
);

CREATE TABLE PROJECT (
    Pname VARCHAR(255) NOT NULL,
    Plocation VARCHAR(255) NOT NULL,
    Pnumber INT NOT NULL,
    Dnum INT NOT NULL
);

CREATE TABLE DEPENDENT (
    Essn INT NOT NULL,
    Dependent_name VARCHAR(255) NOT NULL,
    Relationship VARCHAR(255) NOT NULL
);

CREATE TABLE DEPARTMENT (
    Dname VARCHAR(255) NOT NULL,
    Dnumber INT NOT NULL,
    Mgr_ssn INT NOT NULL,
    Mgr_start_date DATE NOT NULL
);

INSERT INTO EMPLOYEE (Fname, Lname, Ssn, Bdata, Address, Salary, Dno) 
VALUES('John', 'Smith', 123456789, '1965-01-09', 'Fondren, Houston, TX', 30000, 5),
      ('Franklin', 'Wong', '333445555', '1955-12-08', 'Voss, Houston, TX', 40000, 5),
      ('Alicia', 'Zelaya', '999887777', '1968-01-19', 'Castle, Spring, TX', 25000, 4),
      ('Jennifer', 'Wallace', '987654321', '1941-06-20', 'Berry, Bellaire, TX', 43000, 4),
      ('Ramesh', 'Narayan', '666884444', '1962-09-15', 'Fire Oak, Humble, TX', 38000, 5),
      ('James', 'Borg', '888665555', '1937-11-10', 'Stone, Houston, TX', 55000, 1);

INSERT INTO PROJECT (Pname, Plocation, Pnumber, Dnum)
VALUES('Computerization', 'Stafford', 1, 5),
      ('Reorganization', 'Houston', 10, 1),
      ('Newbenefits', 'Sugarland', 20, 4);

INSERT INTO DEPENDENT (Essn, Dependent_name, Relationship)
VALUES(333445555, 'Alice', 'Daughter'),
      (333445555, 'Joy', 'Spouse'),
      (333445555, 'Theodore', 'Son'),
      (987654321, 'Abner', 'Spouse'),
      (123456789, 'Michael', 'Son'),
      (123456789, 'Alice', 'Daughter'),
      (123456789, 'Elizabeth', 'Spouse');

INSERT INTO DEPARTMENT (Dname, Dnumber, Mgr_ssn, Mgr_start_date)
VALUES('Research', 5, 333445555, '1988-04-05'),
      ('Administration', 4, 987654321, '1995-01-01'),
      ('Headquarters', 1, 888665555, '1981-06-19');