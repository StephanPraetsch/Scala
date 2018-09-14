package basics._4_data_structures

object Maps extends App {

  {
    val map = Map("x" -> 1, "y" -> 2, "z" -> 3)
    println("map with '->' " + map)
  }

  {
    val map = Map(("x", 4), ("y", 5), ("z", 6))
    println("map with '(x,y)' " + map)
  }

  {
    println("==========================")
    val map = Map((1, "a"), (2, "b"), (3, "c"))
    println("operations on " + map);
    println("map.get(1) = " + map.get(1))
    println("map.apply(2) = " + map.apply(3))
    println("map+(4,d) = " + (map + (4 -> "d")))
    println("map++(Map(5,e)) = " + (map ++ Map(5 -> "e")))
    println("map-2 = " + (map - 2))
    println("map--(List(1,2)) = " + (map -- List(1, 2)))
  }

}
