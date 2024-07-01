package own.scope_function.let

import own.scope_function.Book

/**
 * @author : Lex Yu
 */

fun main() {
    with(Book()) {
        name = "Kotlin vs Java"
        price = 1111
        name
    }.let { println(it) }
}