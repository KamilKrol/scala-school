/**
  * Created by kkrol on 04/12/2015.
  */
object Main3 {

  def main(args: Array[String]): Unit = {

    val set = Set(1, 2, 3)
    println(set)

    val set2 = set + 4 - 3
    println(set2)

    val map = Map(1 -> "one", 2 -> "two", 3 -> "three")
    println(map)
    val list = map.toList
    println(list)
    val mapAgain = Map.empty ++ list
    println(mapAgain)

  }

}