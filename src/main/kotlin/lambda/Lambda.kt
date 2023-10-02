package lambda

/**
 * @author : Lex Yu
 */

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun main() {
    val add2: (Int, Int) -> Int = { a: Int, b: Int -> a + b }

    println("Result = ${add(100, 500)}")

    println("Result = ${add2(100, 500)}")
}
