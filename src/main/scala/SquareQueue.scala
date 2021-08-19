import scala.collection.mutable.ListBuffer

class SquareQueue extends Queue {
  override def enqueue(Item: Double): String = {

    if (front == -1 && rear == -1) {
      front = front + 1
      rear = rear + 1
      queue = queue ::: List(Item * Item)
      println(queue)
      "Item is enqueued..."
    }


    else {
      rear = rear + 1
      queue = queue ::: List(Item * Item)
      println(queue)
      "Item is enqueued.."
    }
  }


  def dequeue: Unit = {

    if (front == -1 && rear == -1)
      "UnderFlow"

    else if (front == rear) {
      queue = queue.drop(1)
      front = -1
      rear = -1
      println(queue)
      "Item Dequeued..."
    }

    else
      queue = queue.drop(1)
    front = front + 1
    println(queue)
    "Item Dequeued"
  }
}
