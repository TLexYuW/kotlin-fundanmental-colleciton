package own.scope_function.apply

import own.scope_function.Book

/**
 * @author : Lex Yu
 */

fun main() {
    // apply : return object itself
   val book = Book().apply {
        this.name = "Kotlin Fundamental"
        this.price = 1000
    }

    println(book)
}