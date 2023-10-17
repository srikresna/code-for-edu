<?php

function perkenalan($nama, $salam="Assalamualaikum") {
    echo $salam.", ";
    echo "Perkenalkan, nama saya ".$nama."<br/>";
    echo "Senang berkenalan dengan anda<br/>";
}

perkenalan("Sri Kresna Maha Dewa", "Hi");

echo "<hr>";

$saya = "Sri Kresna Maha Dewa";
$ucapanSalam = "Selamat Pagi";

perkenalan($saya);

?>