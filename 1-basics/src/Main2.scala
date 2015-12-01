/**
  * Created by kkrol on 01/12/2015.
  */
object Main2 {

  def main(args: Array[String]): Unit = {
    println(capitalizeAll("kamil", "j-c"))
  }

  def capitalizeAll(args: String*) = {
    args.map { arg =>
      arg.capitalize
    }
  }

}
