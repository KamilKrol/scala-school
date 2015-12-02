/**
  * Created by kamil on 02.12.15.
  */
object Main3 {

  def main(args: Array[String]): Unit = {

    //    val normal : Normal[AnyRef] = new Normal[String]()

    val covariant: Covariant[AnyRef] = new Covariant[String]()
    //    val covariant: Covariant[String] = new Covariant[AnyRef]()

    //    val contravariant: Contravariant[AnyRef] = new Contravariant[String]()
    val contravariant: Contravariant[String] = new Contravariant[AnyRef]()

  }

  class Normal[T]

  class Covariant[+T]

  class Contravariant[-T]

}
