import java.util.concurrent.CountDownLatch

/**
  * Created by kamil on 05.12.15.
  */
object Main4 {

  def main(args: Array[String]): Unit = {

    val doneSignal = new CountDownLatch(2)

    val runnable = new Runnable {
      override def run(): Unit = {
        Thread sleep 5000
        doneSignal.countDown()
      }
    }

    new Thread(runnable).start()
    new Thread(runnable).start()

    doneSignal.await()
    println("Finished")

  }

}