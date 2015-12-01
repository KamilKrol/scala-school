package objects

/**
  * Created by kkrol on 01/12/2015.
  */
object Timer {
  var count = 0

  def currentCount(): Long = {
    count += 1
    count
  }
}
