

-- MIDTEST
CREATE TABLE Books (
    BookID INT NOT NULL PRIMARY KEY,
    Title VARCHAR(255) NOT NULL,
    Author VARCHAR(100) NOT NULL,
    GenreID INT NOT NULL,
    PublicationYear INT NOT NULL,
    FOREIGN KEY (GenreID) REFERENCES Genres(GenreID)
)

CREATE TABLE Genres (
    GenreID INT NOT NULL PRIMARY KEY,
    GenreName VARCHAR(50) NOT NULL
)

CREATE TABLE Users (
    UserID INT NOT NULL PRIMARY KEY,
    Username VARCHAR(25) NOT NULL,
    MembershipType VARCHAR(25) NOT NULL CHECK (MembershipType IN ('platinum', 'gold', 'silver')) 
)

CREATE TABLE Loans (
    LoanID INT NOT NULL PRIMARY KEY,
    BookID INT NOT NULL,
    UserID INT NOT NULL,
    LoanDate DATETIME NOT NULL ,
    ReturnDate DATETIME NOT NULL,
    FOREIGN KEY (BookID) REFERENCES Books(BookID),
    FOREIGN KEY (UserID) REFERENCES Users(UserID)     
)

-- tambahkan data random ke dalam tabel
-- tabel book dan genre punya 10 data
-- tabel user punya 5 data
-- tabel loan punya 25 data yang acak (random)

INSERT INTO Genres (GenreID, GenreName) VALUES (1, 'Action'), (2, 'Adventure'),
    (3, 'Comedy'), (4, 'Drama'), 
    (5, 'Fantasy'), (6, 'Horror'),
    (7, 'Mystery'), (8, 'Romance'),
    (9, 'Thriller'), (10, 'Western');

INSERT INTO Books (BookID, Title, Author, GenreID, PublicationYear) VALUES 
    (1, 'Perjalanan Mengkredit Kitab Suci', 'Sun Wukong', 5, 2021),
    (2, 'Kuntilanak Heri Poter', 'J.K. Guling', 6, 2003),
    (3, 'Lubang Semut Tempat Tinggal Beruang', 'Tsar Merah', 7, 2020),
    (4, 'Romansa Jawa Tenggara', 'Nenek Gayung', 8, 1813),
    (5, 'Kengerian Sumpah Panu', 'Heri Kopling', 9, 2005),
    (6, 'Negaraku Ternyata Hasil Giveaway', 'Barikade Omaga', 10, 2005),
    (7, 'Uzumaki JOKO Pewaris Dunia Ninja', 'Masaksih Ajinomoto', 1, 1956),
    (8, 'Si Botak Penakluk Komodo', 'Barudak Well', 2, 1945),
    (9, 'Kamus Lelucon Bapak Bapak', 'Nurhadi Aldo', 3, 1936),
    (10, 'Caraku Menjadi Teladan Tanpa Sekolah No Root', 'Soehadji', 4, 2012);

INSERT INTO Users (UserID, Username, MembershipType) VALUES 
    (1, 'srikresna', 'platinum'),
    (2, 'stipen', 'gold'),
    (3, 'dapis', 'silver'),
    (4, 'sucipto', 'platinum'),
    (5, 'maol', 'gold');

INSERT INTO Loans (LoanID, BookID, UserID, LoanDate, ReturnDate)
SELECT
    ROW_NUMBER() OVER (ORDER BY NEWID()) AS LoanID,
    b.BookID,
    u.UserID,
    DATEADD(day, -FLOOR(RAND(CHECKSUM(NEWID())) * 30), GETDATE()) AS LoanDate,
    DATEADD(day, 7, DATEADD(day, -FLOOR(RAND(CHECKSUM(NEWID())) * 30), GETDATE())) AS ReturnDate
FROM
    Books b
    CROSS JOIN Users u
ORDER BY NEWID()
OFFSET 0 ROWS FETCH FIRST 25 ROWS ONLY;

INSERT INTO Loans (LoanID, BookID, UserID, LoanDate, ReturnDate)
VALUES
    (1, 10, 2, '2021-05-10 23:26:11.753', '2021-10-17 23:26:11.753'),
    (2, 5, 5, '2022-09-10 23:26:11.753', '2020-01-17 23:26:11.753'),
    (5, 4, 3, '2022-12-10 23:26:11.753', '2019-11-17 23:26:11.753'),
    (6, 4, 5, '2023-07-10 23:26:11.753', '2023-03-17 23:26:11.753'),
    (8, 6, 1, '2020-03-10 23:26:11.753', '2023-06-17 23:26:11.753'),
    (11, 2, 4, '2021-12-10 23:26:11.753', '2020-12-17 23:26:11.753'),
    (12, 2, 5, '2023-10-10 23:26:11.753', '2019-09-17 23:26:11.753'),
    (13, 7, 5, '2022-02-10 23:26:11.753', '2022-08-17 23:26:11.753'),
    (15, 10, 4, '2022-07-10 23:26:11.753', '2020-06-17 23:26:11.753'),
    (19, 4, 2, '2021-08-10 23:26:11.753', '2021-06-17 23:26:11.753'),
    (20, 7, 4, '2020-07-10 23:26:11.753', '2020-02-17 23:26:11.753'),
    (21, 2, 1, '2019-09-10 23:26:11.753', '2021-09-17 23:26:11.753'),
    (23, 3, 1, '2020-08-10 23:26:11.753', '2021-08-17 23:26:11.753'),
    (24, 8, 4, '2021-02-10 23:26:11.753', '2021-12-17 23:26:11.753'),
    (27, 4, 4, '2021-07-10 23:26:11.753', '2022-11-17 23:26:11.753'),
    (28, 3, 4, '2022-06-10 23:26:11.753', '2020-10-17 23:26:11.753'),
    (29, 7, 2, '2022-10-10 23:26:11.753', '2023-09-17 23:26:11.753'),
    (30, 6, 2, '2023-09-10 23:26:11.753', '2020-05-17 23:26:11.753'),
    (39, 6, 4, '2020-02-10 23:26:11.753', '2020-04-17 23:26:11.753'),
    (41, 10, 3, '2023-02-10 23:26:11.753', '2023-08-17 23:26:11.753'),
    (42, 10, 1, '2022-05-10 23:26:11.753', '2022-05-17 23:26:11.753'),
    (43, 8, 3, '2022-08-10 23:26:11.753', '2023-07-17 23:26:11.753'),
    (44, 9, 1, '2021-06-10 23:26:11.753', '2021-03-17 23:26:11.753'),
    (46, 6, 3, '2020-04-10 23:26:11.753', '2023-01-17 23:26:11.753'),
    (50, 2, 3, '2023-08-10 23:26:11.753', '2023-02-17 23:26:11.753');


-- 1. Buatlah diagram relasi dari keempat tabel tersebut.
-- Each book in the "Books" table is associated with a genre through the "GenreID" foreign key, creating a one-to-many relationship with the "Genres" table.
-- Each loan in the "Loans" table is associated with a book through the "BookID" foreign key, creating a one-to-many relationship with the "Books" table.
-- Each loan in the "Loans" table is associated with a user through the "UserID" foreign key, creating a one-to-many relationship with the "Users" table.

-- 2. Tampilkan semua isi semua tabel yang ada.
SELECT * FROM Books;
SELECT * FROM Genres;
SELECT * FROM Users;
SELECT * FROM Loans;

-- 3. Tampilkan semua judul buku beserta nama penulisnya yang belum pernah dipinjam.
SELECT Title, Author FROM Books
WHERE BookID NOT IN (SELECT BookID FROM Loans);

-- 4. Buatlah query untuk menemukan jumlah buku yang dipinjam per genre.
SELECT g.GenreName, COUNT(b.BookID) AS JumlahBuku
FROM Genres AS g
INNER JOIN Books AS b ON b.GenreID = g.GenreID
INNER JOIN Loans AS l ON l.BookID = b.BookID
GROUP BY g.GenreName;


-- 5. Carilah jumlah total peminjaman per pengguna.
SELECT u.Username, COUNT(l.LoanID) AS JumlahPeminjaman
FROM Users AS u
INNER JOIN Loans AS l ON l.UserID = u.UserID
GROUP BY u.Username;


-- 6. Buat query untuk menampilkan buku yang paling sering dipinjam.
SELECT b.Title, COUNT(l.LoanID) AS JumlahPeminjaman
FROM Books AS b
INNER JOIN Loans AS l ON l.BookID = b.BookID
GROUP BY b.Title
ORDER BY JumlahPeminjaman DESC;


-- 7. Tentukan rata-rata lama waktu peminjaman untuk setiap buku.
SELECT b.Title, AVG(DATEDIFF(DAY, l.LoanDate, l.ReturnDate)) AS RataWaktuPeminjaman
FROM Books AS b
INNER JOIN Loans AS l ON l.BookID = b.BookID
GROUP BY b.Title;

-- 8. Buatlah daftar pengguna dengan jumlah peminjaman di atas rata-rata.
SELECT u.Username, COUNT(l.LoanID) AS JumlahPeminjaman
FROM Users AS u
INNER JOIN Loans AS l ON l.UserID = u.UserID
GROUP BY u.Username
HAVING COUNT(l.LoanID) > (SELECT AVG(JumlahPeminjaman) FROM (SELECT COUNT(l.LoanID) AS JumlahPeminjaman FROM Users AS u INNER JOIN Loans AS l ON l.UserID = u.UserID GROUP BY u.Username) AS Subquery);


-- 9. Tampilkan histori peminjaman untuk buku dengan BookID tertentu.
SELECT b.Title, u.Username, l.LoanDate, l.ReturnDate
FROM Books AS b
INNER JOIN Loans AS l ON l.BookID = b.BookID
INNER JOIN Users AS u ON u.UserID = l.UserID
WHERE b.BookID = 1;


-- 10. Cari tahu siapa yang meminjam buku tertentu pada tanggal nya saja yang  spesifik.
UPDATE Loans
SET LoanDate = CAST(LoanDate AS DATE),
    ReturnDate = CAST(ReturnDate AS DATE);

SELECT b.Title, u.Username, l.LoanDate, l.ReturnDate
FROM Books AS b
INNER JOIN Loans AS l ON l.BookID = b.BookID
INNER JOIN Users AS u ON u.UserID = l.UserID
WHERE b.BookID = 1 AND l.LoanDate = '2021-05-10';





-- 11. Buatlah query untuk menampilkan buku yang paling lama dipinjam.
SELECT b.Title, DATEDIFF(DAY, l.LoanDate, l.ReturnDate) AS LamaPeminjaman
FROM Books AS b
INNER JOIN Loans AS l ON l.BookID = b.BookID
ORDER BY LamaPeminjaman DESC;



-- 12. Gunakan operasi pivoting untuk menampilkan jumlah buku yang dipinjam per bulan dalam tahun terakhir
SELECT * FROM (
    SELECT DATENAME(MONTH, l.LoanDate) AS Bulan, COUNT(l.LoanID) AS JumlahPeminjaman
    FROM Loans AS l
    WHERE YEAR(l.LoanDate) = 2021
    GROUP BY DATENAME(MONTH, l.LoanDate)
) AS Subquery
PIVOT (
    SUM(JumlahPeminjaman)
    FOR Bulan IN (January, February, March, April, May, June, July, August, September, October, November, December)
) AS Pivoting;


