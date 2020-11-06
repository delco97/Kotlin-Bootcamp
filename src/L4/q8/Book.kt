package L4.q8

open class Book(val title: String, val author: String) {
    private var currentPage: Int = 1

    open fun readPage() {
        currentPage++
    }
}