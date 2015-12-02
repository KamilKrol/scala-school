/**
  * Created by kkrol on 02/12/2015.
  */
object Main1 {

  def main(args: Array[String]): Unit = {

    val name = "Kamil"
    println(f(g(name)))

    val fComposeG = f _ compose g _
    println(fComposeG(name))

    val fAndThenG = f _ andThen g _
    println(fAndThenG(name))
  }

  def f(s: String) = "f(" + s + ")"

  def g(s: String) = "g(" + s + ")"

}
