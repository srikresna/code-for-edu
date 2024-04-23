CREATE DATABASE olap_toko;

USE olap_toko;

CREATE TABLE dimTransaksi
(
    id_transaksi INT AUTO_INCREMENT PRIMARY KEY,
    nomor_transaksi VARCHAR(20),
    tanggal_transaksi DATE
);

CREATE TABLE dimProduk
(
    id_produk INT AUTO_INCREMENT PRIMARY KEY,
    nama_produk VARCHAR(50),
    satuan VARCHAR(10)
);

CREATE TABLE dimDate
(
    id_date INT AUTO_INCREMENT PRIMARY KEY,
    tanggal DATE,
    tahun INT,
    bulan INT,
    hari INT
);

CREATE TABLE factPenjualan
(
    id_transaksi INT,
    id_produk INT,
    id_date INT,
    jumlahTransaksi INT,
    harga DECIMAL(10,2)
);

SELECT * FROM dimDate;
SELECT * FROM dimProduk;
SELECT * FROM dimTransaksi;
SELECT * FROM factPenjualan;

SELECT * FROM `factpenjualan` f
JOIN dimproduk p on p.id_produk=f.id_produk
RIGHT JOIN dimdate d on f.id_date=d.id_date
WHERE p.id_produk = 2;

