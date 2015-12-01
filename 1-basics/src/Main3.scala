import calculator.{C, Calculator}

/**
  * Created by kkrol on 01/12/2015.
  */
object Main3 {

  def main(args: Array[String]): Unit = {
    val calc = new Calculator("HP")
    println(calc)
    println(calc.add(2, 3))
    println(calc.color)

    val c = new C
    println(c.minc)
    println(c.finc)
  }

}



