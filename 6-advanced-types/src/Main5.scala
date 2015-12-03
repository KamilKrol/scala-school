/**
  * Created by kamil on 03.12.15.
  */
object Main5 {

  def foo(x: {def get: Int}) = 123 + x.get

  def main(args: Array[String]): Unit = {

    println(foo(new {
      def get = 7
    }))

  }

}
