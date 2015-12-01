package objects

/**
  * Created by kkrol on 01/12/2015.
  */

class Bar(bar: String) {
  val name = bar
}

object Bar {
 def apply(bar: String) = new Bar(bar)
}
