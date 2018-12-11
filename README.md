# Scala Programming Language

- _Kabilan Manogaran_
- _kabilan.manogaran@uoit.net_

## About the language

> _Describe the language_
>
> - History
> - Some interesting features

## About the syntax

### Data Types 
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

### Variables
----
#### Mutable
> * Mutable variables are variables that can be changed after declaration
> * In Scala, they can be declared using `var` 
> * To provide a data type, follow up the variable name with `:data_type` (ex. `:Int`)
> * If no data type is given, `var` will automatically detect and set the data type based on the value given
> 	* When changing the value of the variable, it must satisfy the data type
```scala
var x:String = "Variable"	// Declaring mutable String variable
x = "Another Variable"		// Changing value to another String
x = 5				// Will not work, 5 is not a string

var y = 5			// Data type will be detected automatically, here it is Int
y = 5.5				// Will not work since 5.5 is not an Int
```

#### Immutable
> * Immutable variables cannot be changed after declaration
> * In Scala, they can be declared using `val`
> * Providing data type is the same as it is for `var`

```scala
val x:String = "Variable"	// Declaring immutable String variable
x = "Another Variable"		// Will not work, value cannot be changed
```

#### Multiple Assignments
> * It is possible to assign values to many variables at the same time
> * A tuple after `var` will hold the variable names (including data types)
> 	* `var (x, y:Int, z:String)`
> * The value assigned will be a tuple, each value is in the same position as its target variable
> 	* `(x_value, y_value, z_value)`

```scala
// x will be 10, y will be 15 and z will be "Assignment"
var (x, y:Int, z:String) = (10, 15, "Assignment")
```

### Conditional Statements
----
> * Used to run certain blocks of code (`{ }`) if a `condition` has been fulfilled
> 	* `if (condition) { // Code goes here }`
> * One conditional statement can check multiple conditions using `else if` (following an `if`)
> * There can be multiple `else if` blocks in a conditional statement, but only 1 `if` and `else`
> 	* `else if (another_condition) { // more code }`
> * `else` can be used to handle cases where none of the conditions in the statement has been fulfilled
> 	* `else { // more code }`

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

### Loop Statements
----
#### while
> * A block of code is iterated over and over again while a `condition` remains true
> 	* `while (condition) { // code in here }` 
> * The condition is checked before the code block is executed
> * This is a useful loop for when you do not know how many iterations are needed

```scala
var a:Int = 0

/* This will print a until a's value is 5
 * The output will be 0 1 2 3 4, each on its own line	*/
while (a < 5) {
	println(a)
	a = a + 1
}
```

#### do-while
> * Similar to the `while` loop, but condition is checked at the end of the loop
> 	* `do { // code block } while (condition)`
> * This means that the code block will be executed at least once

```scala
var a:Int = 5

/* This will print a once because the condition is being checked at the end
 * The output will be 5. */
do {
	println(a)
} while (a < 5)
```

#### for 
> * A loop that iterates a specific amount of times
> * If a range of integers is given, the loop will iterate through that range
> * It while keeping track of its current position using a variable
> 	* `for (currentPosition <- start to end) { // code that will be iterated  }`
> 	* Values of `currentPosition`: `start`, `start` + 1, `start` + 2, ... , `end` - 1, `end`
> * `to` is inclusive, it will include the `end` value 
> * `to` can be replaced with `until` to not include the `end` value

```scala
/* This will iterate 5 times
 * The output will be 1 2 3 4 5, each on its own line */	
for (x <- 1 to 5) {
	println(x)
}

/* This will iterate 4 times
 * The output will be 1 2 3 4, each on its own line */	
for (x <- 1 until 5) {
	println(x)
}
```

#### Objects
> _Objects can be created using the object keyword._

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


