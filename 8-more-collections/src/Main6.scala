/**
  * Created by kkrol on 04/12/2015.
  */
object Main6 {

  def main(args: Array[String]): Unit = {

    val numbers = collection.mutable.Map(1 -> "one", 2 -> "two")
    println(numbers)

    numbers.put(3, "three")
    println(numbers)

    numbers += (4 -> "four")
    println(numbers)

  }

}