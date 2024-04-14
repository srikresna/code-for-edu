<?php
session_start();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pendaftaran Member Clan EPEP</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <form autocomplete="off">
            <h4>Pendaftaran Member clan </h4>
            <div class="input-selection">
                <label>Nama Depan<span class="required"></span></label>
                <input type="text" placeholder="Masukkan Nama Depan" id="first-name-input" value="<?php echo isset($_SESSION['data_pendaftaran']['nama_depan']) ? $_SESSION['data_pendaftaran']['nama_depan'] : ''; ?>" required>
                <span id="first-name-error" class="hide required-color-error-message">Nama tidak boleh kosong</span><br/>
            </div>
            <div class="input-selection">
                <label>Nama Belakang<span class="required"></span></label>
                <input type="text" placeholder="Masukkan Nama Belakang" id="last-name-input" value="<?php echo isset($_SESSION['data_pendaftaran']['nama_belakang']) ? $_SESSION['data_pendaftaran']['nama_belakang'] : ''; ?>" required>
                <span id="last-name-error" class="hide required-color-error-message">Nama tidak boleh kosong</span><br/>

            </div>
            <div class="input-selection">
                <label>Nama Player(in game name)<span class="required"></span></label>
                <input type="text" placeholder="Masukkan Nama Player" id="player-name" value="<?php echo isset($_SESSION['data_pendaftaran']['nama_player']) ? $_SESSION['data_pendaftaran']['nama_player'] : ''; ?>" required>
                <span id="player-name-error" class="hide required-color-error-message">Nama player tidak boleh kosong</span><br/>
                
            </div>
            <div class="input-selection">
                <label>No Hp<span class="required"></span></label>
                <input type="number" placeholder="Masukkan No Hp" id="phone-number" value="<?php echo isset($_SESSION['data_pendaftaran']['no_hp']) ? $_SESSION['data_pendaftaran']['no_hp'] : ''; ?>" required>
                <span id="phone-error" class="hide required-color-error-message">No Hp tidak boleh kosong</span><br/>
                
            </div>
            <div class="input-selection">
                <label>Provinsi<span class="required"></span></label>
                <input type="text" placeholder="Masukkan Provinsi" id="provinsi-name" value="<?php echo isset($_SESSION['data_pendaftaran']['provinsi']) ? $_SESSION['data_pendaftaran']['provinsi'] : ''; ?>" required>
                <span id="provinsi-name-error" class="hide required-color-error-message">Provinsi tidak boleh kosong</span><br/>
                
            </div>
            <button type="submit" id="submit-button">Submit</button>

        </form>
    </div>
    <script src="jquery.js"></script>
    
</body>
</html>