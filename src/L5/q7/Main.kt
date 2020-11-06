package L5.q7

const val MAX_BOOKS = 100

object Costants {
    const val BASE_URL = "http://www.turtlecare.net/"
}

open class Book(val title: String, val author: String) {
    private var currentPage: Int = 1

    companion object {
        const val BASE_URL = "http://www.turtlecare.net/"
    }

    open fun readPage() {
        currentPage++
    }

    fun canBorrow(hasBooks : Int) : Boolean = hasBooks < MAX_BOOKS

    //fun printUrl() = println("${Costants.BASE_URL}$title.html")
    fun printUrl() = println("$BASE_URL$title.html")

}