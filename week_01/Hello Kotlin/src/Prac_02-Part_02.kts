val twoLists = fish.partition { isFreshWater(it) }
println("freshwater: ${twoLists.first}")
println("saltwater: ${twoLists.second}")

val equipment = "fish net" to "catching fish"
println("${equipment.first} used for ${equipment.second}")
// fish net used for catching fish

val numbers = Triple(6, 9, 42)
println(numbers.toString())
println(numbers.toList())
// (6, 9, 42)[6, 9, 42]

val equipment2 = ("fish net" to "catching fish") to "equipment"
println("${equipment2.first} is ${equipment2.second}\n")
println("${equipment2.first.second}")
(fish net, catching fish) is equipment
// catching fish

val equipment = "fish net" to "catching fish"
val (tool, use) = equipment
println("$tool is used for $use")
// fish net is used for catching fish

val numbers = Triple(6, 9, 42)
val (n1, n2, n3) = numbers
println("$n1 $n2 $n3")
// 6 9 42