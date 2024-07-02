package own.loops

/**
 * @author : Lex Yu
 */
fun main() {
    for (i in 1..10) {
        println("i = $i")
    }

    (1..10).forEach { x -> println("x = $x") }
}