/**
  * Created by kamil on 02.12.15.
  */
object Main2 {

  def main(args: Array[String]): Unit = {

    val int = id(199)
    checkType(int)

    val string = id("Kamil")
    checkType(string)

    val list = List(1,2,3)
    checkType(list)

  }

  def id[T](x: T) = x

  def checkType[T](x: T) = x match {
    case _: String => println("String")
    case _: Int => println("Int")
    case _ => println("Unknown type")
  }

}
