package basics._5_objects

// case class: each param becomes a member
case class Person(firstName: String, lastName: String, age: Int) {
  def isAdult: Boolean = if (age >= 18) true else false
}

object MainPerson extends App {

  val p = new Person("foo", "bar", 20);
  println(p + " isAdult=" + p.isAdult)

}
