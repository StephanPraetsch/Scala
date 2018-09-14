package playing

object BasicsWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(111); 

  val f: PartialFunction[String, String] = { case "ping" => "pong" };System.out.println("""f  : PartialFunction[String,String] = """ + $show(f ));$skip(13); val res$0 = 

  f("ping");System.out.println("""res0: String = """ + $show(res$0));$skip(24); val res$1 = 
  f.isDefinedAt("pong");System.out.println("""res1: Boolean = """ + $show(res$1));$skip(187); 

  val f2: PartialFunction[List[Int], String] = {
    case x :: y :: z  => "three elements"
    case x :: y => "two elements"
    case x => "one element"
    case Nil => "no element"
  };System.out.println("""f2  : PartialFunction[List[Int],String] = """ + $show(f2 ));$skip(33); val res$2 = 

  f2.isDefinedAt(List(1, 2, 3));System.out.println("""res2: Boolean = """ + $show(res$2));$skip(20); val res$3 = 
  f2(List(1, 2, 3));System.out.println("""res3: String = """ + $show(res$3));$skip(14); val res$4 = 
  f2(List(1));System.out.println("""res4: String = """ + $show(res$4));$skip(17); val res$5 = 
  f2(List(1, 2));System.out.println("""res5: String = """ + $show(res$5))}

}
