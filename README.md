# Scala

- _Kabilan Manogaran_
- _kabilan.manogaran@uoit.net_

## About the language
#### History
> * Scala is an acronym for Scalable Language 
> * It was written by Martin Odersky
> * The first version was released in 2003
> * It was created with the goal of being a better programming language than Java
> 	* Features that were believed to be detrimental were not included
>	* Included features that Java did not have, for example functional programming features 

#### Interesting Features
> * Scala is based on Java, it runs on Java Virtual Machine (JVM) so it has access to Java libraries 
> * It is a pure object oriented language that also supports functional programming
> 	* Smoothly integrates features from both of these
> * Scala is statically typed
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
// Cannot change its value
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
> Iterate through a range that has `to` (includes last element)
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

> Iterate through a range that has `until` (does not include last element)
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

> Filter elements using conditions
```scala
var a_collection = Array(1, 2, 3, 4, 5)

// This will filter even numbers
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
// A function that takes an Int, squares it and returns it as an Int
def squareInt (a:Int) :Int = {
	return a * a
}
```

#### Classes
> No restriction on the amount of instances that can be created
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
object Hello_World {
  def main (args: Array[String]): Unit = {
    println("Hello World!")
  }
}
```

## About the tools
> * Scala is  based on Java and runs on JVM 
> * Scala can be compiled and interpreted in two ways
>	* Using IntelliJ, or another IDE
>	* Using the command line
> * For command line, Scala's build tool (sbt) needs to be obtained and installed
> * For using Intellij, some requirements must be fulfilled for Scala to work
> 	* A Scala plug-in must be obtained
>		* In IntelliJ, File -> Settings -> Plugins -> Install JetBrains Plugins -> Search and install Scala
>	* A Scala SDK is required
>		* When creating a Scala project, IntelliJ will ask you to select a Scala SDK
>		* Click create and download the latest version of Scala 
>		* Select the SDK that was just installed and finish creating the Scala project 
> * Once these requirements are fulfilled, you can begin programming Scala on IntelliJ

## About the standard library
#### Writing to a file
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

#### User Input
```scala
import scala.io._

print("Enter a line: ")
val input = StdIn.readLine()
println (input)
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

val x = random

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
> * Dependency if using sbt:
> 	* libraryDependencies += "com.lihaoyi" %% "upickle" % "0.7.1"
>	* libraryDependencies += "com.lihaoyi" %% "ujson" % "0.7.1"
> * Dependency if using IntelliJ:
>	* File -> Project Structure -> Global Libraries -> + -> From Maven
>		* Search and get com.lihaoyi:upickle_2.11:0.2.8
>		* Search and get com.lihaoyi:ujson_2.12:0.7.12
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

// Output
// "Bob"
// "Bill"
// "Jim"
``` 

## Analysis of the language
### 1) Programming Style
> * Scala is a hybrid paradigm programming language
> 	* It is both object oriented and functional 
>	* Object Oriented programming is the bigger focus since Scala is based on Java  
> * That being said, it is possible to do procedural programming using Scala as well, it is just not its focus

##### Procedural Programming Example (for comparison)
```scala
def greet (name:String, age:String, birth_date:String) {
  println("My name is " + name + ", my birthday is "
          + birth_date + ", and I am " + age + " years old.")
}

greet("Bob", "25", "January 1st, 2000")
```
----
> * Object Oriented Features that Scala has:
> 	* Every value is an object, they all have a data type that they could fit into 
> 	* Objects are described by classes
>		* Classes describe object's attributes using variables
>		* Classes describe object's functionality using methods
>
##### Object Oriented Programming Example (for comparison)
> - The greet method has the same functionality as the one above, but here it has no arguments (it is less dependent on other factors)
```scala
class Person (arg1:String, arg2:String, arg3:String) {
  var name = arg1
  var age = arg2
  var birth_date = arg3

  def greet () {
    println("My name is " + name + ", my birthday is "
      + birth_date + ", and I am " + age + " years old.")
  }
}

var bob = new Person("Bob", "25", "January 1st, 2000")
bob.greet()
```
----
> * Functional programming features that Scala has:
> 	* Every function is a value
> 	* Supports higher order functions 
>	* Supports function currying 

### 2) Meta-programming macro
> * Scala has the ability to perform meta-programming
> * This assists in various activities, such as code generation and refactoring
> * Meta-programming is possible in Scala through the Scala.reflect library 
> 	* Provided in the standard distribution
> 	* Uses macros to generate structured code
>	* Complicated, not optimized for library users
>	* Brittle, a lot of unspecified information
> * Macros are compile-time meta-programming
> 	* They are byte code after being compiled
> * Scala meta can be used instead
>	* An open source library 
>	* Everything represented by Trees
> 	* Keeps all information about the program
> * Scala meta allows you to do many things
>	* Parse Trees, can produce syntax trees from Scala source code
>		* or Construct Trees, depending on the situation we might not be able to parse and might just need to construct dynamically
> 	* Pattern Match Trees, can target interesting tree nodes and deconstruct them
>	* Compare trees for equality, using reference equality
>	* Traverse Trees, can go to every tree node and collect values
>	* Transform Trees, can visit every tree node and transform interesting ones 


### 3) Symbol resolution and Closure
> * Scala has many reserved symbols, but there are times when certain symbols cannot be found
> * This could be caused by composition of different methods, or if the method has been imported to the scope 
> * It is also possible that imported implicit conversion 
>	* Implicit conversion can occur if an expression's type (ex. A) does not match with its expected type (ex. B)
> * The api.JavaUniverse package within scala.reflect can assist in resolving symbols
> 	* It adds operations that link symbols and types to underlying classes and runtime values of a JVM instance
> * In Scala, closures are functions that depends on values outside the function to determine its return value
```scala
def someFunction (): Unit = {
  println ( "addNumber(5) = " + addNumbers(5))
  println ( "addNumber(6) = " + addNumbers(6))
}

var number = 10
var addNumbers = (i:Int)  =>  i + 5

someFunction()
```

### 4) Scoping Rules
> * Scala supports lexical (static) scoping over dynamic scoping
> * Outer code blocks will be visible inside a block
>
##### Scoping Example
```scala
var x:Int = 5

def firstFunc () = {
  x
}

def secondFunc() = {
  var x:Int = 10
  firstFunc()
}

secondFunc()

// Output
// 5
```
> * The value of the x in firstFunc is not dependent on secondFunc
> * firstFunc is returning the value of the global x, which is what it has access to if called by itself
> * This is lexical scoping, if the firstFunc took the value of the x in secondFunc instead then that would have been dynamic scoping

### 5) Functional programming constructs
> * Two functional programming constructs are higher order functions and function currying

#### High Order Functions
> Functions that take other functions as argument or returns them
```scala
def add5 (x:Int) :Int = x + 5
def example (x:Int, func:Int=>AnyVal) :Unit = {
  println(func(x))
}

example(4, add5)

// Output
// 9
```

#### Function Currying
> Transforming a function that takes multiple arguments into a function that takes 1
```scala
def add (x:Int)(y:Int) :Int = { x + y }

var step1 = add(5)_
var step2 = step1(5)

println(step2)

// Output
// 10
```

### 6) Type System
> * Scala is statically typed
>	* Does type checking at compile time instead of run time
>	* The compiler can tell if the program is correct without running the program
>	* Entering types all the time will be redundant, this is where type inference comes in 
> * Scala supports type inference 
> 	* Does not need you to provide type information every time
>	* It can auto detect type, so a data type does not even need to provided most of the time
> 	* It is even capable of inferring maps

```scala
var x = "A String"		// x will be given type String
var y = 5			// y will be given type Int
var z = 5.0			// z will be given type Double
```

### 7) Strengths and Weaknesses
> * Advantages
>	* Has Scalability
> 	* Can be easy to learn
> 	* Has objected oriented and functional features
> 	* IntelliJ can be used for it, great UI, many plugins, and built in dependency search
> 	* Has XML support
> * Disadvantages
> 	* Type information could become complicated due to Scala being a hybrid paradigm language
>	* Not as much support when compared to popular languages like Java, Python and C++
>	* Has backward compatibility issues