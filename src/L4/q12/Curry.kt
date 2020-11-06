package L4.q12

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {

    override fun prepareSpice() {
        println("Prepare Spice!")
    }
}