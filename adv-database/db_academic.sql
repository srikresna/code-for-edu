CREATE DATABASE db_academic;
USE DATABASE db_academic;

CREATE TABLE Mahasiwa (No_Mhs CHAR(7) PRIMARY KEY, Nama_mhs CHAR(50));
CREATE TABLE Mata_Kuliah (Kd_MK CHAR(5) PRIMARY KEY, Nama_MK CHAR(50));
CREATE TABLE Nilai (No_Mhs CHAR(7), Kd_MK CHAR(5));

-- add jurusan column in the last table of mahasiswa
ALTER TABLE Mahasiwa ADD COLUMN Jurusan CHAR(6);

-- add Kd_Dosen in the last table of Mata_Kuliah
ALTER TABLE Mata_Kuliah ADD COLUMN Kd_Dosen CHAR(4);

-- add nilai column in the table of Nilai, then add foreign key
ALTER TABLE Nilai ADD COLUMN nilai INTEGER;
ALTER TABLE Nilai ADD FOREIGN KEY (No_Mhs) REFERENCES Mahasiwa(No_Mhs);
ALTER TABLE Nilai ADD FOREIGN KEY (Kd_MK) REFERENCES Mata_Kuliah(Kd_MK);

-- create dosen table
CREATE TABLE Dosen (Kd_Dosen CHAR(4) PRIMARY KEY, Nama_Dosen CHAR(50));

-- insert data
INSERT INTO Mahasiwa (No_Mhs, Nama_mhs, Jurusan) VALUES ('1921000', 'Aminah', 'MI');
INSERT INTO Mahasiwa (No_Mhs, Nama_mhs, Jurusan) VALUES ('1921001', 'Budiman', 'MI');
INSERT INTO Mahasiwa (No_Mhs, Nama_mhs, Jurusan) VALUES ('1921002', 'Carina', 'MI');
INSERT INTO Mahasiwa (No_Mhs, Nama_mhs, Jurusan) VALUES ('1921003', 'Della', 'TI');
INSERT INTO Mahasiwa (No_Mhs, Nama_mhs, Jurusan) VALUES ('1921004', 'Firda', 'TI');

INSERT INTO Mata_Kuliah (Kd_MK, Nama_MK, Kd_Dosen) VALUES ('MI350', 'Basis Data', 'B104');
INSERT INTO Mata_Kuliah (Kd_MK, Nama_MK, Kd_Dosen) VALUES ('MI465', 'Pemrograman', 'B105');
INSERT INTO Mata_Kuliah (Kd_MK, Nama_MK, Kd_Dosen) VALUES ('TI201', 'Mobile', 'C102');

INSERT INTO Nilai (No_Mhs, Kd_MK, nilai) VALUES ('1921000', 'MI350', 85);
INSERT INTO Nilai (No_Mhs, Kd_MK, nilai) VALUES ('1921001', 'MI465', 87);
INSERT INTO Nilai (No_Mhs, Kd_MK, nilai) VALUES ('1921002', 'MI465', 85);
INSERT INTO Nilai (No_Mhs, Kd_MK, nilai) VALUES ('1921003', 'TI201', 78);
INSERT INTO Nilai (No_Mhs, Kd_MK, nilai) VALUES ('1921004', 'TI201', 80);

INSERT INTO Dosen (Kd_Dosen, Nama_Dosen) VALUES ('B104', 'Ati');
INSERT INTO Dosen (Kd_Dosen, Nama_Dosen) VALUES ('B105', 'Dita');
INSERT INTO Dosen (Kd_Dosen, Nama_Dosen) VALUES ('C102', 'Leo');


-- add foreign for each table
ALTER TABLE Mata_Kuliah ADD FOREIGN KEY (Kd_Dosen) REFERENCES Dosen(Kd_Dosen);
ALTER TABLE Nilai ADD FOREIGN KEY (No_Mhs) REFERENCES Mahasiwa(No_Mhs);
ALTER TABLE Nilai ADD FOREIGN KEY (Kd_MK) REFERENCES Mata_Kuliah(Kd_MK);

-- show all data
SELECT * FROM Mahasiwa;
SELECT * FROM Mata_Kuliah;
SELECT * FROM Nilai;
SELECT * FROM Dosen;


-- show table No_Mhs, Nama_mhs, Jurusan, Kd_MK, Nama_MK, Kd_dosen, Nm_dosen, nilai
SELECT Mahasiwa.No_Mhs, Mahasiwa.Nama_mhs, Mahasiwa.Jurusan, Mata_Kuliah.Kd_MK, Mata_Kuliah.Nama_MK, Mata_Kuliah.Kd_Dosen, Dosen.Nama_Dosen, Nilai.nilai FROM Mahasiwa, Mata_Kuliah, Dosen, Nilai WHERE Mahasiwa.No_Mhs = Nilai.No_Mhs AND Mata_Kuliah.Kd_MK = Nilai.Kd_MK AND Mata_Kuliah.Kd_Dosen = Dosen.Kd_Dosen;