CREATE DATABASE db_pegawai;
USE db_pegawai;

CREATE TABLE Pegawai(Nopegawai CHAR(5) PRIMARY KEY, NamaPegawai CHAR(50))

CREATE TABLE Golongan(Golongan CHAR(1))

CREATE TABLE Proyek(Noproyek CHAR(5) PRIMARY KEY)

CREATE TABLE Proyekpegawai(Noproyek CHAR(5))

-- Add column golongan in the pegawai table in last column
ALTER TABLE Pegawai ADD COLUMN Golongan CHAR(1);

-- Add column besarGaji in the golongan table in last column
ALTER TABLE Golongan ADD COLUMN BesarGaji INTEGER;

-- Add column namaProyek in the proyek table in last column
ALTER TABLE Proyek ADD COLUMN NamaProyek CHAR(10);

-- Add column noPegawai in the proyekpegawai table in last column, then add foreign key
ALTER TABLE Proyekpegawai ADD COLUMN NoPegawai CHAR(5);
ALTER TABLE Proyekpegawai ADD FOREIGN KEY (NoPegawai) REFERENCES Pegawai(NoPegawai);
ALTER TABLE Proyekpegawai ADD FOREIGN KEY (Noproyek) REFERENCES Proyek(Noproyek);

-- insert data
INSERT INTO Pegawai (NoPegawai, NamaPegawai, Golongan) VALUES ('Peg01', 'Anton', 'A');
INSERT INTO Pegawai (NoPegawai, NamaPegawai, Golongan) VALUES ('Peg02', 'Paula', 'B');
INSERT INTO Pegawai (NoPegawai, NamaPegawai, Golongan) VALUES ('Peg03', 'Daniar', 'C');
INSERT INTO Pegawai (NoPegawai, NamaPegawai, Golongan) VALUES ('Peg04', 'Lubis', 'C');
INSERT INTO Pegawai (NoPegawai, NamaPegawai, Golongan) VALUES ('Peg06', 'Koko', 'C');
INSERT INTO Pegawai (NoPegawai, NamaPegawai, Golongan) VALUES ('Peg07', 'Keni', 'B');
INSERT INTO Pegawai (NoPegawai, NamaPegawai, Golongan) VALUES ('Peg08', 'Sofi', 'B');
INSERT INTO Pegawai (NoPegawai, NamaPegawai, Golongan) VALUES ('Peg12', 'Sita', 'B');
INSERT INTO Pegawai (NoPegawai, NamaPegawai, Golongan) VALUES ('Peg14', 'Yusni', 'B');
INSERT INTO Pegawai (NoPegawai, NamaPegawai, Golongan) VALUES ('Peg15', 'Udin', 'D');
INSERT INTO Pegawai (NoPegawai, NamaPegawai, Golongan) VALUES ('Peg16', 'Didit', 'D');
INSERT INTO Pegawai (NoPegawai, NamaPegawai, Golongan) VALUES ('Peg17', 'Dani', 'D');

INSERT INTO Golongan (Golongan, BesarGaji) VALUES ('A', 1000000);
INSERT INTO Golongan (Golongan, BesarGaji) VALUES ('B', 900000);
INSERT INTO Golongan (Golongan, BesarGaji) VALUES ('C', 750000);
INSERT INTO Golongan (Golongan, BesarGaji) VALUES ('D', 500000);

INSERT INTO Proyek (Noproyek, NamaProyek) VALUES ('NP001', 'BRR');
INSERT INTO Proyek (Noproyek, NamaProyek) VALUES ('NP002', 'PEMDA');
INSERT INTO Proyek (Noproyek, NamaProyek) VALUES ('NP003', 'CBR');
INSERT INTO Proyek (Noproyek, NamaProyek) VALUES ('NP004', 'ASK');
INSERT INTO Proyek (Noproyek, NamaProyek) VALUES ('NP005', 'OB');

INSERT INTO Proyekpegawai (Noproyek, NoPegawai) VALUES ('NP001', 'Peg01');
INSERT INTO Proyekpegawai (Noproyek, NoPegawai) VALUES ('NP001', 'Peg02');
INSERT INTO Proyekpegawai (Noproyek, NoPegawai) VALUES ('NP001', 'Peg06');
INSERT INTO Proyekpegawai (Noproyek, NoPegawai) VALUES ('NP002', 'Peg01');
INSERT INTO Proyekpegawai (Noproyek, NoPegawai) VALUES ('NP002', 'Peg12');
INSERT INTO Proyekpegawai (Noproyek, NoPegawai) VALUES ('NP002', 'Peg14');
INSERT INTO Proyekpegawai (Noproyek, NoPegawai) VALUES ('NP003', 'Peg02');
INSERT INTO Proyekpegawai (Noproyek, NoPegawai) VALUES ('NP003', 'Peg03');
INSERT INTO Proyekpegawai (Noproyek, NoPegawai) VALUES ('NP003', 'Peg04');
INSERT INTO Proyekpegawai (Noproyek, NoPegawai) VALUES ('NP004', 'Peg07');
INSERT INTO Proyekpegawai (Noproyek, NoPegawai) VALUES ('NP004', 'Peg08');
INSERT INTO Proyekpegawai (Noproyek, NoPegawai) VALUES ('NP004', 'Peg06');
INSERT INTO Proyekpegawai (Noproyek, NoPegawai) VALUES ('NP005', 'Peg15');
INSERT INTO Proyekpegawai (Noproyek, NoPegawai) VALUES ('NP005', 'Peg16');
INSERT INTO Proyekpegawai (Noproyek, NoPegawai) VALUES ('NP005', 'Peg17');



-- make golongan in the golongan table as primary key
ALTER TABLE Golongan ADD PRIMARY KEY (Golongan);

-- add foreign for each table
ALTER TABLE Pegawai ADD FOREIGN KEY (Golongan) REFERENCES Golongan(Golongan);


-- show table with columns Noproyek, Namaproyek, Nopegawai, NamaPegawai, Golongan, BesarGaji. SORT BY Noproyek
SELECT Proyek.Noproyek, Proyek.NamaProyek, Pegawai.NoPegawai, Pegawai.NamaPegawai, Pegawai.Golongan, Golongan.BesarGaji FROM Proyek, Pegawai, Golongan, Proyekpegawai WHERE Proyek.Noproyek = Proyekpegawai.Noproyek AND Pegawai.NoPegawai = Proyekpegawai.NoPegawai AND Pegawai.Golongan = Golongan.Golongan ORDER BY Proyek.Noproyek;









