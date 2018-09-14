package complexer

object Closures {
  def main(args: Array[String]): Unit = {
    new Closures
  }
}

class Closures {
  def adderMaker(value: Int) = (x: Int) => value + x

  // das sind closures
  val adder1 = adderMaker(3)
  val adder2 = adderMaker(40)

  val adderHandler = new AdderHandler()
  adderHandler.handleAdder(adder1)
  adderHandler.handleAdder(adder2)
}

class AdderHandler {
  def handleAdder(f: Int => Int) = println(f(2))
}
