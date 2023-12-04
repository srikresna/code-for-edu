<?php
session_start();
if (!empty($_SESSION['username'])) {
    require '../config/koneksi.php';
    require '../fungsi/pesan_kilat.php';
    require '../fungsi/anti_injection.php';
    if (!empty($_GET['jabatan'])) {
        $id = antiinjection($koneksi, $_GET['id']);

        // Cek apakah ada anggota yang terkait dengan jabatan yang akan dihapus
        $queryCekAnggota = "SELECT * FROM anggota WHERE jabatan_id = '$id'";
        $resultCekAnggota = mysqli_query($koneksi, $queryCekAnggota);

        if (mysqli_num_rows($resultCekAnggota) > 0) {
            // Jika ada anggota terkait, hapus dulu anggotanya
            $queryHapusAnggota = "DELETE FROM anggota WHERE jabatan_id = '$id'";
            if (mysqli_query($koneksi, $queryHapusAnggota)) {
                // Setelah menghapus anggota terkait, lanjutkan menghapus jabatannya
                $queryHapusJabatan = "DELETE FROM jabatan WHERE id = '$id'";
                if (mysqli_query($koneksi, $queryHapusJabatan)) {
                    pesan('success', "Jabatan dan Anggota Terkait Telah Terhapus.");
                } else {
                    pesan('danger', "Jabatan Tidak Terhapus Karena: " . mysqli_error($koneksi));
                }
            } else {
                pesan('danger', "Anggota Tidak Terhapus Karena: " . mysqli_error($koneksi));
            }
        } else {
            // Jika tidak ada anggota terkait, langsung hapus jabatannya
            $queryHapusJabatan = "DELETE FROM jabatan WHERE id = '$id'";
            if (mysqli_query($koneksi, $queryHapusJabatan)) {
                pesan('success', "Jabatan Telah Terhapus.");
            } else {
                pesan('danger', "Jabatan Tidak Terhapus Karena: " . mysqli_error($koneksi));
            }
        }

        header("Location: ../index.php?page=jabatan");
    } elseif (!empty($_GET['anggota'])) {
        $id = antiinjection($koneksi, $_GET['id']);
        $query = "DELETE FROM anggota WHERE user_id = '$id'";
        if (mysqli_query($koneksi, $query)) {
            $query2 = "DELETE FROM user WHERE id = '$id'";
            if (mysqli_query($koneksi, $query2)) {
                pesan('success', "Anggota Telah Terhapus.");
            } else {
                pesan('warning', "Data Anggota Terhapus Tetapi Login Tidak Terhapus Karena: " . mysqli_error($koneksi));
            }
        } else {
            pesan('danger', "Anggota Tidak Terhapus Karena: " . mysqli_error($koneksi));
        }
        header("Location: ../index.php?page=anggota");
    } 
}