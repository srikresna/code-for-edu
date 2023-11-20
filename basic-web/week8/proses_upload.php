<?php
if (isset($_POST["unggah"])) {
    $targetDirectory = "documents/";

    if (!file_exists($targetDirectory)) {
        mkdir($targetDirectory, 0777, true);
    }

    if ($_FILES["files"]["name"][0]) {
        $totalFiles = count($_FILES["files"]["name"]);

        for ($i = 0; $i < $totalFiles; $i++) {
            $fileName = $_FILES['files']['name'][$i];
            $targetFile = $targetDirectory . $fileName;

            if (move_uploaded_file($_FILES["files"]["tmp_name"][$i], $targetFile)) {
                echo "File " . $fileName . " berhasil diunggah.<br>";
            } else {
                echo "File " . $fileName . " gagal diunggah.<br>";
            }
        }
    } else {
        echo "Tidak ada file yang diunggah.";
    }
}
