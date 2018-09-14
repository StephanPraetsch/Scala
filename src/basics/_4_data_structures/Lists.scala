package basics._4_data_structures

object Lists extends App {

  {
    println("++")
    val list = List(1, 2, 3, 4, 5)
    val array = Array(6, 7, 8, 9)
    val list2 = list ++ array
    println(list2)
  }

  {
    println("+:")
    val list = List(1, 2, 3, 4)
    val list2 = 5 +: list
    println(list2)
  }

  {
    println("::")
    val list1 = List(2, 3, 4)
    val list2 = 1 :: list1
    println(list1)
    println(list2)

    val list3 = 1 :: Nil :: List(2) :: 3 :: 4 :: Nil
    println(list3)
  }

  {
    println("apply")
    val list = List(3, 7, 2, 0, 5)
    println(list.apply(2))
    println(list(3))
  }

  {
    println("filter")
    val list = List(1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37)
    println("even x = " + list.filter((x: Int) => x % 2 == 0))
    println("x < 10 = " + list.filter(x => x < 10))
    println("20 <= x = " + list.filter(20 <= _))
  }

  {
    println("foldLeft")
    var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("-13 + sum(list) = " + list.foldLeft(-13)((a, b) => a + b))
    println("toString = " + list.foldLeft("start")((a, b) => a + "," + b))
  }

  {
    println("forAll")
    val aList = List(1, 34, 5, 2, 4, 56)
    println(aList.forall(i => i < 100))
    println(aList.forall(_ < 50))
  }

  {
    println("forEach")
    List(1, 6, 3, 9, 4).foreach(i => print(i + ","))
    println()
  }

  {
    println("map *2 = " + List(1, 2, 3, 4).map(_ * 2))
    println("map *3 = " + List(1, 2, 3, 4).map { x => x * 3 })
  }

  {
    println("reduceLeft")
    val reduced = List(1, 4, 5, 8, 5, 2, 5).reduceLeft { (a, b) =>
      if (a > b) {
        a * 2
      } else {
        b
      }
    }
    println("reduced = " + reduced)
  }

}
