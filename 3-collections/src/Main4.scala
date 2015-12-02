/**
  * Created by kamil on 02.12.15.
  */
object Main4 {

  def main(args: Array[String]): Unit = {

    val list1 = List(1, 2, 3)
    val list2 = List("one", "two", "three")

    val doubleList = list1.zip(list2)
    println("doubleList: " + doubleList)

    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val partitionedNumbers = numbers.partition(isEven)
    println("partitionedNumbers: " + partitionedNumbers)

    val evenNumbers = partitionedNumbers._1
    println("evenNumbers: " + evenNumbers)
    val oddNumbers = partitionedNumbers._2
    println("oddNumbers: " + oddNumbers)

    println("find(_ > 7): " + numbers.find(_ > 7))
    println("drop(5): " + numbers.drop(5))
    println("dropWhile(!isEven(_): " + numbers.dropWhile(!isEven(_)))
    println("dropWhile(_ < 4): " + numbers.dropWhile(_ < 4))
  }

  def isEven(value: Int) = value % 2 == 0

}
