<!DOCTYPE html>
<html>
    <head>
        <title>Multiupload Dokumen</title>
    </head>
    <body>
        <h2>Unggah Dokumen</h2>
        <form action="proses_upload.php" method="post" enctype="multipart/form-data">
            <!-- multiple images files -->
            <input type="file" name="files[]" multiple="multiple" accept=".jpg, .jpeg, .png">
            <br>
            <input type="submit" value="Unggah" name="unggah">

        </body>
</html>