// void main(){
//   var halogens = {'fluorine', 'chlorine', 'bromine', 'iodine', 'astatine'};
//   print(halogens);
// }

// void main() {
//   var names1 = <String>{};
//   Set<String> names2 = {}; // This works, too.
//   var names3 = {}; // Creates a map, not a set.

//   print(names1);
//   print(names2);
//   print(names3);
// }

void main() {
  var names1 = <String>{}; 
  Set<String> names2 = {}; 
  var names3 = {}; 

  // Adding element by using .add()
  names1.add("Davis Maulana Hermanto"); 
  names1.add("2241720255");  

  // Adding element by using .addAll()
  names2.addAll(["Davis Maulana Hermanto", "2241720255"]); 

  print("names1 (Set): $names1");
  print("names2 (Set): $names2");

  // Map names3
  names3["Name"] = "Davis Maulana Hermanto"; 
  names3["NIM"] = "2241720255";   
  

  print("names3 (Map): $names3");
}