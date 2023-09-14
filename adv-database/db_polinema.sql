CREATE DATABASE db_polinema;
USE DATABASE db_polinema;


CREATE TABLE mahasiswa(
    nim CHAR(8) PRIMARY KEY,
    nama_mhs CHAR(50),
    jenis_kelamin ENUM('L', 'P') DEFAULT 'L',
    alamat VARCHAR(50),
    no_hp VARCHAR(12),
    kode_prodi CHAR(6),
    FOREIGN KEY fk0 (kode_prodi) REFERENCES prodi(kode_prodi)
)

CREATE TABLE prodi(
    kode_prodi CHAR(6) PRIMARY KEY,
    nama_prodi CHAR(30),
)

CREATE TABLE mata_kuliah (
    mk_id CHAR(10) PRIMARY KEY,
    nama_mk CHAR(50),
    jumlah_jam FLOAT(4, 2),
    sks INTEGER
);


CREATE TABLE ruang (
    ruang_id CHAR(3) PRIMARY KEY,
    nama_ruang CHAR(20),
    kapasitas INTEGER
)

CREATE TABLE dosen (
    nidn INTEGER(20) PRIMARY KEY,
    nama_dosen CHAR(50),
    status ENUM('PNS', 'KONTRAK') DEFAULT 'PNS',
    jenis_kelamin ENUM('L', 'P') DEFAULT 'L',
    no_hp VARCHAR(15),
)

ALTER TABLE mahasiswa ADD COLUMN agama VARCHAR(10);
ALTER TABLE dosen ADD COLUMN alamat VARCHAR(50);

-- insert data
INSERT INTO dosen (nidn, nama_dosen, status, jenis_kelamin, no_hp, alamat) VALUES (1234567890, 'Budi', 'PNS', 'L', '081234567890', 'Jl. Jalan');
INSERT INTO ruang (ruang_id, nama_ruang, kapasitas) VALUES ('A1', 'Ruang A1', 50);
INSERT INTO mata_kuliah (mk_id, nama_mk, jumlah_jam, sks) VALUES ('MK01', 'Database', 6.0, 3);
INSERT INTO prodi (kode_prodi, nama_prodi) VALUES ('TI', 'Teknik Informatika');
INSERT INTO mahasiswa (nim, nama_mhs, jenis_kelamin, alamat, no_hp, kode_prodi, agama) VALUES ('12345678', 'Budi', 'L', 'Jl. Jalan', '081234567890', 'TI', 'Islam');



-- show mahasiswa table
SELECT * FROM mahasiswa;

-- show metadata mahasiswa table
DESCRIBE mahasiswa;

-- drop field asal_sma 
ALTER TABLE mahasiswa DROP COLUMN asal_sma;