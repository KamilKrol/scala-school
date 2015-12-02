/**
  * Created by kamil on 02.12.15.
  */
object Main6 {

  def main(args: Array[String]): Unit = {

    val even = List(2, 4, 6, 8)
    val odd = List(1, 3, 5, 7, 9)

    val twoList = List(even, odd)
    println(twoList)
    println(twoList.flatten)
    println(twoList.flatten.sorted)

    val flatMapResult = twoList.flatMap(_.map(_ * 2))
    println("flatMapResult: " + flatMapResult)
  }

}
