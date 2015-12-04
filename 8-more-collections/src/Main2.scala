/**
  * Created by kkrol on 04/12/2015.
  */
object Main2 {

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, 5)
    val map = Map(1 -> "one", 2 -> "two", 3 -> "three")

    val groupedMap = list.groupBy(check)
    println(groupedMap)

    println(map.toList)
  }

  def check(value: Int): String = if (value % 2 == 0) "Even" else "Odd"

}