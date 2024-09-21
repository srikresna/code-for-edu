# Practicum 1

* Step 1 :

```dart
void main(){
  var list = [1,2,3];
  assert(list.length == 3);
  assert(list[1] == 2);
  print(list.length);
  print(list[1]);

  list[1] = 1;
  assert(list[1] == 1);
  print(list[1]);
}
```

* Step 2 :

Output :

```dart
3
2
1
```

* Step 3 :

```dart
void main() {
  final List<String?> list = List.filled(5, null); 
  list[1] = "Sri Kresna Maha Dewa"; 
  list[2] = "2241720244";  

  print(list); 
  print(list[1]); 
  print(list[2]); 
}
```

Output :

```dart
[null, Sri Kresna Maha Dewa, 2241720244, null, null]
Sri Kresna Maha Dewa
2241720244
```

# Practicum 2

* Step 1 :

```dart
void main(){
  var halogens = {'fluorine', 'chlorine', 'bromine', 'iodine', 'astatine'};
  print(halogens);
}
```

* Step 2 :

Output :

```dart
{fluorine, chlorine, bromine, iodine, astatine}
```

* Step 3 :

```dart
void main() {
  var names1 = <String>{};
  Set<String> names2 = {}; // This works, too.
  var names3 = {}; // Creates a map, not a set.

  print(names1);
  print(names2);
  print(names3);
}
```

Output :

```dart
{}
{}
{}
```

```dart
void main() {
  var names1 = <String>{}; 
  Set<String> names2 = {}; 
  var names3 = {}; 

  // Adding element by using .add()
  names1.add("Sri Kresna Maha Dewa"); 
  names1.add("2241720244");  

  // Adding element by using .addAll()
  names2.addAll(["Sri Kresna Maha Dewa", "2241720244"]); 

  print("names1 (Set): $names1");
  print("names2 (Set): $names2");

  // Map names3
  names3["Name"] = "Sri Kresna Maha Dewa"; 
  names3["NIM"] = "2241720244";   
  

  print("names3 (Map): $names3");
}
```

output : 

```dart
names1 (Set): {Sri Kresna Maha Dewa, 2241720244}
names2 (Set): {Sri Kresna Maha Dewa, 2241720244}
names3 (Map): {Name: Sri Kresna Maha Dewa, NIM: 2241720244}
```

# Practicum 3

```dart
void main() {
  var gifts = {
    // Key:    Value
    'first': 'partridge',
    'second': 'turtledoves',
    'fifth': 1,
    'name' : 'Sri Kresna Maha Dewa',
    'nim' : '2241720244',
  };
  var nobleGases = {
    2: 'helium',
    10: 'neon',
    18: 2,
    20: 'Sri Kresna Maha Dewa',
    22: '2241720244',
  };

  var mhs1 = Map<String, String>();
  mhs1['first'] = 'partridge';
  mhs1['second'] = 'turtledoves';
  mhs1['fifth'] = 'golden rings';
  mhs1['name'] = 'Sri Kresna Maha Dewa';
  mhs1['nim'] = '2241720244';

  var mhs2 = Map<int, String>();
  mhs2[2] = 'helium';
  mhs2[10] = 'neon';
  mhs2[18] = 'argon';
  mhs2[20] = 'Sri Kresna Maha Dewa';
  mhs2[22] = '2241720244';

  print(mhs1);
  print(mhs2);

  print(gifts);
  print(nobleGases);
}
```

Output :

```dart
{first: partridge, second: turtledoves, fifth: golden rings, name: Sri Kresna Maha Dewa, nim: 2241720244}
{2: helium, 10: neon, 18: argon, 20: Sri Kresna Maha Dewa, 22: 2241720244}
{first: partridge, second: turtledoves, fifth: 1, name: Sri Kresna Maha Dewa, nim: 2241720244}
{2: helium, 10: neon, 18: 2, 20: Sri Kresna Maha Dewa, 22: 2241720244}
```

# Practicum 4

```dart
void main() {
  var list = [1, 2, 3];
  var list2 = [0, ...list];
  print(list);
  print(list2);
  print(list2.length);

  var list1 = [1, 2, null];
  print(list1);
  var list3 = [0, ...?list1];
  print(list3);
  print(list3.length);

  var promoActive = true;
  var nav = ['Home', 'Furniture', 'Plants', if (promoActive) 'Outlet'];
  print(nav);

  var login = 'Manager';
  var nav2 = [
    'Home',
    'Furniture',
    'Plants',
    if (login case 'Manager') 'Inventory'
  ];
  print(nav2);

  var listOfInts = [1, 2, 3];
  var listOfStrings = ['#0', for (var i in listOfInts) '#$i'];
  assert(listOfStrings[1] == '#1');
  print(listOfStrings);
}
```

Output :

```dart
[1, 2, 3]
[0, 1, 2, 3]
4
[1, 2, null]
[0, 1, 2, null]
4
[Home, Furniture, Plants, Outlet]
[Home, Furniture, Plants, Inventory]
[#0, #1, #2, #3]
```

# Practicum 5

```dart
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
```

Output :

```dart
(first, last, a: 2, b: true)
-----------------
Original: (first, last, a: 2, b: true)
Swapped: (2, 1)
-----------------
(Sri Kresna Maha Dewa, 2241720244)
-----------------
Sri Kresna Maha Dewa
2241720244
true
```

# Practicum Task

1. Explain the function or method in Dart Language?

<strong>
Functions in Dart are re-executable blocks of code that are used
to wrap logic that can be called multiple times without rewriting
the code. Functions can take arguments and return values.
</strong>

2. Explain the types of parameters in Functions along with examples of their syntax!

<strong>
* Required Parameters: These are the parameters that must be passed when the function is called.
* Optional Positional Parameters: These parameters are optional and are specified within square brackets []. They can be omitted when the function is called.
* Named Parameters: These parameters are optional and are specified within curly braces {}. They can be passed in any order when the function is called.
* Default Parameters: These parameters have default values if no value is provided when the function is called.

Example :

Required Parameters

```dart
void printMessage(String message) {
  print(message);
}

void main() {
  printMessage('Hello, World!'); // Output: Hello, World!
}
```

Optional Positional Parameters

```dart
void printMessage(String message, [String? prefix]) {
  if (prefix != null) {
    print('$prefix: $message');
  } else {
    print(message);
  }
}

void main() {
  printMessage('Hello, World!'); // Output: Hello, World!
  printMessage('Hello, World!', 'Greeting'); // Output: Greeting: Hello, World!
}
```

Named Parameters

```dart
void printMessage({required String message, String? prefix}) {
  if (prefix != null) {
    print('$prefix: $message');
  } else {
    print(message);
  }
}

void main() {
  printMessage(message: 'Hello, World!'); // Output: Hello, World!
  printMessage(message: 'Hello, World!', prefix: 'Greeting'); // Output: Greeting: Hello, World!
}
```

Default Parameters

```dart
void printMessage(String message, [String prefix = 'Info']) {
  print('$prefix: $message');
}

void main() {
  printMessage('Hello, World!'); // Output: Info: Hello, World!
  printMessage('Hello, World!', 'Greeting'); // Output: Greeting: Hello, World!
}
```
</strong>

3. Explain the meaning of Functions as first-class objects along with
examples of their syntax

<strong>
In Dart, functions are first-class objects. This means that functions can be:

Assigned to variables or constants.
Passed as arguments to other functions.
Returned from other functions.
This allows for a high degree of flexibility and enables functional programming techniques.

Assigning Functions to Variables

```dart
void greet(String name) {
  print('Hello, $name!');
}

void main() {
  var sayHello = greet;
  sayHello('Alice'); // Output: Hello, Alice!
}
```

Passing Functions as Arguments

```dart
void executeFunction(Function func, String value) {
  func(value);
}

void greet(String name) {
  print('Hello, $name!');
}

void main() {
  executeFunction(greet, 'Bob'); // Output: Hello, Bob!
}
```

Returning Functions from Other Functions

```dart
Function createGreetingFunction(String greeting) {
  return (String name) => print('$greeting, $name!');
}

void main() {
  var greet = createGreetingFunction('Hi');
  greet('Charlie'); // Output: Hi, Charlie!
}
```
</strong>

4. What are Anonymous Functions? Explain and give examples


<strong>
Anonymous functions, also known as lambda functions or closures, are functions that do not have a name. They are often used as arguments to other functions or for short-lived operations. In Dart, anonymous functions can capture variables from their surrounding scope, making them very flexible.

Example :

Basic Anonymous Function

```dart
void main() {
  var list = ['apples', 'bananas', 'oranges'];

  list.forEach((item) {
    print(item);
  });
}
```
In this example, the function passed to forEach is an anonymous function that prints each item in the list.
</strong>

5. Explain the difference between Lexical scope and Lexical closures! Give
examples!

<strong>
Lexical Scope
Lexical scope, also known as static scope, refers to the region in the source code where a variable is defined and where it can be accessed. In lexical scoping, the scope of a variable is determined by its position within the source code, and nested functions have access to variables declared in their outer scope.

```dart
void main() {
  int outerVariable = 10;

  void innerFunction() {
    print(outerVariable); // Can access outerVariable
  }

  innerFunction(); // Output: 10
}
```
In this example, innerFunction can access outerVariable because it is defined within the same lexical scope.

Lexical Closures
A lexical closure is a function that captures the variables from its lexical scope, even after the scope has exited. This means that the function retains access to the variables that were in scope when the function was created.

```dart
Function makeAdder(int addBy) {
  return (int i) => addBy + i;
}

void main() {
  var add2 = makeAdder(2);
  var add5 = makeAdder(5);

  print(add2(3)); // Output: 5
  print(add5(3)); // Output: 8
}
```
In this example, the function returned by makeAdder captures the variable addBy from its lexical scope. Even after makeAdder has finished executing, the returned function retains access to addBy.

Key Differences
* Lexical Scope: Determines the visibility of variables based on their location within the source code. Variables are accessible within the block they are defined and any nested blocks.
* Lexical Closures: Functions that capture and remember the variables from their lexical scope, even after the scope has exited. This allows the function to retain access to those variables.
</strong>


6. Explain with examples how to create multiple return values in Functions!

<strong>
In Dart, you can return multiple values from a function using various techniques. The most common methods are:

Using a List
Using a Map
Using a Tuple (introduced in Dart 2.17)

```dart
List<int> getCoordinates() {
  int x = 10;
  int y = 20;
  return [x, y];
}

void main() {
  var coordinates = getCoordinates();
  print('x: ${coordinates[0]}, y: ${coordinates[1]}'); // Output: x: 10, y: 20
}
```

```dart
List<int> getCoordinates() {
  int x = 10;
  int y = 20;
  return [x, y];
}

void main() {
  var coordinates = getCoordinates();
  print('x: ${coordinates[0]}, y: ${coordinates[1]}'); // Output: x: 10, y: 20
}
```

```dart
(int, int) getCoordinates() {
  int x = 10;
  int y = 20;
  return (x, y);
}

void main() {
  var (x, y) = getCoordinates();
  print('x: $x, y: $y'); // Output: x: 10, y: 20
}
```

</strong>

