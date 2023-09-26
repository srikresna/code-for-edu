<?php
$nilaiNumerik = 92;

if ($nilaiNumerik >= 90 && $nilaiNumerik <= 100) {
    echo "Nilai huruf: A";
} elseif ($nilaiNumerik >= 80 && $nilaiNumerik < 90) {
    echo "Nilai huruf: B";
} elseif ($nilaiNumerik >= 70 && $nilaiNumerik < 80) {
    echo "Nilai huruf: C";
} elseif ($nilaiNumerik < 70) {
    echo "Nilai huruf: D";
}

echo "<br>";

echo "<br>";
$jarakSaatIni = 0;
$jarakTarget = 500;
$peningkatanHarian = 30;
$hari = 0;

while ($jarakSaatIni < $jarakTarget) {
    $jarakSaatIni += $peningkatanHarian;
    $hari++;
}

echo "Atlet tersebut memerlukan $hari hari untuk mencapai jarak 500 kilometer.";

echo "<br>";

echo "<br>";
$jumlahLahan = 10;
$tanamanPerLahan = 5;
$buahPerTanaman = 10;
$jumlahBuah = 0;

for ($i = 1; $i <= $jumlahLahan; $i++) {
    $jumlahBuah += ($tanamanPerLahan * $buahPerTanaman);
}

echo "Jumlah buah yang akan dipanen adalah: $jumlahBuah";

echo "<br>";

echo "<br>";
$skorUjian = [85, 92, 78, 96, 88];
$totalSkor = 0;

foreach ($skorUjian as $skor) {
    $totalSkor += $skor;
}

echo "Total skor ujian adalah: $totalSkor";

echo "<br>";

echo "<br>";
$nilaiSiswa = [85, 92, 58, 64, 90, 55, 88, 79, 70, 96];

foreach ($nilaiSiswa as $nilai) {
    if ($nilai < 60) {
        echo "Nilai: $nilai (Tidak lulus) <br>";
        continue;
    }
    echo "Nilai: $nilai (Lulus) <br>";
}

echo "<br>";

echo "<br>";
// soal cerita 1
// ada seorang guru ingin menghitung total nilai dari 10 siswa dalam ujian matematika. Guru ini ingin mengabaikan dua nilai tertinggi dan dua nilai terendah. Bantu guru ini menghitung total nilai yang akan digunakan untuk menentukan nilai rata-rata setelah mengabaikan nilai tertingi dan terendah. Berikut daftar nilai dari 10 siswa (85, 92, 78, 64, 90, 75, 88, 79, 70, 96)

$nilaiSiswa = [85, 92, 78, 64, 90, 75, 88, 79, 70, 96];
$totalNilai = 0;
$nilaiTertinggi = 0;
$nilaiTerendah = 100;

foreach ($nilaiSiswa as $nilai) {
    if ($nilai > $nilaiTertinggi) {
        $nilaiTertinggi = $nilai;
    }
    if ($nilai < $nilaiTerendah) {
        $nilaiTerendah = $nilai;
    }
    $totalNilai += $nilai;
}

$totalNilai -= ($nilaiTertinggi + $nilaiTerendah);
echo "Total nilai siswa adalah: $totalNilai <br>";
echo "Nilai tertinggi adalah: $nilaiTertinggi <br>";
echo "Nilai terendah adalah: $nilaiTerendah <br>";


echo "<br>";

//soal cerita 2
// Seorang pelanggan ingin membeli sebuah produk dengan harga Rp 120.000. Toko tersebut menawarkan diskon sebesar 20% untuk pembelian di atas Rp 100.000. Bantu pelanggan ini untuk menghitung harga yang harus dibayar setelah mendapatkan diskon.

$hargaProduk = 120000;
$diskon = 0.2;
$hargaDiskon = $hargaProduk * $diskon;
$hargaTotal = $hargaProduk - $hargaDiskon;

if ($hargaProduk > 100000) {
    echo "Harga produk: $hargaProduk <br>";
    echo "Diskon: $hargaDiskon <br>";
    echo "Harga total: $hargaTotal <br>";
} else {
    echo "Harga produk: $hargaProduk <br>";
    echo "Diskon: 0 <br>";
    echo "Harga total: $hargaProduk <br>";
}

echo "<br>";

//soal cerita 3
// Seorang pemain game ingin menghitung total skor mereka dalam permainan. Mereka mendapatkan skor berdasarkan poin yang mereka kumpulkan. Jika mereka memiliki lebih dari 500 poin, maka mereka akan mendapatkan hadiah tambahan. Buat tampilan baris pertama “Total skor pemain adalah: (poin)”. Dan baris kedua “Apakah pemain mendapatkan hadiah tambahan? (YA/TIDAK)”
// harus menggunakan ternary

$skor = 600;
$hadiah = $skor > 500 ? "YA" : "TIDAK";

echo "Total skor pemain adalah: $skor <br>";
echo "Apakah pemain mendapatkan hadiah tambahan? $hadiah <br>";

echo "<br>";