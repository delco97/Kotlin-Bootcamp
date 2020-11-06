package L4.q5

class Spice(val name: String, val spiciness: String = "mild") {
    val heat : Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

}

fun makeSalt() = Spice("Salt")


fun main() {
    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    val spice = Spice("cayenne", spiciness = "spicy")

    val spicelist = spices1.filter {it.heat < 5}

}