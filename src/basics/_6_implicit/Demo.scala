package basics._6_implicit

object Demo {

  implicit class IntTimes(x: Int) {
    def times[A](function: => A): Unit = {
      def loop(current: Int): Unit =
        if (current > 0) {
          function
          loop(current - 1)
        }
      loop(x)
    }
  }

  def main(args: Array[String]) {
    4 times println("hello")
  }

}
