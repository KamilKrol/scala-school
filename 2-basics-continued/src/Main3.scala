import functions.{multiply, AddOneClass, addOne}

/**
  * Created by kkrol on 01/12/2015.
  */
object Main3 {

  def main(args: Array[String]): Unit = {
    println(addOne(2))

    val addOneClass = new AddOneClass
    println(addOneClass(5))

    println(multiply(3,4))
  }

}
