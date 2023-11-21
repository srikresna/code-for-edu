<?php
include('koneksi.php');

$aksi = $_GET['aksi'];
$nama = $_POST['nama'];
$jenis_kelamin = $_POST['jenis_kelamin'];
$alamat = $_POST['alamat'];
$no_telp = $_POST['no_telp'];

if ($aksi == 'tambah') {
    $query = "INSERT INTO anggota (nama, jenis_kelamin, alamat, no_telp) 
              VALUES ('$nama', '$jenis_kelamin', '$alamat', '$no_telp')";

    if (mysqli_query($connect, $query)) {
        header('Location: index.php');
        exit();
    } else {
        echo "Gagal menambahkan data : " . mysqli_error($connect);
    }
} elseif ($aksi == 'ubah') {
    if (isset($_POST['id'])) {
        $id = $_POST['id'];
        $query = "UPDATE anggota SET nama = '$nama', jenis_kelamin = '$jenis_kelamin', 
                  alamat = '$alamat', no_telp = '$no_telp' WHERE id = $id";

        if (mysqli_query($connect, $query)) {
            header('Location: index.php');
            exit();
        } else {
            echo "Gagal mengubah data : " . mysqli_error($connect);
        }
    } else {
        echo "ID tidak tersedia";
    }
} elseif ($aksi == 'hapus') {
    if (isset($_GET['id'])) {
        $id = $_GET['id'];
        $query = "DELETE FROM anggota WHERE id = $id";

        if (mysqli_query($connect, $query)) {
            header('Location: index.php');
            exit();
        } else {
            echo "Gagal menghapus data : " . mysqli_error($connect);
        }
    } else {
        echo "ID tidak tersedia";
    }
} else {
    header("Location: index.php");
}


mysqli_close($connect);
