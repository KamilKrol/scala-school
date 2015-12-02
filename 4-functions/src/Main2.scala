/**
  * Created by kkrol on 02/12/2015.
  */
object Main2 {

  def main(args: Array[String]): Unit = {

    val one: PartialFunction[Int, String] = {
      case 1 => "one"
    }

    val two: PartialFunction[Int, String] = {
      case 2 => "two"
    }

    val default: PartialFunction[Int, String] = {
      case _ => "default"
    }

    println(one.isDefinedAt(1) + " " + one.isDefinedAt(2))

    val mergedFunc = one orElse two orElse default

    println(mergedFunc.isDefinedAt(1) + " " + mergedFunc.isDefinedAt(2) + " " + mergedFunc.isDefinedAt(3))
    println(mergedFunc(1) + " " + mergedFunc(2) + " " + mergedFunc(3))

  }

}
