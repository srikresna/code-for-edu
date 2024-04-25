CREATE DATABASE db_barokah;

USE db_barokah;

CREATE TABLE dimPembeli (
    id_dimPembeli INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nama_pembeli VARCHAR(100),
    updated DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE dimPenjual (
    id_dimPenjual INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nama_penjual VARCHAR(100),
    updated DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE dimProduk (
    id_dimProduk INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nama_produk VARCHAR(50),
    satuan VARCHAR(5),
    updated DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE dimDateVal (
    id_dimDate INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Tanggal DATE,
    Year INT,
    Month INT,
    Day INT
);

DROP TABLE dimDateVal;
SELECT * FROM dimDateval;

CREATE TABLE factTransaction (
    id_dimPembeli INT,
    id_dimPenjual INT,
    id_dimProduk INT,
    id_dimDate INT,
    harga DOUBLE,
    qty INT,
    FOREIGN KEY (id_dimPembeli) REFERENCES dimPembeli(id_dimPembeli),
    FOREIGN KEY (id_dimPenjual) REFERENCES dimPenjual(id_dimPenjual),
    FOREIGN KEY (id_dimProduk) REFERENCES dimProduk(id_dimProduk),
    FOREIGN KEY (id_dimDate) REFERENCES dimDateVal(id_dimDate)
);

DROP TABLE factTransaction;
