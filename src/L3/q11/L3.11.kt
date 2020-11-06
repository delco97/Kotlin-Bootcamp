package L3.q11

fun canAddFish(tankSize: Double,
                currentFish: List<Int>,
                fishSize: Int = 2,
                hasDecorations: Boolean = true) : Boolean {
    var availableSpace = tankSize
    //Remove space occupied by decoration, if any.
    if(hasDecorations) availableSpace *=  0.8
    //Remove space occupied by current fish
    for (f in currentFish) availableSpace -= f
    return availableSpace >= fishSize
}

fun main(args: Array<String>) {
    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}