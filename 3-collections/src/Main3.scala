/**
  * Created by kkrol on 01/12/2015.
  */
object Main3 {

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, 5)
    println("list: " + list)

    val squaredList = list map squared
    println("squaredList: " + squaredList)

    list.foreach((i: Int) => print(i))
    println
    list.foreach(print(_))
    println
    list.foreach(print)
    println

    val filteredList = list.filter(_ > 3)
    println("filteredList: " + filteredList)

    val evenNumberList = list filter isOdd
    println("evenNumberList: " + evenNumberList)


  }

  def squared(value: Int) = value * value

  def isOdd(value: Int) = value % 2 == 1

}
