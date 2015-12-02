/**
  * Created by kkrol on 02/12/2015.
  */
object Main3 {

  def main(args: Array[String]): Unit = {

    val extensions = List(PhoneExt("steve", 100), PhoneExt("robey", 200))

    val filtered = extensions.filter { case PhoneExt(name, extension) => extension < 200 }
    println(filtered)
    
  }

  case class PhoneExt(name: String, ext: Int)

}
