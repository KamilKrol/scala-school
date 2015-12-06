import java.util.concurrent.{Executors, Callable, FutureTask}

import com.sun.javafx.webkit.EventLoopImpl

/**
  * Created by kamil on 05.12.15.
  */
object Main2 {

  def main(args: Array[String]): Unit = {

    val future = new FutureTask[String](new Callable[String] {
      override def call(): String = {
        Thread sleep 5000
        "Kamil"
      }
    })

    Executors.newSingleThreadExecutor().execute(future)

    println("Name: " + future.get())
  }

}
