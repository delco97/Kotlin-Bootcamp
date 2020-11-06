package L6.q3

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path = mutableListOf(Directions.START)

    val north = {path.add(Directions.NORTH)}
    val south = {path.add(Directions.SOUTH)}
    val east = {path.add(Directions.EAST)}
    val west = {path.add(Directions.WEST)}
    val end = {
        path.add(Directions.END)
        println("Game Over")
        println("Path: ${path.joinToString("->")}")
        path.clear()
        false
    }
}

fun main() {
    val g = Game()
    println(g.path)
    g.north()
    g.east()
    g.south()
    g.west()
    g.end()
    println(g.path)
}