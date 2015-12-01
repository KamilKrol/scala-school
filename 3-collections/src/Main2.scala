/**
  * Created by kkrol on 01/12/2015.
  */
object Main2 {

  def main(args: Array[String]): Unit = {

    val map = Map(1 -> "one", 2 -> "two", 3 -> "three")

    println(map.get(1).get)
    println(map.getOrElse(1, "not defined"))
    println(map.getOrElse(10, "not defined"))

    val result = map.get(1)
    result match {
      case Some(value) => println("There is a value: " + value)
      case None => println("No value")
    }
  }

}
