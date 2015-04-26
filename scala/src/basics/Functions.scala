package basics

object Functions extends App {

  def next(current: Int): Int = current + 1
  println(next(1))

  def say(text: String) = {
    println(text)
  }
  val a = say("Hello Function")
  println("return of say = " + a)

  def partial1(c: String) = partial21("das", "ist")(c)
  def partial21(a: String, b: String)(c: String) = parameterListe(a, b)(c)("ende")
  def parameterListe(a: String, b: String)(c: String)(d: String) = println(a + " " + b + " " + c + " " + d)
  partial1("das")

  def add = (x: Int, y: Int) => x + y
  println("add = " + add(1, 2))

}
