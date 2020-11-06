package L3.q7

fun main(args: Array<String>) {
    var msg = getFortuneCookie()
    val target = "Take it easy and enjoy life!"
    var i = 0
    while (msg != target) {
        println("Extraction #${i}: ${msg}")
        msg = getFortuneCookie()
    }

    print("End")
}

fun getFortuneCookie() : String {
    val fortunes = listOf("You will have a great day!", "Things will go well for you today.","Enjoy a wonderful day of success.", "Be humble and all will turn out well.","Today is a good day for exercising restraint.","Take it easy and enjoy life!","Treasure your friends because they are your greatest fortune.")
    var birthday: Int? = 1
    print("Enter your birthday: ")
    birthday = (readLine()?.toIntOrNull()?:1)
    return fortunes[birthday % fortunes.count()]
}
