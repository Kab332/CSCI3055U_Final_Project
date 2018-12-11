# Scala Programming Language

- _Kabilan Manogaran_
- _kabilan.manogaran@uoit.net_

## About the language
> History
> * Scala is an acronym for Scalable Language 
> * It was written by Martin Odersky
> * The first version was released in 2003
> * It was created with the goal of being a better programming language than Java
> 	* Features that were believe to be detrimental were not included
>	* Included features that Java did not have, for example functional programming  

> Interesting Features
> * Scala is based on Java, it runs on JVM so it has access to Java libraries 
> * It is a pure object oriented language that also supports functional programming
> 	* Smoothly integrates features from both of these
> * Scala is statically typed
>	* Does type checking at compile time instead of run time
> 	* Does not need you to provide type information every time
>	* Can auto detect type, so a data type does not even need to provided most of the time
> * Every function is a value
> * Scala provides lightweight syntax for defining anonymous functions

## About the syntax
#### Data Types 
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

// Output
// x is less than 3
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

#### Singleton Objects
> Can only have one instance
```scala
object Object_Name {
	// Some code here
}
```

## About the tools
> * Scala can be interpreted using the IntelliJ IDE
> * Some requirements must be fulfilled for Scala to work on it
> 	* A Scala plugin must be obtained
>		* In IntelliJ, Settings -> Plugins -> Install JetBrains plugins -> Search and install Scala
>	* A Scala SDK is required
>		* When creating a Scala project, IntelliJ will ask you to select a Scala SDK
>		* Click create and download the latest version of Scala 
>		* Select the SDK that was just installed and finish creating the Scala project 
> * Once fulfilling those requirements, Scala programming on IntelliJ can begin

## About the standard library
#### Writing to file
> Scala doesn't have file writing methods, but it can use any Java objects including java.io
```scala
import java.io._

val writer = new PrintWriter(new File("example.txt"))
writer.write("Testing if this works")
writer.close()
```

#### Reading from a file
```scala
import scala.io.Source

val reader = Source.fromFile("example.txt")
for (line <- reader.getLines()) {
  println(line)
}
reader.close()
```

#### Finding Max and Min value
```scala
import scala.math._

val x = 5
val y = 10

println(max(x, y))

// Output
// 10

println(min(x, y))

// Output
// 5
```

#### Finding Random Double value that is >= 0 and < 1.0
```scala
import scala.math._

val x = random()

println(x)
```

#### Maps
```scala
import scala.collection._

var numbers = Map("One" -> 1, "Two" -> 2, "Three" -> 3)
```

## About the specialized libraries 
#### Swing
> Creating an application that has a button 
```scala
import scala.swing._

object ExampleApp extends SimpleSwingApplication {
  def top= new MainFrame {
    title = "An App"
    contents = new Button {
      text = "Click this"
    }
  }
}
```

#### XML
> Creating a XML element and then accessing its attributes
```scala
import scala.xml._

val person: Elem = <person id ="1">Bob</person>

val id = person \@ "id"
val name = person.text

println(id)
println(name)

// Output
// 1
// Bob
```

## About open source library

> * uPickle is a lightweight JSON and binary serialization library for Scala
> * Simple to use
> 	* JSON output is easy to read
> * The JSON processing api that uPickle uses (uJson) is easy to understand
> 	* Similar to ones in Ruby, Python and Javascript
> * It is customizable
> * Easy to add to a project due to having no dependencies

> * uPickle allows the user to read and write Scala data objects, such as sequences, to String 
> 	* Can also read from CharSequences and Byte Arrays  
> * uJson can easily manipulate JSON sources and data structures 
> * Can standalone without uPickle

> uJson can easily create JSON blobs
```scala
// A JSON blob
val values = ujson.Arr(
  ujson.Obj("ID" -> 1, "Name" -> "Bob"),
  ujson.Obj("ID" -> 2, "Name" -> "Bill"), 
  ujson.Obj("ID" -> 3, "Name" -> "Jim")
)

val y = ujson.read(values)

// Printing every Name in the blob
for (x <- 0 until values.value.size) {
  println(y(x)("Name"))
}
``` 

# Analysis of the language

> _Organize your report according to the project description
document_.


