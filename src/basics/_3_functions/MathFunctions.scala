package basics._3_functions

object MathFunctions extends App {

  def sum(xs: Seq[Int]): Int = xs.foldLeft(0)(_ + _)
  println("1+2+4 = " + sum(Seq(1, 2, 4)))

  def product(xs: Seq[Int]): Int = xs.foldLeft(1)(_ * _)
  println("1*2*4 = " + product(Seq(1, 2, 4)))

}
