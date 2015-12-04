/**
  * Created by kkrol on 04/12/2015.
  */
object Main4 {

  def main(args: Array[String]): Unit = {

    val seq = IndexedSeq(1, 2, 3)
    println(seq)

    for (i <- 1 to 5) print(i)
    println

    (1 to 5).map(_ * 3).foreach(println)
  }

}