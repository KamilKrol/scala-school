/**
  * Created by kkrol on 01/12/2015.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    val list = List(1, 1, 2, 2, 3, 4)
    println(list)

    val set = Set(1, 1, 2, 2, 3, 4)
    println(set)

    val hostPort = ("cern.ch", 8080)
    println(hostPort)
    println("Host: " + hostPort._1 + " - Port: " + hostPort._2)

    hostPort match {
      case ("localhost", port) => println("Local connection on port: " + port)
      case (host, port) => println("Remote connection to " + host + " on port " + port)
    }

    val specialTuple = 1 -> 2
    println(specialTuple)

    val map = Map(1 -> "one", 2 -> "two", 3 -> "three")
    println(map)
    println(map.get(1) + " " + map.get(4))
  }

}
