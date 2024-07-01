package own.scope_function

/**
 * @author : Lex Yu
 */
data class Book(var name: String = "", var price: Int = 0) {
    fun getContent() {
        println("Secret Content")
    }
}

fun main() {
    val book = Book()
    book.name = "Learning kotlin"
    book.price = 400
    println(book)
}