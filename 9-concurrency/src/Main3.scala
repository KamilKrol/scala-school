import java.util.concurrent.atomic.AtomicReference

/**
  * Created by kamil on 05.12.15.
  */
object Main3 {

  def main(args: Array[String]): Unit = {

    val person = new Person("J-C")
    person.set("Kamil")

    println("Name: " + person.name)

  }

}

class Person(var name: String) {
  def set(newName: String): Unit = {
    synchronized {
      name = newName
    }
  }
}

class Person2(@volatile var name: String) {
  def set(newName: String): Unit = {
    name = newName
  }
}

class Person3(val name: AtomicReference[String]) {
  def set(newName: String): Unit = {
    name.set(newName)
  }
}