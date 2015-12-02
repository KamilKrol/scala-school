/**
  * Created by kamil on 02.12.15.
  */
object Main5 {

  def main(args: Array[String]): Unit = {

    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val foldLeftResult = numbers.foldLeft(0)(debugFold)
    println("Result: " + foldLeftResult + "\n")

    val foldRightResult = numbers.foldRight(0)(debugFold)
    println("Result: " + foldRightResult)
  }

  def debugFold(a: Int, b: Int): Int = {
    println("a = " + a + " b = " + b)
    a + b
  }

}
