<?php
$servername = "127.0.0.1";
$username = "root";
$dbname = "prakwebdb";

$conn = mysqli_connect($servername, $username, '', $dbname);

if (!$conn) {
    die("Koneksi gagal: " . mysqli_connect_error());
}

$query_create_table = "CREATE TABLE user (
    id INT(11) AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL
)";

if (mysqli_query($conn, $query_create_table)) {
    echo "Tabel user berhasil dibuat";
} else {
    echo "Error: " . mysqli_error($conn);
}

$query_insert_data = "INSERT INTO user (username, password)
VALUES ('admin', '123')";

if (mysqli_query($conn, $query_insert_data)) {
    echo " Data berhasil diinsert";
} else {
    echo "Error: " . $query_insert_data . "<br>" . mysqli_error($conn);
}


mysqli_close($conn);
?>