<?php
session_start();
include "koneksi.php";
include "csrf.php";

$id = $_POST['id'];
$query = "SELECT * FROM anggota WHERE id = ? ORDER BY id DESC";
$sql = $db1->prepare($query);
$sql->bind_param("i", $id);
$sql->execute();
$res1 = $sql->get_result();
while ($row = $res1->fetch_assoc()) {
    $id['id'] = $row['id'];
    $nama['nama'] = $row['nama'];
    $jenis_kelamin['jenis_kelamin'] = $row['jenis_kelamin'];
    $alamat['alamat'] = $row['alamat'];
    $no_telp['no_telp'] = $row['no_telp'];
}
echo json_encode($h);

$db1->close();
?>