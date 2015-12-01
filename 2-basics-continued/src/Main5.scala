

/**
  * Created by kkrol on 01/12/2015.
  */
object Main5 {

  def main(args: Array[String]): Unit = {
    val times = 1
    val text = times match {
      case 1 => "one"
      case 2 => "two"
      case _ => "unknown"
    }
    println(text)
  }
}
