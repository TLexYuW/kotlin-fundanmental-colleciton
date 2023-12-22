package other_resources._05_logical_operator

/**
 * @author : Lex Yu
 * @date : 25/05/2023
 */
fun main() {
    val num1 = -5
    val num2 = -3
    val text = if (num1 > 0 || num2 > 0) {
        println("The condition is true")
        "This is text 1"
    } else {
        println("The condition is false")
        "This is text 2"
    }
    println("$text")
}