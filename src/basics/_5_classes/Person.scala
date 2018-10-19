package basics._5_classes

class Person(firstName: String, lastName: String, age: Int) {
  def isAdult: Boolean = if (age >= 18) true else false
  override def toString() = firstName + " " + lastName + " is " + (if (isAdult) "" else "not ") + "adult"
}

object MainPerson extends App {

  val p = new Person("foo", "bar", 20);
  println(p)

}
