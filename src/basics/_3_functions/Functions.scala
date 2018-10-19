package basics._3_functions

object Functions extends App {

  def next(current: Int): Int = current + 1
  println(next(1))

  def say(text: String) = {
    println(text)
  }
  println("return of say = " + say("Hello Function"))

  def add = (x: Int, y: Int) => x + y
  println("add = " + add(1, 2))

}
