import java.util.*

fun main(args: Array<String>) {
    feddTheFish()
}

fun shouldChangeWater(day: String,
                      temperature: Int = 22,
                      dirty: Int = 20) : Boolean {
     return true
}

fun feddTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    if(shouldChangeWater(day)) {
        println("Change the water today!")
    }
}

fun fishFood(day: String): String {
    return when(day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "red worms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}
