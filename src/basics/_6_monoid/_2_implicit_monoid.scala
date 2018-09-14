package basics._6_monoid

import basics._6_monoid.first_monoid.Monoid

object implicit_monoid extends App {

  // definition of a monoid operation

  implicit class MonoidOps[A](self: A) {
    def |+|(other: A)(implicit m: Monoid[A]) = m.combine(self, other)
  }

  // implementations of monoid operations

  implicit val stringMonoid: Monoid[String] = new Monoid[String] {
    override val empty: String = ""
    override def combine(lhs: String, rhs: String) = lhs + rhs
  }

  implicit def listMonoid[A]: Monoid[List[A]] = new Monoid[List[A]] {
    override val empty: List[A] = List()
    override def combine(lhs: List[A], rhs: List[A]) = lhs ++ rhs
  }

  // using monoid operations

  println("starting with monoid")
  println("combine implicitly strings \"" + "Hello" |+| " " |+| "World" + "\"")
  println("combine implicitly lists " + (List("a") |+| List("b") |+| List("c")))

}
