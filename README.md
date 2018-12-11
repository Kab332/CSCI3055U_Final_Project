# _Your project title_

- _Kabilan Manogaran_
- _kabilan.manogaran@uoit.net_

## About the language

> _Describe the language_
>
> - History
> - Some interesting features

## About the syntax

### Data Types 

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

#### 

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


