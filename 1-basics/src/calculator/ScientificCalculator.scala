package calculator

/**
  * Created by kkrol on 01/12/2015.
  */
class ScientificCalculator(brand: String) extends Calculator(brand) {
  def log(m: Double, base: Double) = math.log(m) / math.log(base)
}
