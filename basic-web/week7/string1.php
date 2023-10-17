<?php

$loremIpsum = "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Earum ipsum, voluptas dolorem molestias alias asperiores dolores recusandae esse, ducimus vero numquam quis ipsam voluptates iste consectetur perferendis eum quasi enim?";

echo "<p>{$loremIpsum}</p>";
echo "Panjang karakter: ". strlen($loremIpsum) . "<br>";
echo "Panjang kata: ". str_word_count($loremIpsum) . "<br>";
echo "<p>" . strtoupper($loremIpsum) . "</p>";
echo "<p>" . strtolower($loremIpsum) . "</p>";

?>