import apply.{Bar, FooMaker}

/**
  * Created by kkrol on 01/12/2015.
  */
object Main1 {

  def main(args: Array[String]): Unit = {
    val foo = FooMaker()
    println(foo)

    val bar = new Bar()
    bar()
  }

}
