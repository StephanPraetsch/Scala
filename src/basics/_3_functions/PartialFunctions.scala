package basics._3_functions

object Playing {

  def main(args: Array[String]): Unit = {
    println("hello")
    println("partial = " + partialFunction())
  }

  val f2: PartialFunction[List[Int], String] = {
    case Nil => "no element"
    case x :: y :: rest => "three elements"
    case x :: y => "two elements"
    case x => "one element" // TODO broken, dont know why
  }

  def partialFunction() = {
    println("f2.isDefinedAt = " + f2.isDefinedAt(List(1, 2, 3)))
    println("f2(Nil) = " + f2(Nil))
    println("f2(List(1)) = " + f2(List(1)))
    println("f2(List(1, 2)) = " + f2(List(1, 2)))
    println("f2(List(1, 2, 3)) = " + f2(List(1, 2, 3)));
    println("f2(List(1, 2, 3, 4)) = " + f2(List(1, 2, 3, 4)));
    "return value"
  }

  def parameterListe(a: String, b: String)(c: String)(d: String) = println(a + " " + b + " " + c + " " + d)
  def partial21(a: String, b: String)(c: String) = parameterListe(a, b)(c)("end")
  def partial1(c: String) = partial21("that", "is")(c)
  partial1("the")

}