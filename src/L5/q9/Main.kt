package L5.q9

import java.util.*

class Book(val title: String, val author: String, var pages : Int) {
    private var currentPage: Int = 1

    fun readPage() {
        currentPage++
    }


}

class Puppy() {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(book.pages) + 1)
    }
}

fun Book.weight() = pages * 1.5
fun Book.tornPages(pageToTorn : Int) {
    if(pageToTorn <= 0) return
    if(pageToTorn > this.pages) this.pages = 0
    else this.pages -= pageToTorn
}

fun main() {
    val p = Puppy()
    val b = Book("Harry Potter", "J.K. Rowling", 400)

    println("Start playing")
    while (b.pages > 0) {
        p.playWithBook(b)
    }
    println("Libro maciullato")

}