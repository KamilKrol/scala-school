import scala.collection.JavaConverters._

/**
  * Created by kkrol on 04/12/2015.
  */
object Main7 {

  def main(args: Array[String]): Unit = {

    val sl = new scala.collection.mutable.ListBuffer[Int]
    val jl: java.util.List[Int] = sl.asJava
    val sl2: scala.collection.mutable.Buffer[Int] = jl.asScala

    assert(sl eq sl2)
  }

}