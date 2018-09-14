package basics._2_program_flow

object ite extends App {

  val a = control('-', 1, 2)
  println("a=" + a)
  control('+', 1, 2)
  control('*', 1, 2)

  def control(op: Char, value1: Int, value2: Int) {
    if (op.equals('-')) {
      println("Minus")
      value1 - value2
    } else if (op.equals('+')) {
      println("Plus")
      value1 + value2
    } else println("None")
  }

  val ifExample = new IfExample()

  ifExample.checkTheValue(3)
  ifExample.checkTheValue(2)

}

class IfExample {
  def checkTheValue(checkValue: Int) {
    val check = if (checkValue % 2 == 0) "gerade" else "ungerade"
    println("checkValue " + checkValue + " ist " + check)
  }
}
