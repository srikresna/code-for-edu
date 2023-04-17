CREATE DATABASE lesson5;
USE lesson5;

CREATE TABLE tblCountryName (
    CountryID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    CountryName VARCHAR(50) NOT NULL,
    ExportCoffeBags DECIMAL(10, 2) NULL,
    ExportTeaPounds DECIMAL(10, 2) NULL
);

CREATE TABLE tblInventory (
    InventoryID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ItemID INT NOT NULL,
    Caffeinated ENUM('Yes', 'No') NOT NULL,
    Price DECIMAL(10, 2) NOT NULL,
    OnHand DECIMAL(10, 2) NOT NULL
);

CREATE TABLE tblOrder (
    OrderNo INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    OrderDate DATE NOT NULL,
    CustNo INT NOT NULL,
    Wholesale INT NOT NULL,
    SalesRepNo INT NOT NULL
);

CREATE TABLE tblOrderLine (
    OrderID INT NOT NULL,
    InventoryID INT NOT NULL,
    Quantity INT NOT NULL,
    UnitPrice DECIMAL(10, 2) NOT NULL,
    Discount DECIMAL(5, 2) NOT NULL    
);

CREATE TABLE tblEmployeeTitle (
    TitleID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Title VARCHAR(100) NOT NULL
);

CREATE TABLE tblSalesTaxRate (
    StateAbbreviation CHAR(2) NOT NULL PRIMARY KEY,
    StateName VARCHAR(50) NOT NULL,
    TaxRate DECIMAL(5, 2) NOT NULL,
    Population INT NOT NULL,
    LandArea DECIMAL(10, 2) NOT NULL
);

CREATE TABLE tblCustomer (
    CustomerID INT NOT NULL PRIMARY KEY,
    CompanyName VARCHAR(100) NOT NULL,
    Contact VARCHAR(100) NOT NULL,
    Address VARCHAR(100) NOT NULL,
    City VARCHAR(100) NOT NULL,
    State VARCHAR(2) NOT NULL,
    ZipCode VARCHAR(5) NOT NULL,
    PhoneNumber VARCHAR(15) NOT NULL,
    FaxNumber VARCHAR(15) NOT NULL,
    CreditLimit DECIMAL(10, 2) NULL
);

CREATE TABLE tblInventoryDescription (
    ItemID INT NOT NULL PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    BaverageType ENUM('C', 'T') NOT NULL,
    Flavored ENUM('Yes', 'No') NOT NULL,
    CountryID INT NOT NULL,
    Comments TEXT NOT NULL
);

UPDATE tblCountryName
SET ExportCoffeBags = 35000000
WHERE CountryName = 'Angola';
INSERT IGNORE INTO tblCountryName(CountryID,CountryName,ExportCoffeBags,ExportTeaPounds)
VALUES (0, 'n/a or unknown', NULL, NULL),
       (1, 'Afghanistan', NULL, NULL),
       (2, 'Albania', NULL, NULL),
       (3, 'Algeria', NULL, NULL),
       (4, 'American Samoa', NULL, NULL),
       (5, 'Andorra', NULL, NULL),
       (6, 'Angola', 3500000, NULL),
       (7, 'Anguilla', NULL, NULL),
       (8, 'Antarctica', NULL, NULL),
       (9, 'Antigua and Barbuda', NULL, NULL),
       (10, 'Argentina', NULL, NULL);

INSERT INTO tblInventory(InventoryID,ItemID,Caffeinated,Price,OnHand)
VALUES(1101,'116','Yes',CONCAT('$', '8.10'),512),
      (1102,'422','No',CONCAT('$', '5.30'),3190),
      (1103,'440','No',CONCAT('$', '7.70'),-130),
      (1104,'455','No',CONCAT('$', '5.30'),3380),
      (1105,'449','No',CONCAT('$', '7.60'),3300),
      (1106,'224','Yes',CONCAT('$', '7.40'),1130),
      (1107,'113','Yes',CONCAT('$', '8.80'),315),
      (1108,'134','Yes',CONCAT('$', '10.30'),443),
      (1109,'275','Yes',CONCAT('$', '8.00'),354),
      (1110,'353','No',CONCAT('$', '13.70'),354);

INSERT INTO tblOrder(OrderNo,OrderDate,CustNo,Wholesale,SalesRepNo)
VALUES(14606,'2000-12-10','30473',1,'1695'),
	  (14607,'2000-12-16','30581',1,'1528'),
      (14608,'2000-12-17','35249',1,'1528'),
      (14609,'2000-12-18','33974',2,'3700'),
      (14610,'2000-12-19','35201',1,'4112'),
      (14611,'2000-12-21','32350',2,'4029'),
      (14612,'2000-12-21','34666',2,'4058'),
      (14613,'2000-12-22','34458',2,'4012'),
      (14614,'2000-12-22','31932',2,'3692'),
      (14615,'2000-12-16','30744',2,'3700');
      
INSERT INTO tblOrderLine(OrderID,InventoryID,Quantity,UnitPrice,Discount)
VALUES (14606,1123,7,CAST(SUBSTRING('$8.00', 2) AS DECIMAL(10,2)), CAST(SUBSTRING('0.00%', 1, LENGTH('0.00%')-1) AS DECIMAL(10,2))),
        (14607,1101,16,CAST(SUBSTRING('$8.10', 2) AS DECIMAL(10,2)), CAST(SUBSTRING('5.00%', 1, LENGTH('5.00%')-1) AS DECIMAL(10,2))),
        (14608,1188,8,CAST(SUBSTRING('$3.80', 2) AS DECIMAL(10,2)), CAST(SUBSTRING('0.00%', 1, LENGTH('0.00%')-1) AS DECIMAL(10,2))),
        (14608,1207,19,CAST(SUBSTRING('$8.40', 2) AS DECIMAL(10,2)), CAST(SUBSTRING('5.00%', 1, LENGTH('5.00%')-1) AS DECIMAL(10,2))),
        (14608,1221,6,CAST(SUBSTRING('$5.60', 2) AS DECIMAL(10,2)), CAST(SUBSTRING('0.00%', 1, LENGTH('0.00%')-1) AS DECIMAL(10,2))),
        (14609,1128,18,CAST(SUBSTRING('$8.90', 2) AS DECIMAL(10,2)), CAST(SUBSTRING('5.00%', 1, LENGTH('5.00%')-1) AS DECIMAL(10,2))),
        (14609,1114,3,CAST(SUBSTRING('$5.30', 2) AS DECIMAL(10,2)), CAST(SUBSTRING('0.00%', 1, LENGTH('0.00%')-1) AS DECIMAL(10,2))),
        (14609,1215,15,CAST(SUBSTRING('$4.70', 2) AS DECIMAL(10,2)), CAST(SUBSTRING('15.00%', 1, LENGTH('15.00%')-1) AS DECIMAL(10,2))),
        (14609,1221,2,CAST(SUBSTRING('$5.60', 2) AS DECIMAL(10,2)), CAST(SUBSTRING('0.00%', 1, LENGTH('0.00%')-1) AS DECIMAL(10,2))),
        (14610,1133,17,CAST(SUBSTRING('$7.90', 2) AS DECIMAL(10,2)), CAST(SUBSTRING('5.00%', 1, LENGTH('5.00%')-1) AS DECIMAL(10,2))),
        (14610,1159,14,CAST(SUBSTRING('$6.40', 2) AS DECIMAL(10,2)), CAST(SUBSTRING('15.00%', 1, LENGTH('15.00%')-1) AS DECIMAL(10,2))),
        (14610,1190,15,CAST(SUBSTRING('$7.20', 2) AS DECIMAL(10,2)), CAST(SUBSTRING('15.00%', 1, LENGTH('15.00%')-1) AS DECIMAL(10,2))),
        (14610,1241,3,CAST(SUBSTRING('$5.30', 2) AS DECIMAL(10,2)), CAST(SUBSTRING('0.00%', 1, LENGTH('0.00%')-1) AS DECIMAL(10,2))),
        (14610,1244,18,CAST(SUBSTRING('$7.40', 2) AS DECIMAL(10,2)), CAST(SUBSTRING('5.00%', 1, LENGTH('5.00%')-1) AS DECIMAL(10,2))),
        (14611,1110,18,CAST(SUBSTRING('$13.70', 2) AS DECIMAL(10,2)), CAST(SUBSTRING('10.00%', 1, LENGTH('10.00%')-1) AS DECIMAL(10,2))),
        (14611,1168,2,CAST(SUBSTRING('$325.00', 2) AS DECIMAL(10,2)), CAST(SUBSTRING('0.00%', 1, LENGTH('0.00%')-1) AS DECIMAL(10,2)));
       
INSERT INTO tblEmployeeTitle(TitleID,Title)
  VALUES(1,'Sales Trainee'),
		(2,'Sales Associate'),
        (3,'Senior Sales Associate'),
        (4,'Sales Manager'),
        (5,'Senior Sales Manager'),
        (6,'Division Sales Manager'),
        (7,'Regional Manager'),
        (8,'Division Manager'),
        (9,'National Sales Manager');

INSERT IGNORE INTO tblSalesTaxRate(StateAbbreviation, StateName, TaxRate, Population, LandArea)
VALUES
    ('AK', 'Alaska', CAST(SUBSTRING('$0.0', 2) AS DECIMAL(5,2)), 524000, 589757),
    ('AL', 'Alabama', CAST(SUBSTRING('$4.0', 2) AS DECIMAL(5,2)), 4102000, 51609),
    ('AR', 'Arkansas', CAST(SUBSTRING('$4.5', 2) AS DECIMAL(5,2)), 2395000, 53104),
    ('AZ', 'Arizona', CAST(SUBSTRING('$5.0', 2) AS DECIMAL(5,2)), 3489000, 113909),
    ('CA', 'California', CAST(SUBSTRING('$7.25', 2) AS DECIMAL(5,2)), 28314000, 158693),
    ('CO', 'Colorado', CAST(SUBSTRING('$3.0', 2) AS DECIMAL(5,2)), 3301000, 104247),
    ('CT', 'Connecticut', CAST(SUBSTRING('$6.0', 2) AS DECIMAL(5,2)), 3233000, 5009),
    ('DE', 'Delaware', CAST(SUBSTRING('$0.0', 2) AS DECIMAL(5,2)), 660000, 2057),
    ('FL', 'Florida', CAST(SUBSTRING('$6.0', 2) AS DECIMAL(5,2)), 12335000, 58560),
    ('GA', 'Georgia', CAST(SUBSTRING('$4.0', 2) AS DECIMAL(5,2)), 6324105, 58876),
    ('HI', 'Hawaii', CAST(SUBSTRING('$4.0', 2) AS DECIMAL(5,2)), 1098000, 6450),
    ('IA', 'Iowa', CAST(SUBSTRING('$5.0', 2) AS DECIMAL(5,2)), 2834000, 56290),
    ('ID', 'Idaho', CAST(SUBSTRING('$5.0', 2) AS DECIMAL(5,2)), 1003000, 83557),
    ('IL', 'Illinois', CAST(SUBSTRING('$6.25', 2) AS DECIMAL(5,2)), 11614000, 56400)
ON DUPLICATE KEY UPDATE 
    StateName = VALUES(StateName), 
    TaxRate = VALUES(TaxRate), 
    Population = VALUES(Population), 
    LandArea = VALUES(LandArea);


UPDATE tblCustomer
SET CreditLimit = 16600
WHERE City = 'Seguin';
INSERT INTO tblCustomer(CustomerID,CompanyName,Contact,Address,City,State,ZipCode,PhoneNumber,FaxNumber,CreditLimit)
VALUES(30121,'Fairfield Communities Inc.','Best, F. Stanley','2800 Cantrell Road','Little Rock','AR',72202,'(501) 555-6079','(501) 555-6111',NULL),
	  (30125,'Alamo Group Inc.','Maul, Duane A.','1502 East Walnut','Seguin','TX',78155,'(210) 555-1483','(210) 555-1539', 15600.00),
      (30129,'Kiwi International Air Lines Inc.','Rigas, Alan J.','Demishphere Center','Newark','NJ',07114,'(201) 555-1311','(201) 555-1395',NULL),
      (30132,'Republic Bancorp Inc.','Murray, T. Peter','1070 East Main Street','Owosso','MI',48867,'(517) 555-7364','(517) 555-7430',NULL),
      (30136,'Browne Bottling Co.','Shelton, Carl E.','411 First Avenue South','Oklahoma City','OK',73102,'(405) 555-1168','(405) 555-1228',NULL),
      (30139,'Cavco Industries Inc.','Golkin, David','422 Wards Corner Road','Phoenix','AZ',85012,'(602) 555-6141','(602) 555-6232', NULL),
      (35494,'National Intergroup Inc.','Jones, Richard A.','1220 Senlac Drive','Carrollton','TX',75006,'(214) 555-4810','(214 555-4900)',NULL)
ON DUPLICATE KEY UPDATE
    CompanyName = VALUES(CompanyName),
    Contact = VALUES(Contact),
    Address = VALUES(Address),
    State = VALUES(State),
    ZipCode = VALUES(ZipCode),
    PhoneNumber = VALUES(PhoneNumber),
    FaxNumber = VALUES(FaxNumber),
    CreditLimit = VALUES(CreditLimit);
    
INSERT INTO tblInventoryDescription(ItemID,Name,BaverageType,Flavored,CountryID,Comments)
VALUES(134,'China Yunnan','t','No',41,'Black tea; tea from this province in southwestern China was first exported over 1,000 years ago. Originally a source of green tea, Yunnan in recent years has developed a black tea that is lighter and more delicately flavored than some of the traditional South China Congous.'),
(137,'Darjeeling Namring','t','No',82,'Black tea; Assam, known as Darjeeling. Darjeeling is grown in the foothills of the Himalayas at elevations of 1,000 to 6,000 feet. It has a complex aroma with a clear, brisk, and penetrating flavor. Darjeeling is truly one of the finest teas in the world!'),
(140,'Kalgar-India','t','No',82,'Black tea;'),
(146,'Mocha','c','No',151,'Bold, earthy, mild acidity. One of Arabia''s oldest and best known coffees.'),
(176,'New Zealand Sunnyslopes','t','No',127,'Fruit blend Tisanes;'),
(179,'Passion Fruit Blend','t','No',0,'Fruit blend Tisanes;'),
(182,'Columbia Bucaramanga Especial','c','No',42,'Full bodied, medium acidity, nutty undertones; a soft-bean coffee with some of the character of fine Sumatran coffees.'),
(185,'Columbia Supremo','c','No',42,'Full bodied; walnutty flavor. The top of the line for Colombian arabicas.'),
(212,'Pan Fired Green','t','No',0,'Green tea'),
(251,'Lemon Grass','t','No',41,'Herbal Tisanes; cut, sifted'),
(254,'Chamomile Blossom','t','No',56,'Herbal Tisanes; whole flowers. Sweet and complex. Grown on the plains of the Nile valley. The world''s best Chamomile'),
(257,'Hibiscus','t','No',116,'Herbal Tisanes; whole flowers'),
(260,'Espresso Roast','c','No',0,'Intense, hearty, satisfying'),
(263,'Mexican Coatepec','c','No',116,'It has a fine acidity, delicate body, and pleasantly mellow flavor. Fine Mexican coffees such as Coatepec now compare well with those from Central America.'),
(266,'Kona Extra Fancy','c','No',183,'Mild, smooth, and delicately aromatic. A mellow roast. This coffee is processed using the wet method to separate the cherry from the bean. Doing so produces a bright, lively acidity. Grown on the slopes of Mauna Loa on the Kona district of the island of H'),
(269,'Passionfruit with Flowers','t','Yes',93,'Natural flavored tea;');

-- show all tables one by one
SELECT * FROM tblCustomer;
SELECT * FROM tblInventoryDescription;
SELECT * FROM tblInventory;
SELECT * FROM tblOrder;
SELECT * FROM tblOrderLine;
SELECT * FROM tblEmployeeTitle;
SELECT * FROM tblSalesTaxRate;
SELECT * FROM tblCountryName;
