package own.scope_function.let

import own.scope_function.Book

/**
 * @author : Lex Yu
 */

fun main() {
    // run : return result
    Book().run {
        name = "Elegant Kotlin"
        price = 7777
        name // return name
    }.let { println(it) }
}