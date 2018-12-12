object Basic_Syntax {

  // A class
  class Person(arg1:String, arg2:Int) {
    var name:String = arg1
    var age:Int = arg2

    def greet () {
      println("Hello my name is " + name + ".")
      println("I am " + age +  " years old.")
    }
  }

  // Singleton object
  object Hello_World {
    def main (args: Array[String]): Unit = {
      println("Hello World!")
    }
  }

  def main (args : Array[String]): Unit = {
    // x will be 10, y will be 15 and z will be "Assignment"
    var (x, y:Int, z:String) = (10, 15, "Assignment")
    println("Multiple Assignments")
    println(x, y, z)

    println ("\nConditional Statements")
    var a:Int = 2				// x is 2
    if (a == 3) {
      println ("a is 3")		// If x equals 3, this println happens
    } else if (a > 3) {
      println ("a is greater than 3")	// If x > 3, this println happens
    } else {
      println ("a is less than 3")	// If neither of the above conditions are true, then this println happens
    }

    println("\nwhile loop")
    var b:Int = 0
    // This will print a until a's value is 5
    while (b < 5) {
      println(b)
      b = b + 1
    }

    println("\ndo-while loop")
    var c:Int = 5
    // This will print a once because the condition is being checked at the end
    do {
      println(c)
    } while (c < 5)

    println("\nfor loop with range (to)")
      for (x1 <- 1 to 5) {
      println(x1)
    }

    println("\nfor loop with range (until)")
    for (x <- 1 to 5) {
      println(x)
    }

    println ("\nIterating through a collection")
    var a_collection = Array(2, 4, 6, 8, 10)
    for (x <- a_collection) {
      println(x)
    }

    println ("\nIterating while filtering elements (even numbers only)")
    var a_collection1 = Array(1, 2, 3, 4, 5)
    // This will filter even numbers
    for (x <- a_collection1
         if (x % 2 == 0)) {
      println(x)
    }

    println ("\nObtaining values that were iterated through")
    var values = for { x <- 1 to 5 } yield x
    println(values)

    println("\nFunction that squares an integer (passing 5)")
    println(squareInt(5))

    println ("\nInstantiating a class and then using its greet function")
    var bob = new Person("Bob", 20)
    bob.greet()

    println("\nCalling Hello_World's main function")
    Hello_World.main(Array())
  }

  // A function that takes an int, squares it and returns it as an int
  def squareInt (a:Int) :Int = {
    return a * a
  }
}
