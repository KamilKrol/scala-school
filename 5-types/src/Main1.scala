/**
  * Created by kamil on 02.12.15.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, 5)

    val droppedList = drop1(list)
    println("droppedList:  " + droppedList)

  }

  def drop1[T](list: List[T]) = list.tail

}
