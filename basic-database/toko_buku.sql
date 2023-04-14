CREATE DATABASE toko_buku;

USE toko_buku;

CREATE TABLE buku (
    id_buku INT PRIMARY KEY,
    judul VARCHAR(100) NOT NULL,
    penulis VARCHAR(50) NOT NULL,
    penerbit VARCHAR(50) NOT NULL,
    tahun_terbit YEAR NOT NULL,
    harga DECIMAL(10,2) NOT NULL
);

CREATE TABLE pelanggan (
    id_pelanggan INT PRIMARY KEY,
    nama VARCHAR(50) NOT NULL,
    alamat VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL,
    telepon VARCHAR(20) NOT NULL
);

CREATE TABLE penjualan (
    id_penjualan INT PRIMARY KEY,
    id_buku INT,
    id_pelanggan INT,
    jumlah_beli INT NOT NULL,
    tanggal_beli DATE NOT NULL,
    FOREIGN KEY (id_buku) REFERENCES buku(id_buku),
    FOREIGN KEY (id_pelanggan) REFERENCES pelanggan(id_pelanggan)
);
