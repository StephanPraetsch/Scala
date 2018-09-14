package basics._2_program_flow

object Match extends App {

  val iValue = 3

  iValue match {
    case 1 => println("eins")
    case 2 => println("zwei")
    case 3 => println("drei")
    case 4 => println("vier")
    case 5 => println("fuenf")
    case _ => println("nothing")
  }

}
