<!DOCTYPE html>
<html>
<head>
    <title>Form Input PHP</title>
</head>
<body>
    <h2>Form Input PHP</h2>
    <?php
    // Inisialisasi variabel
    $emailErr = "";
    $email = "";

    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        // Cek apakah input email kosong
        if (empty($_POST["email"])) {
            $emailErr = "Email harus diisi";
        } else {
            $email = $_POST["email"];

            // Validasi format email menggunakan filter_var
            if (filter_var($email, FILTER_VALIDATE_EMAIL)) {
                echo "Email valid: " . $email;
                // Lanjutkan dengan pengolahan email yang aman

            } else {
                $emailErr = "Format email tidak valid";
                // Tangani input yang tidak valid
            }
        }
    }
    ?>
    <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
        <label for="email">Email</label>
        <input type="text" name="email" id="email" value="<?php echo $email; ?>">
        <span class="error"><?php echo $emailErr; ?></span> <br><br>

        <input type="submit" name="submit" value="Submit">
    </form>
</body>
</html>
