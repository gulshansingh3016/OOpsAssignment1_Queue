object OOPsAssignment {
  def main(args: Array[String]): Unit = {
    val doubleQ = new DoubleQueue()
    val squareQ = new SquareQueue()

    println("======================DoubleQueue Enqueue===============================")
    doubleQ.enqueue(33)
    doubleQ.enqueue(53)
    doubleQ.enqueue(76)
    doubleQ.enqueue(62)
    doubleQ.enqueue(82)

    println("======================SquareQueue Enqueue===============================")
    squareQ.enqueue(20)
    squareQ.enqueue(40)
    squareQ.enqueue(60)
    squareQ.enqueue(80)
    squareQ.enqueue(100)

    println("======================DoubleQueue Dequeue===============================")
    doubleQ.dequeue()
    doubleQ.dequeue()

    println("======================SquareQueue Dequeue===============================")
    squareQ.dequeue()
    squareQ.dequeue()



  }
}
