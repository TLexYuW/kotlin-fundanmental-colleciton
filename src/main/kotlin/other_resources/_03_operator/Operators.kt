package other_resources._03_operator

fun main() {
    var x = 10
    val y = 3
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var result = x + y

    result += 2
    println("result = $result")
    result -= 2
    println("result = $result")
    result *= 2
    println("result = $result")
    result /= 2
    println("result = $result")
    result %= 2
    println("result = $result")

    x = 1
    println("x = ${x++}")
    println("x = ${++x}")
    println("x = ${x--}")
    println("x = ${--x}")

}
