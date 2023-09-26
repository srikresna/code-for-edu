<?php
$a = 10;
$b = 5;

$hasilTambah = $a + $b;
$hasilKurang = $a - $b;
$hasilKali = $a * $b;
$hasilBagi = $a / $b;
$sisaBagi = $a % $b;
$pangkat = $a ** $b;

echo "Hasil penjumlahan $a dan $b adalah $hasilTambah. <br>";
echo "Hasil pengurangan $a dan $b adalah $hasilKurang. <br>";
echo "Hasil perkalian $a dan $b adalah $hasilKali. <br>";
echo "Hasil pembagian $a dan $b adalah $hasilBagi. <br>";
echo "Hasil sisa bagi $a dan $b adalah $sisaBagi. <br>";
echo "Hasil pangkat $a dan $b adalah $pangkat. <br>";

echo "<br>";
//tambahan

$hasilSama = $a == $b;
$hasilTidakSama = $a != $b;
$hasilLebihBesar = $a > $b;
$hasilLebihKecil = $a < $b;
$hasilLebihKecilSama = $a <= $b;
$hasilLebihBesarSama = $a >= $b;

echo "Hasil sama dengan $a dan $b adalah $hasilSama. <br>";
echo "Hasil tidak sama dengan $a dan $b adalah $hasilTidakSama. <br>";
echo "Hasil lebih besar dari $a dan $b adalah $hasilLebihBesar. <br>";
echo "Hasil lebih kecil dari $a dan $b adalah $hasilLebihKecil. <br>";
echo "Hasil lebih kecil sama dengan $a dan $b adalah $hasilLebihKecilSama. <br>";
echo "Hasil lebih besar sama dengan $a dan $b adalah $hasilLebihBesarSama. <br>";

echo "<br>";
//tambahan

$hasilAnd = $a && $b;
$hasilOr = $a || $b;
$hasilNotA = !$a;
$hasilNotB = !$b;

echo "Hasil AND $a dan $b adalah $hasilAnd. <br>";
echo "Hasil OR $a dan $b adalah $hasilOr. <br>";
echo "Hasil NOT $a adalah $hasilNotA. <br>";
echo "Hasil NOT $b adalah $hasilNotB. <br>";

echo "<br>";
//tambahan
$a += $b;
$a -= $b;
$a *= $b;
$a /= $b;
$a %= $b;

echo "Hasil += $a dan $b adalah $a. <br>";
echo "Hasil -= $a dan $b adalah $a. <br>";  
echo "Hasil *= $a dan $b adalah $a. <br>";
echo "Hasil /= $a dan $b adalah $a. <br>";
echo "Hasil %= $a dan $b adalah $a. <br>";

echo "<br>";
//tambahan
$hasilIdentik = $a === $b;
$hasilTidakIdentik = $a !== $b;

echo "Hasil identik $a dan $b adalah $hasilIdentik. <br>";
echo "Hasil tidak identik $a dan $b adalah $hasilTidakIdentik. <br>";

echo "<br>";
// soal cerita : Sebuah restoran memiliki 45 kursi di dalamnya.
// Pada suatu malam, 28 ursi telah ditempati oleh penlanggan. Berapa persen kursi yang masih kosong di restoran tersebut?

$kursi = 45;
$terisi = 28;
$kosong = $kursi - $terisi;
$persen = ($kosong / $kursi) * 100;

echo "Jumlah kursi : $kursi <br>";
echo "Jumlah kursi yang terisi : $terisi <br>";
echo "Jumlah kursi yang kosong : $kosong <br>";
echo "Persentase kursi yang kosong : $persen % <br>";

?>