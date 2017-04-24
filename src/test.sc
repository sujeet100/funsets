val x = "MexIco"
val y = "MexIcobMexIcobFILbMexIcobMexIcobjMexIcobvMexIcobMexIcobMexIcobgMexIcobdMexIcobZVMexIcobMexIcobaMexIcob"
val s = x.permutations.foldLeft(0)((a, b) => a + b.r.findAllMatchIn(y).length)
List('t', 'u', 'r', 'e', ' ', 'f', 'r', 'o', 'm', ' ', '4', '5', ' ', 'B', 'C', ',', ' ', 'm', 'a', 'k', 'i', 'n', 'g', ' ', 'i', 't', ' ', 'o', 'v', 'e', 'r', ' ', '2', '0', '0', '0', ' ', 'y', 'e', 'a', 'r', 's', ' ', 'o', 'l', 'd', '.', ' ', 'R', 'i', 'c', 'h', 'a', 'r', 'd', ' ', 'M', 'c').mkString("")

val l = List(1, 2, 4)
val l2 = List(1, 2, 4)




1 :: (2 :: (3 :: (Nil)))