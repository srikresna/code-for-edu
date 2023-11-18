<?php
$text = "11233445555555677789";
$pattern = '/5{3,5}/';

if (preg_match($pattern, $text, $matches)) {
    echo "Cocokkan: " . $matches[0];
} else {
    echo "Tidak ada yang cocok";
}
?>
