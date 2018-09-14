package basics._6_monoid

object first_monoid extends App {

  // definition of a monoid

  trait Monoid[A] {
    def empty: A
    def combine(lhs: A, rhs: A): A
  }

  object Monoid {
    def apply[A: Monoid]: Monoid[A] = implicitly
  }

  // implementations of a monoid

  implicit val stringMonoid: Monoid[String] = new Monoid[String] {
    override val empty: String = ""
    override def combine(lhs: String, rhs: String) = lhs + rhs
  }

  implicit val intMonoid: Monoid[Int] = new Monoid[Int] {
    override val empty: Int = 0
    override def combine(lhs: Int, rhs: Int) = lhs + rhs
  }

  implicit def listMonoid[A]: Monoid[List[A]] = new Monoid[List[A]] {
    override val empty: List[A] = List()
    override def combine(lhs: List[A], rhs: List[A]) = lhs ++ rhs
  }

  // using monoids

  println("starting with monoid")
  println("empty string \"" + Monoid[String].empty + "\"")
  println("combine string \"" + Monoid[String].combine("Hello", "World") + "\"")
  println("combine ints " + Monoid[Int].combine(1, Monoid[Int].combine(2, 3)))
  println("combine lists " + Monoid[List[Int]].combine(List(1, 3, 5), List(2, 4, 6)))

}
