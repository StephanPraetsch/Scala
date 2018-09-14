package playing

object BasicsWorksheet {

  val f: PartialFunction[String, String] = { case "ping" => "pong" }
                                                  //> f  : PartialFunction[String,String] = <function1>

  f("ping")                                       //> res0: String = pong
  f.isDefinedAt("pong")                           //> res1: Boolean = false

  val f2: PartialFunction[List[Int], String] = {
    case x :: y :: z  => "three elements"
    case x :: y => "two elements"
    case x => "one element"
    case Nil => "no element"
  }                                               //> f2  : PartialFunction[List[Int],String] = <function1>

  f2.isDefinedAt(List(1, 2, 3))                   //> res2: Boolean = true
  f2(List(1, 2, 3))                               //> res3: String = three elements
  f2(List(1))                                     //> res4: String = two elements
  f2(List(1, 2))                                  //> res5: String = three elements

}