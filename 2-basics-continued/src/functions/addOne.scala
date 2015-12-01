package functions

/**
  * Created by kkrol on 01/12/2015.
  */
object addOne extends Function[Int, Int] {
  override def apply(value: Int): Int = value + 1
}
