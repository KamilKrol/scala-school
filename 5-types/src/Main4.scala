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

  class Animal {
    val sound = "rustle"
  }

  class Bird extends Animal {
    override val sound = "call"
  }

  class Chicken extends Bird {
    override val sound = "cluck"
  }

  class Duck extends Bird {
    override val sound = "quack"
  }

  val getTweet: (Bird => String) = (a: Animal) => a.sound

}
