package traits

/**
  * Created by kkrol on 01/12/2015.
  */
trait Cache[K, V] {
  def get(key: K): V
  def put(key: K, value: V)
  def delete(key: K)
}