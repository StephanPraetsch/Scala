package basics._3_functions

object Playing {

  def main(args: Array[String]): Unit = {
    println("hello")
    partialFunction()
  }

  val f2: PartialFunction[List[Int], String] = {
    case Nil => "no element"
    case x :: y :: rest => "three elements"
    case x => "one element"
    case x :: y => "two elements"
  }

  def partialFunction() = {
    f2.isDefinedAt(List(1, 2, 3))
    f2(List(1, 2, 3))
    f2(List(1))
    f2(List(1, 2))

  }

}