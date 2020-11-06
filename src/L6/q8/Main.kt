package L6.q8

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

data class Player(var x : Int, var y : Int)

object GameMap {
    var width : Int = 4
    var height : Int = 4
    val map = Array(width) { arrayOfNulls<String>(height)}

    init {
        var k = 1
        for(i in 0 until height) {
            for(j in 0 until width) {
                map[j][i] = k++.toString()
            }
        }
    }

    fun getArea(x: Int, y: Int) = map[y][x]

}

class Game {
    val gameMap = GameMap
    val player = Player(0,0)
    var path = mutableListOf(Directions.START)
    val north = {path.add(Directions.NORTH);}
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

    fun makeMove(move : String?) {
        if(updateLocation(move)) {
            when(move) {
                "n"-> move(north)
                "s"-> move(south)
                "e"-> move(east)
                "w"-> move(west)
                else -> println("$move is an unknown move!")
            }
        } else  println("$move is an invalid move from your current position = (${player.x}, ${player.y})")
    }

    fun getCurrentArea() = gameMap.getArea(player.x, player.y)

    private fun move(where : () -> Boolean) {
        where()
    }

    private fun updateLocation(move: String?): Boolean {
        var x = player.x
        var y = player.y
        //Simulate move
        when(move) {
            "n"-> y--
            "s"-> y++
            "e"-> x++
            "w"-> x--
            else -> {println("$move is an unknown move!"); return false;}
        }
        //Check if move is valid
        if(x < 0 || x >= gameMap.width || y < 0 || y >= gameMap.height) return false
        //Valid move, so update player position
        player.x = x
        player.y = y
        return true
    }

}

fun main() {
    val g = Game()

    while(true) {
        println("You are in position (${g.player.x}, ${g.player.y}) area: ${g.getCurrentArea()}")
        print("Enter a direction: n/s/e/w:")
        g.makeMove(readLine())
    }
}