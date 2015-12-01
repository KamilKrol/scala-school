package shapes

/**
  * Created by kkrol on 01/12/2015.
  */
class Circle(r: Int) extends Shape {
  override def getArea(): Int = 3 * r * r
}
