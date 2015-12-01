package calculator

/**
  * Created by kkrol on 01/12/2015.
  */
class Calculator(brand: String) {
  val model: String = "X11"
  val color: String = if (brand == "HP") {
    "blue"
  } else {
    "white"
  }

  def add(m: Int, n: Int) = m + n
}
