

/**
  * Created by kkrol on 01/12/2015.
  */
object Main6 {

  def main(args: Array[String]): Unit = {

    val result = try {
      divide(5, 0)
    } catch {
      case exc: ArithmeticException => {
        exc.printStackTrace()
        -1
      }
    }

    println("Result: " + result)
  }

  def divide(a: Int, b: Int): Double {
    a / b
  }

}