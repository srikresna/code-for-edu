use TSQL;
--1
/*Tulislah	 sebuah	 query	 SELECT	 untuk	 menampilkan kolom	 
productid,	 productname, supplierid,	unitprice dan	kolom	discontinued 

dari	tabel	Productions.Product Kemudian	 filter	 hasilnya	 agar	 hanya	 menampilkan	 produk	 yang	
ada	 di dalam kategori	 Beverages	saja	(categoryid	=	1)*/

SELECT
productid, productname, supplierid, unitprice, discontinued
FROM Production.Products
WHERE categoryid = 1;

--2
/*
Modifikasilah	kode	T-SQL	dari	no	2	di	atas	dengan	menambahkan	kode	T-SQL	berikut	
(letakkan	sebelum	query	SELECT)
*/
CREATE VIEW Production.ProductsBeverages AS
SELECT
productid, productname, supplierid, unitprice, discontinued
FROM Production.Products
WHERE categoryid = 1;

--3
/*
Buatlah sebuah	query	SELECT	yang	terdiri	dari kolom	productid dan	productname dari	
VIEW Production.ProductsBeverages.	Lalu	filterlah	hasilnya	agar	hanya	menampilkan	produk	
dengan	supplierid	=	1
*/
SELECT
productid, productname
FROM Production.ProductsBeverages
WHERE supplierid = 1;


--4

ALTER VIEW Production.ProductsBeverages AS
SELECT
productid, productname, supplierid, unitprice, discontinued
FROM Production.Products
WHERE categoryid = 1
ORDER BY productname;
/*ya muncul*/

/*notifikasi eror 
The ORDER BY clause is invalid in views, inline functions, derived tables, subqueries, and common table expressions, 
unless TOP, OFFSET or FOR XML is also specified.

gagal karena view merepresentasikan relasi dan relasi tidak ada order.
Kita bisa menggunakan order by di view jika di spesifikasikan dengan TOP, OFFSET or FOR XML.*/

ALTER VIEW Production.ProductsBeverages AS
SELECT TOP(100) PERCENT
productid, productname, supplierid, unitprice, discontinued
FROM Production.Products
WHERE categoryid = 1
ORDER BY productname;



--5
/* Jika sebuah	query	dijalankan	terhadap	VIEW	Production.ProductsBeverages yang	telah	
dimodifikasi,	 apakah	 baris yang	 dihasilkan	 dari	 VIEW	 tersebut akan	 selalu urut berdasarkan	
productname?	Jelaskan!*/

/*jika di ekspresi view sql tidak diterapkan order by productname maka data tidak akan terurut berdasarkan kualifikasi yang diminta
kecuali jika di sql select view sudah diterapkan order by maka data akan tampil terurut sesuai kriteria*/


--6
ALTER VIEW Production.ProductsBeverages AS
SELECT
productid, productname, supplierid, unitprice, discontinued,
CASE WHEN unitprice > 100.	THEN N'high' ELSE N'normal' END
FROM Production.Products
WHERE categoryid = 1;
/*Setelah	mengeksekusi	 T-SQL	di	 atas,	 apakah	 yang	terjadi?	 Tuliskan	pesan	error	 yang	
ada	dan	jelaskan	penyebab mengapa	error	tersebut	muncul!*/

/*
NOtifikasi eror : Create View or Function failed because no column name was specified for column 6.

eror karena kolom terakhir tidak punya nama kolom (CASE WHEN unitprice > 100.	THEN N'high' ELSE N'normal' END)
seharusnya ditambahkan AS alias untuk nama kolom ybs
*/

--7
ALTER VIEW Production.ProductsBeverages AS
	SELECT
	productid, productname, supplierid, unitprice, discontinued,
		CASE WHEN unitprice > 100. THEN N'high' ELSE N'normal' END AS pricetype
	FROM Production.Products
WHERE categoryid = 1;

--8
/* Dengan	 menggunakan	 database	 TSQL2012,	 buatlah	 sebuah	 query	 SELECT	 terhadap	
derived	table (tabel	turunan)	yang	berisi	kolom	productid dan	productname,	
dengan	filter	hanya	 menampilkan	data	yang	'pricetype'-nya	adalah	'high'.	
Gunakan	query	SELECT yang	ada	pada	Praktikum	- Bagian 4 � Langkah	1 sebagai	derived	tablenya.	
Beri	nama	alias	p terhadap	derived	table tersebut.*/
SELECT
p.productid, p.productname
FROM
(
	SELECT
	productid, productname, supplierid, unitprice, discontinued,
	CASE WHEN unitprice > 100. THEN N'high' ELSE N'normal' END AS pricetype
	FROM Production.Products
	WHERE categoryid = 1
) AS p
WHERE p.pricetype = N'high';



--9
/* Buatlah	sebuah	query	SELECT	untuk	mendapatkan	kolom	custid dan	2	(dua)	kolom	
kalkulasi,	yakni	totalsalesamount (total	jumlah	nominal	order	per	customer)	dan	
avgsalesamount (rata-rata	jumlah	nominal	order	per customer).	
Untuk	mengetahui	rata-rata	nominal	order	per customer,	harus	dicari	dahulu	jumlah	total	
nominal	per	order.	Caranya	adalah	dengan	membuat	sebuah	derived	table yang	berisi	query	
JOIN antara	tabel	Sales.Orders dan	Sales.OrderDetails.	Setelah	itu,	Anda	bisa	gunakan	kolom	
custid dan	orderid dari	tabel	Sales.Orders,	serta	kolom	qty dan	unitprice dari	tabel	
Sales.OrderDetails.*/
SELECT
c.custid,
SUM(c.totalsalesamountperorder) AS totalsalesamount,
AVG(c.totalsalesamountperorder) AS avgsalesamount
FROM
(
SELECT
	o.custid, o.orderid, SUM(d.unitprice * d.qty) AS totalsalesamountperorder
	FROM Sales.Orders AS o
	INNER JOIN Sales.OrderDetails d ON d.orderid = o.orderid
	GROUP BY o.custid, o.orderid
) AS c
GROUP BY c.custid;


--10
/*Tulislah	sebuah	query	SELECT	yang	berisi	kolom-kolom	berikut	ini:
- orderyear:	tahun	dari	tanggal	order
- curtotalsales:	total	jumlah	penjualan	pada	tahun	tersebut
- prevtotalsales:	total	jumlah	penjualan	pada	tahun	sebelumnya
- percentgrowth:	prosentase	perkembangan	penjualan	dari	tahun	yang	sedang	
berjalan dibanding	tahun	sebelumnya*/
SELECT
cy.orderyear,
	cy.totalsalesamount AS curtotalsales,
		py.totalsalesamount AS prevtotalsales,
			(cy.totalsalesamount - py.totalsalesamount) / py.totalsalesamount * 100. AS
			percentgrowth
FROM
(
	SELECT
	YEAR(orderdate) AS orderyear, SUM(val) AS totalsalesamount
	FROM Sales.OrderValues
	GROUP BY YEAR(orderdate)
) AS cy
LEFT OUTER JOIN
(
	SELECT
	YEAR(orderdate) AS orderyear, SUM(val) AS totalsalesamount
	FROM Sales.OrderValues
	GROUP BY YEAR(orderdate)
) AS py ON cy.orderyear = py.orderyear + 1
ORDER BY cy.orderyear;

--11
/* Dengan	tetap	menggunakan	database	TSQL2012,	buatlah	query	SELECT	seperti	di	
Praktikum	- Bagian 6,	akan	tetapi	dengan	menggunakan	Common	Table	Expressions	(CTE).	Beri	
nama	alias	query	CTE	tersebut	sebagai	ProductBeverag*/
WITH ProductsBeverages AS
	(
		SELECT
		productid, productname, supplierid, unitprice, discontinued,
			CASE WHEN unitprice > 100. THEN N'high' ELSE N'normal' END AS pricetype
		FROM Production.Products
		WHERE categoryid = 1
	)
SELECT
		productid, productname
FROM ProductsBeverages
WHERE pricetype = N'high';

--12
/* Buatlah	sebuah	query	SELECT	terhadap	view	Sales.OrderValues untuk	mendapatkan	
ID	customer	dan	total	jumlah	penjualan	pada	tahun	2008.	Beri	nama	CTE	ini	sebagai	c2008,	
yang	terdiri	dari	kolom	custid dan	salesamt2008.
Kemudian,	lakukan	operasi	JOIN antara	table	Sales.Customers dan	CTE	c2008,	sehingga
menghasilkan	kolom	custid dan	contactname dari	table	Sales.Customer dan	kolom	
salesamt2008 dari	CTE	c2008.*/
WITH c2008 (custid, salesamt2008) AS
(
	SELECT
	custid, SUM(val)
	FROM Sales.OrderValues
	WHERE YEAR(orderdate) = 2008
	GROUP BY custid
)
SELECT
		c.custid, c.contactname, c2008.salesamt2008
FROM Sales.Customers AS c
LEFT OUTER JOIN c2008 ON c.custid = c2008.custid;

--13
/*Buatlah	sebuah	query	SELECT	yang	berisi	kolom	custid dan	contactname terhadap	
table	Sales.Customers.	Selain	itu,	dapatkan	juga	nilai	untuk	beberapa	kolom	berikut:
- salesamt2008:	total	jumlah	penjualan	tahun	2008
- salesamt2007:	total	jumlah	penjualan	tahun	2007
- percentgrowth:	prosentase	perkembangan	penjualan	antara	tahun	2007	dan	2008
Apabila	percentgrowth menghasilkan	NULL,	tampilkan	sebagai	0.*/
WITH c2008 (custid, salesamt2008) AS
(
	SELECT
	custid, SUM(val)
	FROM Sales.OrderValues
	WHERE YEAR(orderdate) = 2008
	GROUP BY custid
),
c2007 (custid, salesamt2007) AS
(
	SELECT
	custid, SUM(val)
	FROM Sales.OrderValues
	WHERE YEAR(orderdate) = 2007
	GROUP BY custid
)
SELECT
		c.custid, c.contactname,
		c2008.salesamt2008,
		c2007.salesamt2007,
		COALESCE((c2008.salesamt2008 - c2007.salesamt2007) / c2007.salesamt2007 * 100., 0)
AS percentgrowth
FROM Sales.Customers AS c
LEFT OUTER JOIN c2008 ON c.custid = c2008.custid
LEFT OUTER JOIN c2007 ON c.custid = c2007.custid
ORDER BY percentgrowth DESC;


--14
/*
 Dengan	menggunakan	database	TSQL2012,	buatlah	query	SELECT	terhadap	view	
Sales.OrderValues yang	berisi	kolom	custid dan	kolom	totalsalesamount (total	dari	kolom	val).	
Filter hasilnya	agar	hanya	menampilkan	order pada	tahun	2017	saja.
*/
SELECT
      custid, SUM(val) AS totalsalesamount
FROM Sales.OrderValues
WHERE YEAR(orderdate) = 2007
GROUP BY custid;

--15
/*
Buatlah	sebuah	inline	TVF/	Table-Valued	Function	dengan	menambahkan	baris	
berikut	ini	dan	diletakkan	sebelum	query SELECT pada	Langkah	1 di	atas
*/
CREATE FUNCTION dbo.fnGetSalesByCustomer
(@orderyear AS INT) RETURNS TABLE
AS
RETURN

--16
/*
Modifikasilah	query	tersebut	dengan	mengganti	nilai	konstanta	tahun	2007	pada	
klausa	WHERE,	dengan	parameter	@orderyear.
*/
CREATE FUNCTION dbo.fnGetSalesByCustomer
(@orderyear AS INT) RETURNS TABLE
AS
RETURN
SELECT
	custid, SUM(val) AS totalsalesamount
FROM Sales.OrderValues
WHERE YEAR(orderdate) = @orderyear
GROUP BY custid;


--17
/*
Buatlah	sebuah	query	SELECT	yang	berisi	kolom	custid dan	totalsalesamount
terhadap	inline	TVF	dbo.fnGetSalesByCustomer.	Masukkan nilai	2007	sebagai	parameternya.
*/
SELECT
     custid, totalsalesamount
FROM dbo.fnGetSalesByCustomer(2007);

--18
/*
Buatlah	query	SELECT	yang	menampilkan	3	produk	terlaris	untuk	customer	dengan	ID	
=	1.	Dapatkan	kolom	productid dan	productname dari	tabel	Production.Products.	Gunakan	
kolom	qty dan	unitprice dari	tabel	Sales.OrderDetails untuk	menghitung	nominal	setiap	baris	
order,	yang	kemudian	nominal	tersebut	dijumlahkan	untuk	setiap	produk	sehingga	
menghasilkan	kolom	totalsalesamount.	
Filter hasil	tersebut	agar	hanya	menampilkan	data	dengan	nilai	custid	=	1.
*/
SELECT TOP(3)
	d.productid,
	MAX(p.productname) AS productname,
	SUM(d.qty * d.unitprice) AS totalsalesamount
FROM Sales.Orders AS o
INNER JOIN Sales.OrderDetails AS d ON d.orderid = o.orderid
INNER JOIN Production.Products AS p ON p.productid = d.productid
WHERE custid = 1
GROUP BY d.productid
ORDER BY totalsalesamount DESC;

--19
/*
Dengan	menggunakan	query	SELECT	pada	langkah	1	di	atas,	buatlah	sebuah	inline	
TVF	dengan	menambahkan	beberapa	baris fungsi	sebelum	query	SELECT	dan	set	nilai	
konstanta	custid dalam	query	dengan	parameter	@custid,	seperti	berikut	ini:
*/
SELECT TOP(3)
	d.productid,
	MAX(p.productname) AS productname,
	SUM(d.qty * d.unitprice) AS totalsalesamount
FROM Sales.Orders AS o
INNER JOIN Sales.OrderDetails AS d ON d.orderid = o.orderid
INNER JOIN Production.Products AS p ON p.productid = d.productid
WHERE custid = 1
GROUP BY d.productid
ORDER BY totalsalesamount DESC;


--20
/*Lakukan	ujicoba	dengan	membuat	sebuah	query	SELECT	pada	inline	TVF	tersebut	dan	
masukkan nilai	 1	 sebagai	 parameter	 customer	 ID-nya.	 Tampilkan	 kolom	 productid,	
productname,	totalsalesamount,	serta	beri	nama	alias	p untuk	inline	TVF-nya*/
CREATE FUNCTION dbo.fnGetTop3ProductsForCustomer
(@custid AS INT) RETURNS TABLE
AS
RETURN
SELECT TOP(3)
	d.productid,
	MAX(p.productname) AS productname,
	SUM(d.qty * d.unitprice) AS totalsalesamount
FROM Sales.Orders AS o
INNER JOIN Sales.OrderDetails AS d ON d.orderid = o.orderid
INNER JOIN Production.Products AS p ON p.productid = d.productid
WHERE custid = @custid
GROUP BY d.productid
ORDER BY totalsalesamount DESC;


SELECT
p.productid,
p.productname,
p.totalsalesamount
FROM dbo.fnGetTop3ProductsForCustomer(1) AS p;


-- JOBHSEET 6

/*
Skenario :
Bagian penjualan ingin menentukan pesanan berdasarkan nilai masing-masing pelanggan. Untuk 
itu diperlukan laporkan menggunakan fungsi RANK (termasuk kolom hasil perhitungan yang 
manambahkan kolom hasil perhitungan untuk menampilkan nomor baris dengan klausa 
SELECT).

soal 1 
Tulislah pernyataan SELECT untuk mengambil kolom orderid, orderdate, dan val serta 
kolom hasil perhitungan bernama rowno dari view Sales.OrderValues! Gunakan fungsi 
ROW_NUMBER untuk mengembalikan rowno, urutkan nomor baris berdasarkan kolom 
orderdate!
*/

SELECT
	orderid, orderdate, val,
	ROW_NUMBER() OVER (ORDER BY orderdate) AS rowno
FROM Sales.OrderValues;

/*
soal 2
Salin T-SQL pada soal no 1. Kemudian modifikasi dengan memasukkan kolom tambahan 
bernama rankno. Untuk membuat rankno gunakan fungsi RANK dengan urutan peringkat 
berdasarkan kolom orderdate!
*/

SELECT
	orderid, orderdate, val,
	ROW_NUMBER() OVER (ORDER BY orderdate) AS rowno,
	RANK() OVER (ORDER BY orderdate) AS rankno
FROM Sales.OrderValues;

/*
soal 3
Apakah perbedaan antara fungsi RANK dan fungsi ROW_NUMBER?
*/

/*
Fungsi RANK mengembalikan peringkat dari nilai yang sama, sedangkan fungsi ROW_NUMBER
tidak mengembalikan peringkat dari nilai yang sama.
*/

/*
soal 4
 Tuliskan pernyataan SELECT untuk mengambil kolom orderid, orderdate, custid, dan val 
serta hitung kolom bernama orderrankno dari view Sales.OrderValues. Kolom orderrankno 
harus menampilkan rangking per pelanggan secara independen, berdasarkan pemesanan val 
dalam urutan menurun!
*/

SELECT
	orderid, orderdate, custid, val,
	RANK() OVER (PARTITION BY custid ORDER BY val DESC) AS orderrankno
FROM Sales.OrderValues;
	
/*
soal 5
 Tuliskan pernyataan SELECT untuk mengambil kolom custid dan val dari view 
Sales.OrderValues. Tambahkan dua kolom berikut:
1) orderyear sebagai tahun dari kolom orderdate
2) orderrankno sebagai nomor urut, dipartisi berdasarkan pelanggan dan tahun pesanan, 
dan diurutkan berdasarkan nilai pesanan dalam urutan menurun
*/

SELECT
	custid, val,
	YEAR(orderdate) AS orderyear,
	RANK() OVER (PARTITION BY custid, YEAR(orderdate) ORDER BY val DESC) AS orderrankno
FROM Sales.OrderValues;

/*
soal 6
Salin query jawaban soal nomor 6 dan modifikasi untuk memfilter hanya pesanan 
dengan dua peringkat paling awal berdasarkan kolom orderrankno!
*/

SELECT
    custid,
    val,
    orderyear,
    orderrankno
FROM (
    SELECT
        custid,
        val,
        YEAR(orderdate) AS orderyear,
        RANK() OVER (PARTITION BY custid, YEAR(orderdate) ORDER BY val DESC) AS orderrankno
    FROM Sales.OrderValues
) AS Subquery
WHERE orderrankno <= 2;


/*
Skenario :
Laporan lainnya diperlukan untuk menganalisis perbedaan antara dua baris secara 
berturut-turut. Hal ini akan mempermudah business user untuk menganalisa pertumbuhan dan tren
*/

/*
soal 7
Buatlah (common table expression) CTE dengan nama OrderRows berdasarkan query yang 
mengambil kolom orderid, orderdate, and val dari view Sales.OrderValues. Tambahkan kolom 
hasil perhitungan dengan nama rowno menggunakan fungsi ROW_NUMBER yang diurutkan 
berdasarkan kolom orderdate dan orderid!
*/

WITH OrderRows AS
(
	SELECT
		orderid, orderdate, val,
		ROW_NUMBER() OVER (ORDER BY orderdate, orderid) AS rowno
	FROM Sales.OrderValues
)
SELECT
	orderid, orderdate, val, rowno
FROM OrderRows;

/*
soal 8
Tuliskan pernyataan SELECT terhadap CTE dan gunakan LEFT JOIN dengan CTE yang sama 
untuk mengambil baris saat ini (current row) dan baris sebelumnya (previous row) berdasarkan 
kolom rowno. Kembalikan kolom orderid, orderdate, and val untuk baris saat ini dan kolom val 
untuk baris sebelumnya sebagai prevval. Tambahkan kolom hasil perhitungan dengan nama 
diffprev yang menunjukkan perbedaan antara val saat ini dengan sebelumnya!
*/

WITH OrderRows AS
(
	SELECT
		orderid, orderdate, val,
		ROW_NUMBER() OVER (ORDER BY orderdate, orderid) AS rowno
	FROM Sales.OrderValues
)
SELECT
	o.orderid, o.orderdate, o.val, o.val - p.val AS diffprev
FROM OrderRows AS o
LEFT JOIN OrderRows AS p ON o.rowno = p.rowno + 1;


/*
soal 9
Tuliskan pernyataan SELECT menggunakan fungsi LAG untuk mendapat hasil yang sama 
dengan query pada soal no.2! Query tidak yang dibuat pada soal ini tidak menggunakan CTE
*/

SELECT
	orderid, orderdate, val,
	ROW_NUMBER() OVER (ORDER BY orderdate, orderid) AS rowno,
	LAG(val) OVER (ORDER BY orderdate, orderid) AS prevval
FROM Sales.OrderValues;

/*
soal 10
Buatlah sebuah CTE bernama SalesMonth2007 yang membuat dua kolom yaitu, 
monthno (jumlah bulan dari kolom orderdate) dan val (agregat dari kolom val)! Kemudian filter 
hasilnya hanya untuk tahun pesanan 2007 dan dikelompokkan berdasarkan monthno!
*/

WITH SalesMonth2007 AS
(
	SELECT
		MONTH(orderdate) AS monthno, SUM(val) AS val
	FROM Sales.OrderValues
	WHERE YEAR(orderdate) = 2007
	GROUP BY MONTH(orderdate)
)
SELECT
	monthno, val
FROM SalesMonth2007;

/*
soal 11
Tuliskan pernyataan SELECT yang akan mengambil kolom montohno dan val dari CTE 
dan tambahkan 3 kolom untuk ditampilkan, yaitu :
1) avglast3months (jumlah penjualan rata-rata tiga bulan terakhir)
2) diffjanuary (perbedaan antara val saat ini dengan val pada bulan januari, gunakan fungsi 
FIRST_VALUE)
3) nextval (nilai dari kolom val pada bulan selanjutnya)
*/



/*
Skenario :
Untuk lebih memahami nilai penjualan kumulatif pelanggan melalui waktu dan untuk 
menyediakan analis penjualan dengan analisis selama setahun ini diperlukan pernyataan 
SELECT yang berbeda menggunakan fungsi agregasi window
*/

/*
soal 12
 Tuliskan pernyataan SELECT untuk mengambil kolom custid, orderid, orderdate, dan 
val dari view Sales.OrderValues. Tambahkan kolom bernama percoftotalcust yang berisi 
persentase nilai masing-masing jumlah pesanan penjualan dibandingkan dengan jumlah 
penjualan untuk pelanggan tersebut. Urutkan val dari yang terbesar
*/

SELECT
	custid, orderid, orderdate, val,
	CAST(val * 100. / SUM(val) OVER (PARTITION BY custid) AS DECIMAL(5, 2)) AS percoftotalcust
FROM Sales.OrderValues
ORDER BY val DESC;

/*
soal 13
Salin pernyataan SELECT sebelumnya dan modifikasi dengan menambahkan kolom 
yang baru dihitung bernama runval! Kolom ini harus berisi total penjualan yang sedang terjadi 
untuk setiap pelanggan berdasarkan tanggal pemesanan, menggunakan orderid sebagai 
tiebreaker.
*/

SELECT
	custid, orderid, orderdate, val,
	CAST(val * 100. / SUM(val) OVER (PARTITION BY custid) AS DECIMAL(5, 2)) AS percoftotalcust,
	SUM(val) OVER (PARTITION BY custid ORDER BY orderdate, orderid) AS runval
FROM Sales.OrderValues
ORDER BY val DESC;

/*
soal 14
Salin CTE SalesMonth2007 dalam percobaan 2. Tuliskan pernyataan SELECT untuk 
mengambil kolom monthno dan val. Tambahkan dua kolom yang dihitung:
1) avglast3months. Kolom ini harus berisi jumlah penjualan rata-rata untuk tiga bulan 
terakhir sebelum bulan saat ini menggunakan fungsi window agregat. Asumsikan bahwa 
tidak ada missing months.
2) ytdval Kolom ini harus berisi nilai penjualan kumulatif sampai dengan bulan saat ini
*/

WITH SalesMonth2007 AS
(
	SELECT
		MONTH(orderdate) AS monthno, SUM(val) AS val
	FROM Sales.OrderValues
	WHERE YEAR(orderdate) = 2007
	GROUP BY MONTH(orderdate)
)
SELECT
	monthno, val,
	AVG(val) OVER (ORDER BY monthno ROWS BETWEEN 3 PRECEDING AND 1 PRECEDING) AS
	avglast3months,
	SUM(val) OVER (ORDER BY monthno ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT
	ROW) AS ytdval
FROM SalesMonth2007;


-- Jobsheet 8
CREATE VIEW Sales.CustGroups
AS
	SELECT custid, CHOOSE(custid % 3 + 1, N'A', N'B', N'C') AS custgroup, country
	FROM Sales.Customers;

-- soal 1
-- Dari view Sales.CustGroups yang sudah dibuat, buatlah sebuah query SELECT untuk 
-- menampilkan kolom custid, custgroup, dan country. 

SELECT custid, custgroup, country
FROM Sales.CustGroups;

/*
soal 2
 Modifikasilah kode T-SQL dari langkah no 3 di atas dengan menampilkan kolom country, 
lalu dengan menggunakan operator PIVOT, tambahkan 3 kolom tambahan yang berisi banyaknya 
customer dalam masing-masing grup (A, B, & C). MEnggunakan CTE, pastikan NULL menjadi 0
*/

WITH CustGroups AS
(
	SELECT custid, CHOOSE(custid % 3 + 1, N'A', N'B', N'C') AS custgroup, country
	FROM Sales.CustGroups
)
SELECT country, ISNULL (A, 0) AS A, ISNULL (B, 0) AS B, ISNULL (C, 0) AS C
FROM CustGroups
PIVOT (COUNT(custid) FOR custgroup IN (A, B, C)) AS p;


-- Berikut adalah query yang menambahkan 2 kolom ke dalam view Sales.CustGroups
ALTER VIEW Sales.CustGroups AS
SELECT
	custid,
	CHOOSE(custid % 3 + 1, N'A', N'B', N'C') AS custgroup,
	country,
	city,
	contactname
FROM Sales.Customers;

/*
soal 4
Modifikasi statement soal 2 di atas dengan menambahkan 2 kolom baru ke dalam
operator PIVOT, yaitu city dan contactname. Pastikan NULL menjadi 0.
*/

WITH CustGroups AS
(
	SELECT
		custid,
		CHOOSE(custid % 3 + 1, N'A', N'B', N'C') AS custgroup,
		country,
		city,
		contactname
	FROM Sales.CustGroups
)
SELECT country, city, contactname, ISNULL (A, 0) AS A, ISNULL (B, 0) AS B, ISNULL (C, 0) AS C
FROM CustGroups
PIVOT (COUNT(custid) FOR custgroup IN (A, B, C)) AS p;

/*
soal 5
Buatlah sebuah CTE bernama PivotCustGroups yang mendapatkan kolom custid, 
country, dan custgroup dari view Sales.CustGroups. Kemudian, buatlah sebuah query SELECT 
terhadap CTE tersebut dan gunakan operator PIVOT, seperti halnya dalam query SELECT pada 
Praktikum Bagian sebelumnya
*/

WITH PivotCustGroups AS
(
	SELECT custid, country, custgroup
	FROM Sales.CustGroups
)
SELECT country, ISNULL (A, 0) AS A, ISNULL (B, 0) AS B, ISNULL (C, 0) AS C
FROM PivotCustGroups
PIVOT (COUNT(custid) FOR custgroup IN (A, B, C)) AS p;

/*
soal 6
 Apakah hasilnya sama persis dengan hasil yang ada pada Praktikum Bagian 1? 
Mengapa demikian? 
*/

/*
Hasilnya sama persis. Karena CTE adalah sebuah query yang dianggap sebagai tabel sementara
*/

/*
[Soal-7] Apakah keuntungan penggunaan CTE ketika membuat query yang menggunakan 
operator PIVOT?
*/

/*
Keuntungan penggunaan CTE ketika membuat query yang menggunakan operator PIVOT adalah
karena CTE adalah sebuah query yang dianggap sebagai tabel sementara, sehingga dapat
mempermudah dalam pembuatan query.
*/

/*
soal 8
Buatlah sebuah query SELECT yang menampilkan data total jumlah penjualan untuk 
setiap kategori produk, untuk setiap customer.
Untuk menjawab soal ini, ikuti langkah-langkah berikut: 
1. Buatlah sebuah CTE bernama SalesByCategory untuk mendapatkan 3 kolom: 
 kolom custid dari tabel Sales.Orders
 kolom salesvalue hasil perhitungan antara kolom qty dan unitprice
 kolom categoryname dari tabel Production.Categories
Filter hasilnya agar hanya menampilkan order pada tahun 2008 saja. 
2. Lakukan operasi JOIN terhadap tabel Sales.Orders, Sales.OrderDetails, 
Production.Products, dan Production.Categories. 
3. Buatlah sebuah query SELECT terhadap CTE tersebut yang menghasilkan data setiap 
customer (custid) berupa baris dan nama setiap kategori produk sebagai kolomkolomnya, yang berisi data total jumlah penjualan untuk setiap kategori produk, untuk 
setiap customer. 
4. Kategori produk yang ditampilkan antara lain: Beverages, Condiments, Confections, 
[Dairy Products], [Grain/Cereals], [Meat/Poultry], Produce, dan Seafood. 

null tidak masalah
*/

WITH SalesByCategory AS
(
	SELECT
		o.custid, SUM(d.qty * d.unitprice) AS salesvalue, c.categoryname
	FROM Sales.Orders AS o
	INNER JOIN Sales.OrderDetails AS d ON d.orderid = o.orderid
	INNER JOIN Production.Products AS p ON p.productid = d.productid
	INNER JOIN Production.Categories AS c ON c.categoryid = p.categoryid
	WHERE YEAR(o.orderdate) = 2008
	GROUP BY o.custid, c.categoryname
)
SELECT
	custid, Beverages, Condiments, Confections, [Dairy Products], [Grain/Cereals], [Meat/Poultry], Produce, Seafood
FROM SalesByCategory
PIVOT (SUM(salesvalue) FOR categoryname IN (Beverages, Condiments, Confections, [Dairy Products], [Grain/Cereals], [Meat/Poultry], Produce, Seafood)) AS p;


-- Berikut ini adalah query T-SQL untuk membuat view baru bernama Sales.PivotCustGroups

CREATE VIEW Sales.PivotCustGroups AS
WITH PivotCustGroups AS
(
	SELECT
		custid,
		country,
		custgroup
	FROM Sales.CustGroups
)
SELECT
	country,
	p.A,
	p.B,
	p.C
FROM PivotCustGroups
PIVOT (COUNT(custid) FOR custgroup IN (A, B, C)) AS p;

/*
soal 9
Buatlah query SELECT yang menghasilkan kolom country, kolom A, kolom B, dan kolom 
C dari view Sales.PivotCustGroups yang telah dibuat. 
*/

SELECT country, A, B, C
FROM Sales.PivotCustGroups;

/*
soal 10
Buatlah sebuah query SELECT terhadap view Sales.PivotCustGroups
Penjelasan 
1. Baris untuk setiap negara dan grup customer 
2. Kolom untuk setiap negara 
3. Terdapat 2 kolom tambahan, yakni custgroup dan numberofcustomers. 
Kolom custgroup adalah nama kolom grup customer A, B, atau C, dalam bentuk karakter 
string. Sedangkan kolom numberofcustomers menampilkan banyaknya customer. 

konsep custgroup menerapkan unpivot, dari A B C menjadi kolom A B C
*/

SELECT
	country, custgroup, numberofcustomers
FROM Sales.PivotCustGroups
UNPIVOT (numberofcustomers FOR custgroup IN (A, B, C)) AS p;

/*
soal 11 - grouping sets
Buatlah query SELECT terhadap tabel Sales.Customers yang terdiri dari kolom contry, 
city, dan kolom kalkulasi yang menghitung banyaknya customer bernama noofcustomers. 
Dapatkan pengelompokan (grouping set) berdasarkan: 
 kolom country dan city 
 kolom country 
 kolom city 
 dan sebuah kolom tanpa kelompok
*/

SELECT
	country, city, COUNT(*) AS noofcustomers
FROM Sales.Customers
GROUP BY GROUPING SETS ((country, city), (country), (city), ());


/*
soal 12 - cube
Buatlah sebuah query SELECT yang menggunakan sub klause CUBE terhadap view Sales.OrderValues yang berisi kolom: 
 orderyear: tahun dari kolom orderdate 
 ordermounth: bulan dari kolom orderdate
 orderday: hari dari kolom orderdate
 salesvalue: total jumlah penjualan dari kolom val
*/

SELECT
	YEAR(orderdate) AS orderyear,
	MONTH(orderdate) AS ordermonth,
	DAY(orderdate) AS orderday,
	SUM(val) AS salesvalue
FROM Sales.OrderValues
GROUP BY CUBE (YEAR(orderdate), MONTH(orderdate), DAY(orderdate));

/*
soal 13 - rollup
alinlah query dari Soal no 12 di atas dan ubah sub klausa CUBE menjadi ROLLUP, lalu 
jalankan query tersebut
*/

SELECT
	YEAR(orderdate) AS orderyear,
	MONTH(orderdate) AS ordermonth,
	DAY(orderdate) AS orderday,
	SUM(val) AS salesvalue
FROM Sales.OrderValues
GROUP BY ROLLUP (YEAR(orderdate), MONTH(orderdate), DAY(orderdate));

/*
soal 14
Apakah perbedaan antara sub klausa ROLLUP dan CUBE? Manakah yang lebih tepat 
digunakan untuk query pada langkah 1 di atas? 
*/

/*
Perbedaan antara sub klausa ROLLUP dan CUBE adalah ROLLUP hanya menghasilkan
subtotals untuk kolom yang ditentukan, sedangkan CUBE menghasilkan subtotals untuk
semua kombinasi dari kolom yang ditentukan. Untuk query pada langkah 1 di atas, lebih
tepat menggunakan ROLLUP.
*/

/*
soal 15 - menganalisa total nilai penjualan berdasarkan tahun dan bulan
Buatlah query SELECT terhadap view Sales.OrderValues dan dapatkan kolom berikut 
ini: 
 kolom kalkulasi dengan nama alias groupid (gunakan fungsi GROUPING_ID dengan 
tahun order dan bulan order sebagai parameter inputnya) 
 orderyear: tahun dari kolom orderdate 
 ordermonth: bulan dari kolom orderdate
 salesvalue: total nilai penjualan dari kolom val
 oleh karena tahun dan bulan berbentuk hierarki, dapatkan semua pengelompokan/ 
grouping set berdasarkan kolom orderyear dan ordermonth, lalu urutkan 
berdasarkan groupid, orderyear, dan ordermonth
*/

SELECT
	GROUPING_ID(YEAR(orderdate), MONTH(orderdate)) AS groupid,
	YEAR(orderdate) AS orderyear,
	MONTH(orderdate) AS ordermonth,
	SUM(val) AS salesvalue
FROM Sales.OrderValues
GROUP BY GROUPING SETS ((YEAR(orderdate), MONTH(orderdate)), (YEAR(orderdate)), ());

