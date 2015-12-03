/**
  * Created by kamil on 03.12.15.
  */
object Main7 {

  class MakeFoo[A](implicit manifest: Manifest[A]) {
    def make: A = manifest.runtimeClass.newInstance.asInstanceOf[A]
  }

  def main(args: Array[String]): Unit = {

    val fooMaker = new MakeFoo[String]()
    println(fooMaker.make)

  }

}
