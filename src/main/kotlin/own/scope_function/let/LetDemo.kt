package own.scope_function.let

import own.scope_function.Book

/**
 * @author : Lex Yu
 */

fun main() {
    Book().apply {
        this.name = "Kotlin Fundamental"
        this.price = 1000
    }.let { println(it) }


    Book().apply {
        this.name = "Kotlin Better"
        this.price = 777
    }.let { println(it.price) }

    Book().apply {
        this.name = "Kotlin"
        this.price = 555
    }.let { book -> println(book) }
}