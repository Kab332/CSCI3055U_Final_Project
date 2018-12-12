import java.io._
import scala.io._
import scala.io.Source
import scala.math._
import scala.collection._
import scala.swing._
import scala.xml._

object Standard_Library {

  // Application with a button
  object ExampleApp extends SimpleSwingApplication {
    def top= new MainFrame {
      title = "An App"
      contents = new Button {
        text = "Click this"
      }
    }
  }

  def main (args : Array[String]): Unit = {
    println ("Writing to a file (examples.txt)")
    val writer = new PrintWriter(new File("example.txt"))
    writer.write("Testing if this works")
    writer.close()

    println ("\nReading from a file (examples.txt)")
    val reader = Source.fromFile("example.txt")
    for (line <- reader.getLines()) {
      println(line)
    }
    reader.close()

    println ("\nGetting User Input")
    print("Enter a line: ")
    val input = StdIn.readLine()
    println (input)

    println ("\nFinding max of numbers 5, 10")
    val x = 5
    val y = 10
    println(max(x, y))

    println ("\nFinding min of numbers 5, 10")
    println(min(x, y))

    println ("\nFinding random Double number between 0 and 1 (not including 1)")
    val a = random
    println(a)

    println ("\nDeclaring a map")
    var numbers = Map("One" -> 1, "Two" -> 2, "Three" -> 3)
    for (x <- numbers) {
      println(x)
    }

    println("\nCalling an object that extends SimpleSwingAplication (Specialized Library)")
    ExampleApp.main(Array())

    println ("\nCreating a XML element and then accessing its attributes (Specialized Library)")
    val person: Elem = <person id ="1">Bob</person>
    val id = person \@ "id"
    val name = person.text
    println(id)
    println(name)


  }
}
