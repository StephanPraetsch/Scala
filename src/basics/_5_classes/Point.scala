package basics._5_classes

import java.io._

class Point(val xc: Int, val yc: Int) {

  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }

  override def toString() = "Point[" + x + "," + y + "]"

}

class Location(override val xc: Int, override val yc: Int, val zc: Int) extends Point(xc, yc) {

  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
  }

  // TODO dont know how override toString here
  //  override def toString() = "Location[" + x + "," + y + "," + z + "]"

}

object Demo {

  def main(args: Array[String]) {
    val pt = new Point(10, 20);
    pt.move(10, 10);
    println(pt)

    val loc = new Location(10, 20, 30)
    loc.move(1, 2, 10);
    println(loc)

  }

}
