/**
  * Created by kamil on 03.12.15.
  */
object Main6 {

  def foo(x: {def get: Int}) = 123 + x.get

  def main(args: Array[String]): Unit = {

    val foo = new Foo[Int] {
      override val x: Int = 4
    }

    println("foo.getX: " + foo.getX)

    val bar = new Bar {
      override type T = Int
      override val x: T = 5
    }

    println("bar.getX: " + bar.getX)

  }

  trait Foo[A] {
    val x: A

    def getX = x
  }

  trait Bar {
    type T
    val x: T

    def getX = x

  }

}
