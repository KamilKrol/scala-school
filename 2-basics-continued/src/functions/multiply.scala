package functions

/**
  * Created by kkrol on 01/12/2015.
  */
object multiply extends ((Int, Int) => Int) {
  override def apply(value1: Int, value2: Int) = value1 * value2
}
