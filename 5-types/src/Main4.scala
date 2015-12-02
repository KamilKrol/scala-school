import objects.{Animal, Bird, Chicken, Duck}

/**
  * Created by kamil on 02.12.15.
  */
object Main4 {

  def main(args: Array[String]): Unit = {

    val chicken = new Chicken()
    val duck = new Duck()

    println(getTweet(chicken))
    println(getTweet(duck))

  }

  val getTweet: (Bird => String) = (a: Animal) => a.sound

}
