package L3.q15

fun main() {
    println(whatShouldIDoToday(readLine().toString()))
}

fun whatShouldIDoToday(mood: String,
                       weather: String = "sunny",
                       temperature: Int = 24): String {

    return when {
        isHappy(mood) && isSunny(weather) -> "go for a walk"
        isSad(mood) && isRainy(weather) && isZero(temperature) -> "stay in bed"
        isHot(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun isSad(mood: String) = mood == "sad"
fun isHappy(mood: String) = mood == "happy"
fun isRainy(weather: String) = weather == "rainy"
fun isSunny(weather: String) = weather == "sunny"
fun isZero(temperature: Int) = temperature == 0
fun isHot(temperature: Int) = temperature > 35