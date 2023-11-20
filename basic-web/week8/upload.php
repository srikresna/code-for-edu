<?php
if (isset($_POST["submit"])) {
    $targetDirectory = "uploads/";
    $targetFile = $targetDirectory . basename($_FILES["fileToUpload"]["name"]);
    $fileType = strtolower(pathinfo($targetFile, PATHINFO_EXTENSION));

    $allowedExtensions = array("jpg", "jpeg", "png", "gif");

    $maxFileSize = 5 * 1024 * 1024; // 5 MB

    if (in_array($fileType, $allowedExtensions) && $_FILES["fileToUpload"]["size"] <= $maxFileSize) {
        if (move_uploaded_file($_FILES["fileToUpload"]["tmp_name"], $targetFile)) {
            
            list($width, $height) = getimagesize($targetFile);
            $newWidth = 200;
            $newHeight = ($newWidth / $width) * $height;

            $resizedImage = imagecreatetruecolor($newWidth, $newHeight);
            // jpeg or jpg only
            $sourceImage = imagecreatefromjpeg($targetFile); 
            imagecopyresized($resizedImage, $sourceImage, 0, 0, 0, 0, $newWidth, $newHeight, $width, $height);
            imagejpeg($resizedImage, $targetFile);

            // Hapus gambar yang belum diubah ukurannya
            imagedestroy($sourceImage);
            imagedestroy($resizedImage);

            echo "The file " . basename($_FILES["fileToUpload"]["name"]) . " has been uploaded and resized.";
        } else {
            echo "Sorry, there was an error uploading your file.";
        }
    } else {
        echo "Sorry, only JPG, JPEG, PNG, and GIF files are allowed.";
    }
}
?>
