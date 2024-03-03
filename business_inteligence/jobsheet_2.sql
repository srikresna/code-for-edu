-- USE classicmodels;

-- -- PRAKTIKUM 1
SELECT * FROM employees;
-- SELECT * FROM customers;
-- SELECT * FROM orders;
-- SELECT * FROM products;
-- SELECT * FROM orderdetails;
-- SELECT * FROM payments;
-- SELECT * FROM productlines;
-- SELECT * FROM offices;

SELECT *
FROM employees employe, employees manager, customers cust
WHERE employe.reportsTo=manager.employeeNumber
AND employe.employeeNumber=cust.salesRepEmployeeNumber;

-- query manager dan staff saling terhubung
SELECT manager.employeeNumber as id_manager,
CONCAT(manager.firstName," ",manager.lastName) as Manager,
employee.employeeNumber as id_staff, 
CONCAT(employee.firstName," ",employee.lastName) as staff 
FROM employees employee, employees manager 
WHERE employee.reportsTo=manager.employeeNumber 
ORDER BY manager.firstName; 

--  jumlah customer dari setiap staff.
SELECT manager.employeeNumber as id_manager,
concat(manager.firstName," ",manager.lastName) as Manager,
employee.employeeNumber as id_staff, concat(employee.firstName," ",employee.lastName) as staff, 
count(cust.customerNumber) as total_cust 
FROM employees employee 
JOIN employees manager ON employee.reportsTo = manager.employeeNumber
left join customers cust on employee.employeeNumber=cust.salesRepEmployeeNumber 
GROUP BY employee.employeeNumber 
ORDER BY manager.firstName; 

-- Siapakah staff dengan hirarki paling bawah yang berprestasi dilihat dari jumlah customer terbanyak?
SELECT manager.employeeNumber as id_manager,
concat(manager.firstName," ",manager.lastName) as Manager,
employee.employeeNumber as id_staff, concat(employee.firstName," ",employee.lastName) as staff,
count(cust.customerNumber) as total_cust
FROM employees employee
JOIN employees manager ON employee.reportsTo = manager.employeeNumber
left join customers cust on employee.employeeNumber=cust.salesRepEmployeeNumber
GROUP BY employee.employeeNumber
ORDER BY total_cust DESC
LIMIT 3;
-- ANSWER : Pamela Castillo merupakan staff dengan hirarki paling bawah yang berprestasi dilihat dari jumlah customer terbanyak.
-- Jika KPI atasan dihitung dari customer yang dimilikinya dijumlah dengan customer dari staff dibawahnya, urutkan ranking prestasi keseluruhan pegawai beserta keterangan jumlah customer yang dimilikinya!
SELECT manager.employeeNumber as id_manager,
concat(manager.firstName," ",manager.lastName) as Manager,
count(cust.customerNumber) as total_cust
FROM employees employee
JOIN employees manager ON employee.reportsTo = manager.employeeNumber
left join customers cust on employee.employeeNumber=cust.salesRepEmployeeNumber
GROUP BY manager.employeeNumber
ORDER BY total_cust DESC;
-- ANSWER : Gerard Bondur - Anthony Bow - William Patterson - Mami Nishi  

-- Analisa kembali data LegendVehicle untuk mendapatkan ranking pegawai berdasarkan KPI "Jumlah omset yang didapat". Urutkan ranking pegawai beserta keterangan dana yang didapat!
SELECT manager.employeeNumber as id_manager,
concat(manager.firstName," ",manager.lastName) as Manager,
employee.employeeNumber as id_staff, concat(employee.firstName," ",employee.lastName) as staff,
sum(pay.amount) as total_omset
FROM employees employee
JOIN employees manager ON employee.reportsTo = manager.employeeNumber
left join customers cust on employee.employeeNumber=cust.salesRepEmployeeNumber
left join payments pay on cust.customerNumber=pay.customerNumber
GROUP BY employee.employeeNumber
ORDER BY total_omset DESC;
-- ANSWER : TOP 5 -> Gerard Hernandez - Leslie Jennings - Pamela Castillo - Larry Bott - Barry Jones

-- Jika KPI yang pertama merupakan "Jumlah customer yang bertransaksi" sedangkan KPI yang kedua "Jumlah omset yang didapat". Maka, berapakah jumlah field yang dibutuhkan untuk mendapatkan informasi tersebut?
-- ANSWER : jumlah customer yang bertransaksi membutuhkan 2 field, yaitu employeeNumber dan customerNumber. Karena 
--           employeeNumber merupakan foreign key dari tabel employees, dan customerNumber merupakan foreign key dari tabel customers.
--           Jumlah omset yang didapat membutuhkan 3 field, yaitu employeeNumber, customerNumber, dan amount. Karena
--           employeeNumber merupakan foreign key dari tabel employees, customerNumber merupakan foreign key dari tabel customers, dan amount merupakan field dari tabel payments.

-- Buatlah report pertahun untuk KPI "Jumlah omset yang didapat" pada Foon Yue Tseng dan Pamela Castillo. Serta gambarkan grafiknya (grafik garis).
SELECT year(pay.paymentDate) as tahun,
sum(pay.amount) as total_omset
FROM payments pay
JOIN customers cust ON pay.customerNumber=cust.customerNumber
JOIN employees employee ON cust.salesRepEmployeeNumber=employee.employeeNumber
WHERE employee.firstName="Foon Yue" AND employee.lastName="Tseng"
GROUP BY tahun;

SELECT year(pay.paymentDate) as tahun,
sum(pay.amount) as total_omset
FROM payments pay
JOIN customers cust ON pay.customerNumber=cust.customerNumber
JOIN employees employee ON cust.salesRepEmployeeNumber=employee.employeeNumber
WHERE employee.firstName="Pamela" AND employee.lastName="Castillo"
GROUP BY tahun;