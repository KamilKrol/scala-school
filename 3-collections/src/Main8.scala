/**
  * Created by kamil on 02.12.15.
  */
object Main8 {

  def main(args: Array[String]): Unit = {

    val employees = Map(1 -> "J-C", 2 -> "Kamil", 3 -> "Matei", 4 -> "Mateusz")

    val filtered = employees.filter(_._1 > 2)
    println("filtered: " + filtered)

    val filteredWithCase = employees.filter({ case (id, name) => id > 2 })
    println("filteredWithCase: " + filteredWithCase)
  }

}
