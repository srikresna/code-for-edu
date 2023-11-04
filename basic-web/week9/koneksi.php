<?php
$servername = "127.0.0.1";
$username = "root";
$dbname = "prakwebdb";

$connect = mysqli_connect($servername, $username, '', $dbname);

if (!$connect) {
    die("Koneksi gagal: " . mysqli_connect_error());
} else {
    echo "Koneksi berhasil";
}

?>