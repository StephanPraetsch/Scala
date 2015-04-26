package playing

object BasicsWorksheet {

  val f: String => String = {
    case "ping" => "pong"
    case "a" => "b"
  }                                               //> f  : String => String = <function1>

  f("ping")                                       //> res0: String = pong
  f("a")                                          //> res1: String = b
  f("pong")                                       //> scala.MatchError: pong (of class java.lang.String)
                                                  //| 	at playing.BasicsWorksheet$$anonfun$main$1$$anonfun$1.apply(playing.Basi
                                                  //| csWorksheet.scala:5)
                                                  //| 	at playing.BasicsWorksheet$$anonfun$main$1$$anonfun$1.apply(playing.Basi
                                                  //| csWorksheet.scala:5)
                                                  //| 	at playing.BasicsWorksheet$$anonfun$main$1.apply$mcV$sp(playing.BasicsWo
                                                  //| rksheet.scala:12)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at playing.BasicsWorksheet$.main(playing.BasicsWorksheet.scala:3)
                                                  //| 	at playing.BasicsWorksheet.main(playing.BasicsWorksheet.scala)

}