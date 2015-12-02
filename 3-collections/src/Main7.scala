/**
  * Created by kamil on 02.12.15.
  */
object Main7 {

  def main(args: Array[String]): Unit = {

    val numbers = List(1, 2, 3, 4, 5, 6)

    val mappingResult = ourMap(numbers, timesTwo)
    println("mappingResult: " + mappingResult)

  }

  def ourMap(numbers: List[Int], fn: Int => Int): List[Int] = {
    numbers.foldRight(List[Int]()) { (x: Int, xs: List[Int]) =>
      fn(x) :: xs
    }
  }

  def timesTwo(value: Int): Int = value * 2

}
