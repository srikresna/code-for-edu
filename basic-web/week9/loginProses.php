<?php
include "koneksi.php";

$username = $_POST['username'];
$password = $_POST['password'];

$query = "SELECT * FROM user WHERE username='$username' AND password='$password'";
$result = mysqli_query($connect, $query);
$cek = mysqli_num_rows($result);

if($cek) {
    echo "Anda berhasil login, silahkan menuju"; ?>
    <a href="index.php">Halaman HOME</a>
    <?php
} else {
    echo "Login gagal! username dan password salah!";
}