void main() {
  var gifts = {
    // Key:    Value
    'first': 'partridge',
    'second': 'turtledoves',
    'fifth': 1,
    'name' : 'Davis Maulana Hermanto',
    'nim' : '2241720255',
  };
  var nobleGases = {
    2: 'helium',
    10: 'neon',
    18: 2,
    20: 'Davis Maulana Hermanto',
    22: '2241720255',
  };

  var mhs1 = Map<String, String>();
  mhs1['first'] = 'partridge';
  mhs1['second'] = 'turtledoves';
  mhs1['fifth'] = 'golden rings';
  mhs1['name'] = 'Davis Maulana Hermanto';
  mhs1['nim'] = '2241720255';

  var mhs2 = Map<int, String>();
  mhs2[2] = 'helium';
  mhs2[10] = 'neon';
  mhs2[18] = 'argon';
  mhs2[20] = 'Davis Maulana Hermanto';
  mhs2[22] = '2241720255';

  print(mhs1);
  print(mhs2);

  print(gifts);
  print(nobleGases);
}