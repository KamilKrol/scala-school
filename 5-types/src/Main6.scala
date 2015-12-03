

/**
  * Created by kamil on 02.12.15.
  */
object Main6 {

  def main(args: Array[String]): Unit = {

    val list = List(1,2,3)

    println(count(list))
//    println(hashcodes(list))

    val stringList = List("one", "two", "three")
    println(hashcodes(stringList))
  }

  def count[A](list: List[A]) = list.size

  def betterCount(list: List[_]) = list.size

  def hashcodes(l: Seq[_ <: AnyRef]) = l map (_.hashCode)

}
