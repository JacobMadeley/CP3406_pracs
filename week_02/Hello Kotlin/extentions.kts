fun String.hasSpaces(): Boolean {
    val found = this.indexOf(' ')
// also valid: this.indexOf(" ")
// returns positive number index in String or -1 if not found
    return found != -1
}
fun String.hasSpaces() = indexOf(" ") != -1

class AquariumPlant(val color: String, private val size: Int)fun
AquariumPlant.isRed() = color == "red" // OK
fun AquariumPlant.isBig() = size > 50 // gives error
// error: cannot access 'size': it is private in 'AquariumPlant'
// fun AquariumPlant.isBig() = size > 50

open class AquariumPlant(val color: String, private val size: Int)
class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)fun
        AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")val plant =
    GreenLeafyPlant(size = 10)
plant.print()
println("\n")
val aquariumPlant: AquariumPlant = plant
aquariumPlant.print()
// GreenLeafyPlant
// AquariumPlant

val AquariumPlant.isGreen: Boolean
    get() = color == "green"

aquariumPlant.isGreen
// res6: kotlin.Boolean = true

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}val plant: AquariumPlant? = null
plant.pull()

