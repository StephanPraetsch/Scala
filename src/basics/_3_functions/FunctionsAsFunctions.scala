package basics._3_functions

object FunctionsAsFunctions extends App {

  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }

  def timeFlies() {
    println("time flies like an arrow...")
  }

  oncePerSecond { timeFlies }

}
