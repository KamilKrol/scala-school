

/**
  * Created by kkrol on 01/12/2015.
  */
object Main5 {

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    val strings1 = list.map(matchFunction1)
    val strings2 = list.map(matchFunction2)
    println(list)
    println(strings1)
    println(strings2)
  }

  def matchFunction1(value: Int): String = {
    value match {
      case 1 => "one"
      case 2 => "two"
      case _ => "unknown"
    }
  }

  def matchFunction2(value: Int): String = {
    value match {
      case i if i == 1 => "one 1"
      case i if i == 2 => "two 2"
      case unknown => "unknown " + unknown
    }
  }
}
