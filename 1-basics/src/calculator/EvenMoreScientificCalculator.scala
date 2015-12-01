package calculator

/**
  * Created by kkrol on 01/12/2015.
  */
class EvenMoreScientificCalculator(brand: String) extends ScientificCalculator(brand) {
  def log(m: Int): Double = log(m, math.exp(1))
}