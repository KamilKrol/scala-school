/**
  * Created by kkrol on 01/12/2015.
  */
object Main1 {

  def main(args: Array[String]) {
    println(multiply(5)(6))

    val timesTwo = multiply(2) _
    println(timesTwo(7))

    val referencedFunction = multiply _
    println(referencedFunction(4)(5))

    val curriedAdder = (adder _).curried
    val addTwo = curriedAdder(2)
    println(addTwo(5))
  }

  def multiply(m: Int)(n: Int): Int = m * n
  def adder(m: Int, n: Int) = m + n

}
