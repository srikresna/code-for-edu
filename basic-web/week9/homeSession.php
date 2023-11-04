<html>
    <head></head>
    <body>
        <?php
        session_start();

        if ($_SESSION['status'] == 'login') {
            echo "Selamat datang, " . $_SESSION['username'] . "!<br>";
            ?>
            <br> <a href = "sessionLogout.php"> Log Out</a>
            <?php
        } else {
            echo "Anda belum login, silahkan " ?>
            <a href = "sessionLogForm.php">Log In</a>
            <?php
        }
        ?>
    </body>
</html>