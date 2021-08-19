import scala.collection.mutable.ListBuffer

trait Queue {
  var queue: List[Double] = List.empty
  var front: Int = -1
  var rear: Int = -1

  def enqueue(Item: Double): String

  def dequeue(): Unit


}


