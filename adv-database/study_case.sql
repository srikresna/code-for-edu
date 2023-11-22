CREATE TABLE Produk (
    ID_Produk INT NOT NULL PRIMARY KEY,
    Nama VARCHAR(100) NOT NULL,
    Harga DECIMAL(10,2) NOT NULL,
    Kategori VARCHAR(50) NOT NULL,
    Stok INT NOT NULL
)

CREATE TABLE Pelanggan (
    ID_Pelanggan INT NOT NULL PRIMARY KEY,
    Nama VARCHAR(100) NOT NULL,
    Alamat VARCHAR(200) NOT NULL,
    Email VARCHAR(100) NOT NULL,
    No_Telepon VARCHAR(15) NOT NULL
)

CREATE TABLE Penjualan (
    ID_Penjualan INT NOT NULL PRIMARY KEY,
    ID_Produk INT NOT NULL,
    ID_Pelanggan INT NOT NULL,
    ID_Karyawan INT NOT NULL,
    Tanggal DATE NOT NULL,
    Jumlah INT NOT NULL,
    Total_Harga DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (ID_Produk) REFERENCES Produk(ID_Produk),
    FOREIGN KEY (ID_Pelanggan) REFERENCES Pelanggan(ID_Pelanggan),
    FOREIGN KEY (ID_Karyawan) REFERENCES Karyawan(ID_Karyawan)
)

CREATE TABLE Karyawan (
    ID_Karyawan INT NOT NULL PRIMARY KEY,
    Nama VARCHAR(100) NOT NULL,
    Jabatan VARCHAR(100) NOT NULL,
    Gaji DECIMAL(10,2) NOT NULL,
    ID_Cabang INT NOT NULL,
    FOREIGN KEY (ID_Cabang) REFERENCES Cabang(ID_Cabang)
)

CREATE TABLE Cabang (
    ID_Cabang INT NOT NULL PRIMARY KEY,
    Nama_Cabang VARCHAR(100) NOT NULL,
    Lokasi VARCHAR(200) NOT NULL
)

CREATE TABLE Supplier (
    ID_Supplier INT NOT NULL PRIMARY KEY,
    Nama VARCHAR(100) NOT NULL,
    Alamat VARCHAR(200) NOT NULL,
    No_Telepon VARCHAR(15) NOT NULL
)

-- Insert data ke tabel Produk
INSERT INTO Produk (ID_Produk, Nama, Harga, Kategori, Stok)
VALUES 
  (1, 'Pakaian Wanita A', 50.00, 'Pakaian Wanita', 20),
  (2, 'Pakaian Wanita B', 45.00, 'Pakaian Wanita', 15),
  (3, 'Aksesoris A', 25.00, 'Aksesoris', 30),
  (4, 'Aksesoris B', 30.00, 'Aksesoris', 25),
  (5, 'Sepatu Wanita A', 80.00, 'Sepatu Wanita', 10);

INSERT INTO Produk (ID_Produk, Nama, Harga, Kategori, Stok)
VALUES (7, 'Pakaian Wanita C', 55.00, 'Pakaian Wanita', 100),
         (8, 'Pakaian Wanita D', 60.00, 'Pakaian Wanita', 50),
         (9, 'Aksesoris C', 35.00, 'Aksesoris', 200),
         (10, 'Aksesoris D', 40.00, 'Aksesoris', 150),
         (11, 'Sepatu Wanita B', 85.00, 'Sepatu Wanita', 75);

-- Insert data ke tabel Pelanggan
INSERT INTO Pelanggan (ID_Pelanggan, Nama, Alamat, Email, No_Telepon)
VALUES 
  (1, 'Pelanggan A', 'Alamat A', 'pelangganA@email.com', '123456789'),
  (2, 'Pelanggan B', 'Alamat B', 'pelangganB@email.com', '987654321'),
  (3, 'Pelanggan C', 'Alamat C', 'pelangganC@email.com', '555555555');

-- Insert data ke tabel Cabang
INSERT INTO Cabang (ID_Cabang, Nama_Cabang, Lokasi)
VALUES 
  (1, 'Cabang A', 'Lokasi A'),
  (2, 'Cabang B', 'Lokasi B');

-- Insert data ke tabel Karyawan
INSERT INTO Karyawan (ID_Karyawan, Nama, Jabatan, Gaji, ID_Cabang)
VALUES 
  (1, 'Karyawan A', 'Manajer', 5000.00, 1),
  (2, 'Karyawan B', 'Kasir', 3000.00, 2),
  (3, 'Karyawan C', 'Gudang', 3500.00, 1);

-- Insert data ke tabel Supplier
INSERT INTO Supplier (ID_Supplier, Nama, Alamat, No_Telepon)
VALUES 
  (1, 'Supplier A', 'Alamat Supplier A', '111111111'),
  (2, 'Supplier B', 'Alamat Supplier B', '222222222');

INSERT INTO Supplier (ID_Supplier, Nama, Alamat, No_Telepon)
VALUES 
  (10, 'Supplier D', 'Alamat Supplier D', '12121111');
-- Insert data ke tabel Penjualan
INSERT INTO Penjualan (ID_Penjualan, ID_Produk, ID_Pelanggan, ID_Karyawan, Tanggal, Jumlah, Total_Harga)
VALUES 
  (1, 1, 1, 1, '2023-01-02', 2, 100.00),
  (2, 3, 2, 2, '2023-01-03', 1, 25.00),
  (3, 2, 3, 3, '2023-01-05', 3, 135.00);

INSERT INTO Penjualan (ID_Penjualan, ID_Produk, ID_Pelanggan, ID_Karyawan, Tanggal, Jumlah, Total_Harga)
VALUES
	(4, 1, 2, 3, '2023-06-06', 3, 155.00);

-- Tampilkan semua produk dalam kategori 'Pakaian Wanita'
SELECT * FROM Produk WHERE Kategori = 'Pakaian Wanita';

-- Masukkan data pelanggan baru ke dalam tabel Pelanggan
INSERT INTO Pelanggan (ID_Pelanggan, Nama, Alamat, Email, No_Telepon)
VALUES (4, 'Pelanggan D', 'Alamat D', 'pelangganD@email.com', '999999999');

-- Hapus data penjualan yang terjadi sebelum 1 Januari 2023
DELETE FROM Penjualan WHERE Tanggal < '2023-01-01';

-- Perbarui harga semua produk dalam ketegori 'Aksesoris' menjadi 10% lebih mahal
UPDATE Produk SET Harga = Harga * 1.1 WHERE Kategori = 'Aksesoris';

-- Tampilkan jumlah total produk yang terjual per kategori
SELECT Kategori, SUM(Jumlah) AS 'Jumlah Terjual' FROM Penjualan
JOIN Produk ON Penjualan.ID_Produk = Produk.ID_Produk
GROUP BY Kategori;

-- Hitung jumlah total produk yang terjual per kategori
SELECT Kategori, SUM(Jumlah) AS 'Jumlah Terjual' FROM Penjualan
JOIN Produk ON Penjualan.ID_Produk = Produk.ID_Produk
GROUP BY Kategori;

-- Gunakan window function untuk menampilkan total penjualan dan rata-rata penjualan setiap karyawan.
SELECT
    Karyawan.ID_Karyawan,
    Karyawan.Nama,
    SUM(Penjualan.Jumlah) OVER (PARTITION BY Karyawan.ID_Karyawan) AS Total_Penjualan,
    AVG(Penjualan.Jumlah) OVER (PARTITION BY Karyawan.ID_Karyawan) AS Rata_Rata_Penjualan
FROM Penjualan
JOIN Karyawan ON Penjualan.ID_Karyawan = Karyawan.ID_Karyawan;


-- 8. Tampilkan nama pelanggan dan panjang karakter dari nama tersebut.
SELECT
    Nama AS Nama_Pelanggan,
    LEN(Nama) AS Panjang_Nama
FROM Pelanggan;


-- 9. Tampilkan nama dan harga produk yang stoknya di bawah 15 unit.
SELECT Nama, Harga FROM Produk WHERE Stok < 15;


-- 10. Tampilkan ID Penjualan, nama produk, nama pelanggan, dan total harga untuk penjualan dengan lebih dari 2 produk.
SELECT ID_Penjualan, Produk.Nama AS 'Nama Produk', Pelanggan.Nama AS 'Nama Pelanggan', Total_Harga FROM Penjualan
JOIN Produk ON Penjualan.ID_Produk = Produk.ID_Produk
JOIN Pelanggan ON Penjualan.ID_Pelanggan = Pelanggan.ID_Pelanggan
WHERE Jumlah > 2;

-- 11. Tampilkan produk yang belum pernah terjual.
SELECT * FROM Produk
LEFT JOIN Penjualan ON Produk.ID_Produk = Penjualan.ID_Produk
WHERE ID_Penjualan IS NULL;


-- 12. Masukkan produk baru ke dalam tabel Produk.
INSERT INTO Produk (ID_Produk, Nama, Harga, Kategori, Stok)
VALUES (6, 'Pakaian Wanita C', 55.00, 'Pakaian Wanita', 10);


-- 13. Hapus semua karyawan yang belum melakukan penjualan dalam 6 bulan terakhir.
ALTER TABLE Karyawan
ADD Aktif BIT;

UPDATE Karyawan
SET Aktif = 0
WHERE ID_Karyawan NOT IN (
    SELECT DISTINCT P.ID_Karyawan
    FROM Penjualan P
    WHERE P.Tanggal >= DATEADD(MONTH, -6, GETDATE())
);

-- 14. Update alamat pelanggan tertentu di tabel Pelanggan.
UPDATE Pelanggan SET Alamat = 'Alamat Baru' WHERE ID_Pelanggan = 1;


-- 15. Tampilkan total gaji yang dibayarkan per cabang.
SELECT
    C.ID_Cabang,
    C.Nama_Cabang,
    SUM(K.Gaji) AS Total_Gaji
FROM Cabang C
JOIN Karyawan K ON C.ID_Cabang = K.ID_Cabang
GROUP BY C.ID_Cabang, C.Nama_Cabang;


-- 16. Tampilkan supplier yang telah menyediakan lebih dari 50 unit produk.


-- 17. Tampilkan rata-rata harga produk per kategori.
SELECT Kategori, AVG(Harga) AS 'Rata-rata Harga' FROM Produk
GROUP BY Kategori;

-- 18. Tampilkan penjualan tertinggi yang dicapai oleh seorang karyawan.
WITH RankedSales AS (
    SELECT
        ID_Penjualan,
        ID_Karyawan,
        Total_Harga,
        ROW_NUMBER() OVER (PARTITION BY ID_Karyawan ORDER BY Total_Harga DESC) AS Rank
    FROM Penjualan
)
SELECT
    R.ID_Penjualan,
    R.ID_Karyawan,
    K.Nama AS Nama_Karyawan,
    R.Total_Harga
FROM RankedSales R
JOIN Karyawan K ON R.ID_Karyawan = K.ID_Karyawan
WHERE R.Rank = 1;


-- 19. Tampilkan semua penjualan yang dilakukan pada hari Jumat.
SELECT *
FROM Penjualan
WHERE DATEPART(WEEKDAY, Tanggal) = 6;

-- 20. Tampilkan daftar produk dengan stok lebih dari rata-rata stok semua produk
SELECT * FROM Produk WHERE Stok > (SELECT AVG(Stok) FROM Produk);
