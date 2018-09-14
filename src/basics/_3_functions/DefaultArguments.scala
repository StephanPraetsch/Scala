package basics._3_functions

object StandardArgumente {
  def main(args: Array[String]) {
    standard1()
    standard1(3)
    standard1(4, 5.0)
  }

  def standard1(v1: Int = 1, v2: Double = 2.0) {
    println(v1 + " " + v2)
  }
}
