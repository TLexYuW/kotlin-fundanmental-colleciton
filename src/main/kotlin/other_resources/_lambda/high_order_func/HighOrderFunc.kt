package other_resources._lambda.high_order_func

/**
 * @author : Lex Yu
 */
// Higher order function example: Calculator
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}
fun add(x: Int, y: Int): Int {
    return x + y
}
fun subtract(x: Int, y: Int): Int {
    return x - y
}
fun multiply(x: Int, y: Int): Int {
    return x * y
}

fun main() {
    val result1 = calculate(10, 5, ::add)
    println("Addition: $result1") // Output: Addition: 15
    val result2 = calculate(10, 5, ::subtract)
    println("Subtraction: $result2") // Output: Subtraction: 5
    val result3 = calculate(10, 5, ::multiply)
    println("Multiplication: $result3") // Output: Multiplication: 50
}