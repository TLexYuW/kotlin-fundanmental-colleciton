package _06

/**
 * @author : Lex Yu
 * @date : 25/05/2023
 */
fun main() {
    val num = 36
    val str = "String"

    val text = when (num) {
        12, 24, 36 -> "The number is $num"
        in 1000 .. 10000 -> "In the range 1000..10000"
        10 -> println("The number is $num")
        5 -> println("The number is $num")
        99 -> println("The number is $num")
        100 -> println("The number is $num")
        99999 -> {
            "The number is $num"
        }
        else -> println("The number is $num")
    }

    println("text = $text")

    when (str) {
        "A" -> println("The Input is $str")
        "C" -> println("The Input is $str")
        "5" -> println("The Input is $str")
        "D" -> println("The Input is $str")
        "E" -> println("The Input is $str")
        "J" -> println("The Input is $str")
        "String" -> println("The Input is $str")
    }
}