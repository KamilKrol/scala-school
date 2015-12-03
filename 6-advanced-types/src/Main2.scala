/**
  * Created by kkrol on 03/12/2015.
  */
object Main2 {

  implicit def strToInt(x: String) = x.toInt

  implicit def floatToInt(x: Float) = x.toInt

  def main(args: Array[String]): Unit = {

    println(new Container[Int].addIt(123))
    println(new Container[String].addIt("123"))
    println(new Container[Float].addIt(123.1F))

  }

  class Container[T <% Int] {
    def addIt(x: T) = 123 + x
  }

}
