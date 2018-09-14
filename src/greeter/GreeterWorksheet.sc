package greeter

object GreeterWorksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val x = 0                                       //> x  : Int = 0
  def increase(i: Int) = i + 1                    //> increase: (i: Int)Int
  increase(x)                                     //> res0: Int = 1
}