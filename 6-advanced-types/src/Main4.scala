/**
  * Created by kkrol on 03/12/2015.
  */
object Main4 {

  trait Container[M[_]] {
    def put[A](x: A): M[A]

    def get[A](m: M[A]): A
  }

  implicit val listContainer = new Container[List] {
    override def put[A](x: A): List[A] = List(x)

    override def get[A](m: List[A]): A = m.head
  }

  implicit val optionContainer = new Container[Option] {
    override def put[A](x: A): Option[A] = Option(x)

    override def get[A](m: Option[A]): A = m.get
  }

  def tupleize[M[_] : Container, A, B](fst: M[A], snd: M[B]) = {
    val c = implicitly[Container[M]]
    c.put(c.get(fst), c.get(snd))
  }

  def main(args: Array[String]): Unit = {

    println(listContainer.put("Kamil"))
    println(listContainer.get(List(1, 2, 3)))

    println(optionContainer.put("Kamil"))
    println(optionContainer.get(Option("Kamil")))

    println(tupleize(listContainer.put(1), listContainer.put(2)))
    println(tupleize(optionContainer.put(1), optionContainer.put(2)))

//    tupleize(Some(1), Some(2))
  }

}
