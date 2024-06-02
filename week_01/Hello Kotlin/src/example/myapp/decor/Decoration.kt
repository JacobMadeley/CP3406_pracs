package example.myapp.decor

data class Decoration2(
    val rocks: String, val wood: String, val diver:
    String
)

fun makeDecorations() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)
// Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}

class Direction {
    class NORTH {
        companion object {
            val degrees: Double = Math.toRadians(0.0)
            const val name: String = ""
            val ordinal: Int by lazy { ordinal }
        }
    }

    class EAST {
        companion object {
            val degrees: Double = Math.toRadians(90.0)
            const val name: String = ""
            val ordinal: Int by lazy { ordinal }
        }
    }

    class SOUTH {
        companion object {
            val degrees: Double = Math.toRadians(180.0)
            const val name: String = ""
            val ordinal: Int by lazy { ordinal }
        }
    }

    class WEST {
        companion object {
            val degrees: Double = Math.toRadians(270.0)
            const val name: String = ""
            val ordinal: Int by lazy { ordinal }
        }
    }
}

class Choice {
    companion object {
        var name: String = "lyric"
        fun showDescription(name: String) = println("My favorite $name")
    }
}

fun main() {
    makeDecorations()
    println(Color.RED)
    println(Color.GREEN)
    println(Color.BLUE)
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
    Choice.showDescription("pick")
    Choice.showDescription("selection")
}


