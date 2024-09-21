void main() {
  var record = ('first', a: 2, b: true, 'last');
  print(record);

  var test = (1, 2);
  var swapped = tukar(test);

  print('-----------------');

  print('Original: $record');
  print('Swapped: $swapped');

  print('-----------------');

  (String, int) mahasiswa = ('Sri Kresna Maha Dewa', 2241720244);
  print(mahasiswa);

  print('-----------------');

  var mahasiswa2 = ('Sri Kresna Maha Dewa', a: 2241720244, b: true, '');

  print(mahasiswa2.$1); // Prints 'first'
  print(mahasiswa2.a); // Prints 2
  print(mahasiswa2.b); // Prints true
  print(mahasiswa2.$2); // Prints 'last'
}

(int, int) tukar((int, int) record) {
  var (a, b) = record;
  return (b, a);
}