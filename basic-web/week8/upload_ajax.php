<?php
if (isset($_POST['file'])) {
    $errors = array();
    $file_name = $_FILES['file']['name'];
    $file_size = $_FILES['file']['size'];
    $file_tmp = $_FILES['file']['tmp_name'];
    $file_type = $_FILES['file']['type'];
    $file_ext = strtolower(end(explode('.', $_FILES['file']['name'])));
    $extensions = array("pdf", "doc", "docx", "txt");

    if (in_array($file_ext, $extensions) === false) {
        $errors[] = "Ekstensi file tidak diperbolehkan, pilih file dengan ekstensi pdf, doc, docx, atau txt.";
    }

    if ($file_size > 2097152) {
        $errors[] = 'Ukuran file harus lebih kecil dari 2 MB';
    }

    if (empty($errors) == true) {
        move_uploaded_file($file_tmp, "uploads/" . $file_name);
        echo "File berhasil diunggah";
    } else {
        echo implode('<br>', $errors);
    }
}