# Scala Programming Language

- _Kabilan Manogaran_
- _kabilan.manogaran@uoit.net_

## About the language

> _Describe the language_
>
> - History
> - Some interesting features

## About the syntax

#### Data Types 
----
Data Type | Description | Default Value
---	| --- | --- | 
Boolean | true or false | false
Byte | 8 bit signed value ranging from -2<sup>7</sup> to 2<sup>7</sup> - 1 | 0
Short | 16 bit signed value ranging from -2<sup>15</sup> to 2<sup>15</sup> - 1 | 0
Int | 32 bit signed value ranging from -2<sup>31</sup> to 2<sup>31</sup> - 1 | 0
Long | 64 bit signed value ranging from -2<sup>63</sup> to 2<sup>63</sup> - 1 | 0L
Float | 32 bit IEEE 754 single-precision float, positive or negative | 0.0F
Double | 64 bit IEEE 754 double-precision float, positive or negative | 0.0D
Char | 16 bit unsigned Unicode character ranging from 0 to 2<sup>16</sup> - 1 | '\u0000'
String | A sequence of characters | Null
Unit | Has only one value, (). It is void in Java | ()
Null | A null or empty reference. Subtype of reference type data, cannot be given as a value for value types like String or Int. | -
Nothing | Subtype of every other type, has no instances | -
Any | Supertype of every type, all objects are of type Any | -
AnyRef | Supertype of every reference type data | -

#### Mutable Variable
```scala
// Auto detects data type
var x = 5

// Data type provided
var y:Double = 5.5
```

#### Immutable Variable
```scala
val x:String = "Variable"	
```

#### Multiple Assignments
```scala
// x will be 10, y will be 15 and z will be "Assignment"
var (x, y:Int, z:String) = (10, 15, "Assignment")
```

#### Arrays
```scala
var an_array = Array(1, 4, 7, 10)
```

#### Maps
```scala
var numbers = Map("One" -> 1, "Two" -> 2, "Three" -> 3)
```

#### Conditional Statements
```scala
var x:Int = 2				// x is 2

if (x == 3) {
	println ("x is 3")		// If x equals 3, this println happens
} else if (x > 3) {
	println ("x is greater than 3")	// If x > 3, this println happens
} else {
	println ("x is less than 3")	// If neither of the above conditions are true, then this println happens
}
```

#### while loop
```scala
var a:Int = 0

// This will print a until a's value is 5
while (a < 5) {
	println(a)
	a = a + 1
}

// Output
// 0
// 1
// 2
// 3
// 4
```

#### do-while loop
```scala
var a:Int = 5

// This will print a once because the condition is being checked at the end
do {
	println(a)
} while (a < 5)

// Output
// 5
```

#### for loop
> Iterate through a range with to (includes last element)
```scala
for (x <- 1 to 5) {
	println(x)
}

// Output
// 1
// 2
// 3
// 4
// 5
```

> Iterate through a range with until (does not include last element)
```scala
for (x <- 1 until 5) {
	println(x)
}

// Output
// 1
// 2
// 3
// 4
```

> Iterate through a collection
```scala
var a_collection = Array(2, 4, 6, 8, 10)

for (x <- a_collection) {
	println(x)
}

// Output
// 2
// 4
// 6
// 8
// 10
```

> Filter out elements using conditions
```scala
var a_collection = Array(1, 2, 3, 4, 5)

// This will filter out odd numbers
for (x <- a_collection 
		if (x % 2 == 0)) {
	println(x)
}

// Output
// 2
// 4
```

> Obtain the values that were iterated through 
```scala
var values = for { x <- 1 to 5 } yield x
```

#### Functions
```scala
// A function that takes an int, squares it and returns it as an int
def squareInt (a:Int) :Int = {
	return a * a
}
```

#### Classes
```scala
class Person(arg1:String, arg2:Int) {
  var name:String = arg1
  var age:Int = arg2

  def greet () {
    println("Hello my name is " + name + ".")
    println("I am " + age +  " years old.")
  }
}

var Bob = new Person("Bob", 20)
Bob.greet()

// Output
// Hello my name is Bob.
// I am 20 years old.
```

#### Objects
```scala
object Object_Name {
	// Some code here
}
```


## About the tools

> _Describe the compiler or interpreter needed_.

## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

# Analysis of the language

> _Organize your report according to the project description
document_.


