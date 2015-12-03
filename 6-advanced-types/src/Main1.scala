/**
  * Created by kkrol on 03/12/2015.
  */
object Main1 {


  implicit def strToInt(x: String) = x.toInt

  implicit def strToDouble(x: String) = 1.2

  def main(args: Array[String]): Unit = {

    //    val x: Int = "123"
    //    math.max(111, "123")

    val x: Double = "double"
    val y: Int = "123"

    println("x = " + x)
    println("y = " + y)
    println(math.max(111, "123"))

  }

}
