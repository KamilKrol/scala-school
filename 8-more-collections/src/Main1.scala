/**
  * Created by kkrol on 04/12/2015.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    val list1 = List(1, 2, 3, 4, 5)
    println("list1 = " + list1)

    val list2 = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
    println("list2 = " + list2)

    val set1 = Set(1, 1, 1, 2, 2)
    println("set1 = " + set1)

    val seq1 = Seq(2, 3, 1, 4)
    println("seq1 = " + seq1)

    val map1 = Map('a' -> 1, 'b' -> 2, 'c' -> 3)
    println("map1 = " + map1)
  }

}