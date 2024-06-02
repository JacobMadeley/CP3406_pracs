val list = listOf(1, 5, 3, 4)
println(list.sum())
// 13

val list2 = listOf("a", "bbb", "cc")
println(list2.sum())
// error: unresolved reference. None of the following candidates is applicable because of receiver type mismatch:


val list2 = listOf("a", "bbb", "cc")
println(list2.sumBy { it.length })
// 6

val list2 = listOf("a", "bbb", "cc")
for (s in list2.listIterator()) {
    println("$s ")
}
// a bbb cc

val scientific = hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio" )

println (scientific.get("guppy"))
// poecilia reticulata

println(scientific.get("zebra fish"))
// danio rerio

println(scientific.get("swordtail"))
// null

println(scientific.getOrDefault("swordtail", "sorry, I don't know"))
// sorry, I don't know

println(scientific.getOrElse("swordtail") {"sorry, I don't know"})
// sorry, I don't know