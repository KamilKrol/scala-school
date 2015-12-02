import objects.{Animal, Bird, Chicken, Duck}

/**
  * Created by kamil on 02.12.15.
  */
object Main5 {

  def main(args: Array[String]): Unit = {

    val list = List(new Animal(), new Bird(), new Chicken(), new Duck())
    val mappedList = cacophony(list)
    println(mappedList)

  }

  def cacophony[T <: Animal](things: Seq[T]) = things map (_.sound)

}
