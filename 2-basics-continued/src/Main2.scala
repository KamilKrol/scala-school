import apply.{Bar, FooMaker}
import objects.{Bar, Timer}

/**
  * Created by kkrol on 01/12/2015.
  */
object Main2 {

  def main(args: Array[String]): Unit = {
    println(Timer.currentCount())
    println(Timer.currentCount())
    println(Timer.currentCount())

    val aaa = Bar("aaa")
    val bbb = Bar("bbb")
    println(aaa.name)
    println(bbb.name)
  }

}
