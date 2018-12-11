# _Your project title_

- _Kabilan Manogaran_
- _kabilan.manogaran@uoit.net_

## About the language

> _Describe the language_
>
> - History
> - Some interesting features

## About the syntax

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


