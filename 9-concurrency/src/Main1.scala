/**
  * Created by kamil on 05.12.15.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    val hello = new Thread(new Runnable {
      def run() {
        println("hello world")
      }
    })

    hello.start

  }

}
