package own.scope_function.let

import own.scope_function.Book

/**
 * @author : Lex Yu
 */

fun main() {
    Book().apply {
        name = "Learning kotlin"
        price = 9999
    }.takeIf { it.price > 9000 }
        ?.let { println(it) }
}