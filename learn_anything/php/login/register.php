<?php
session_start();

if (isset($_POST['nama_depan']) && isset($_POST['nama_belakang']) && isset($_POST['nama_player']) && isset($_POST['no_hp']) && isset($_POST['provinsi'])) {

  $nama_depan = $_POST['nama_depan'];
  $nama_belakang = $_POST['nama_belakang'];
  $nama_player = $_POST['nama_player'];
  $no_hp = $_POST['no_hp'];
  $provinsi = $_POST['provinsi'];

  $_SESSION['data_pendaftaran'] = [
    'nama_depan' => $nama_depan,
    'nama_belakang' => $nama_belakang,
    'nama_player' => $nama_player,
    'no_hp' => $no_hp,
    'provinsi' => $provinsi
  ];


  $_SESSION['pesan_flash'] = "Pendaftaran berhasil!";

  header("Location: index.php");
  exit;
}

?>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>Pendaftaran</title>
</head>

<body>
  <h1>Pendaftaran Member Clan</h1>
  <form method="post" action="register.php">
    <label for="nama_depan">Nama Depan:</label>
    <input type="text" name="nama_depan" id="nama_depan" required><br>
    <label for="nama_belakang">Nama Belakang:</label>
    <input type="text" name="nama_belakang" id="nama_belakang" required><br>
    <label for="nama_player">Nama Player:</label>
    <input type="text" name="nama_player" id="nama_player" required><br>
    <label for="no_hp">No HP:</label>
    <input type="number" name="no_hp" id="no_hp" required><br>
    <label for="provinsi">Provinsi:</label>
    <input type="text" name="provinsi" id="provinsi" required><br>
    </select><br>
    <button type="submit">Daftar</button>
  </form>
</body>

</html>
