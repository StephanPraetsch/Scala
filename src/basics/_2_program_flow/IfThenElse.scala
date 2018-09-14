package basics._2_program_flow

object ite extends App {

  def control(op: Char, value1: Int, value2: Int) {
    if (op.equals('-')) {
      println(value1 + " minus " + value2)
      value1 - value2
    } else if (op.equals('+')) {
      println(value1 + " plus " + value2)
      value1 + value2
    } else println("None")
  }

  val a = control('-', 1, 2)
  println(a.toString())
  control('+', 1, 2)
  control('*', 1, 2)

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
