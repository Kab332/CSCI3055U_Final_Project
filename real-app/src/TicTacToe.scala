import scala.collection._
import scala.io._

object TicTacToe {
  def winCheck (board : mutable.Map[Int,String]): Boolean = {
    // Checking all rows
    for (i:Int <- Array(1, 4, 7)) {
      if (board.get(i) == board.get(i + 1) && board.get(i + 1) == board.get(i + 2)) {
        return true
      }
    }

    // Checking all columns
    for (i:Int <- Array(1, 2, 3)) {
      if (board.get(i) == board.get(i + 3) && board.get(i + 3) == board.get(i + 6)) {
        return true
      }
    }

    // Checking diagonally
    if (board.get(1) == board.get(5) && board.get(5) == board.get(9)) {
      return true
    } else if (board.get(3) == board.get(5) && board.get(5) == board.get(7)) {
      return true
    }

    false
  }

  def printBoard (board : mutable.Map[Int, String]) : Unit = {
    for (i:Int <- Array(1, 4, 7)) {
      println(board(i) + "\t" + board(i+1) + "\t" + board(i+2))
      println("")
    }
  }

  def main (args : Array[String]): Unit = {
    val board = mutable.Map(1 -> "1", 2 -> "2", 3 -> "3", 4 -> "4", 5 -> "5", 6 -> "6", 7 -> "7", 8 -> "8", 9 -> "9")
    var input:Int = 0

    var currentPlayer:String = ""
    var currentVal = 1

    printBoard(board)

    while (true) {
      if (currentVal % 2 == 0) {
        currentPlayer = "O"
      } else {
        currentPlayer = "X"
      }

      print("Player(" + currentPlayer + "), please pick an unoccupied position: ")
      input = StdIn.readInt()

      if (1 <= input && input <= 9) {
        if (board(input) != "O" && board(input) != "X") {
          board(input) = currentPlayer
          currentVal += 1
        } else {
          println("Position is occupied.")
        }
      } else {
        println("Position is invalid.")
      }

      println("")

      printBoard(board)

      if (winCheck(board)) {
        println("Player(" + currentPlayer + ") has won!")
        return
      }

    }
  }
}
