package complexer

// companion object
object FussballSpiel {
  val dauer = 90

  def restSpielZeit(spielZeit: Int): Int = {
    dauer - spielZeit
  }
}

// companion class
class FussballSpiel {
  var toreHeim = 0
  var toreGast = 0
  var spielZeit = 0

  def torDifferenz(): Int = {
    Math.abs(toreHeim - toreGast);
  }

  def restSpielZeit(): Int = {
    FussballSpiel.restSpielZeit(spielZeit)
  }
}

object MainFussballSpiel extends App {

  val fs = new FussballSpiel()
  println(fs)
  println(fs.restSpielZeit())

}
