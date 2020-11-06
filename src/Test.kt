import java.lang.IllegalArgumentException
import java.util.*

fun dayOfWeek() {
    println("What day is it today?")
}

fun nightCheck(p_h: String) {
/*    val h = p_h.toInt()
    if (h < 0 || h > 23)throw IllegalArgumentException("Invalid hours");
    val msg = if (h < 12) "Good morning, Kotlin"
    else "Good night, Kotlin"
    println(msg)*/
    println("Good ${if (p_h.toInt() < 12) "morning," else "night"}, Kotlin")

}


fun main(args: Array<String>) {
    //println("Hello, ${args[0]}!")
    dayOfWeek()
    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> println("Dom")
        2 -> println("Lun")
        3 -> println("Mar")
        4 -> println("Mer")
        5 -> println("Gio")
        6 -> println("Ven")
        7 -> println("Sab")
        else -> println("Unknown")

    }
    nightCheck("12")
}
