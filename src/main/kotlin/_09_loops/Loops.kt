package _09_loops

/**
 * @author : Lex Yu
 * @date : 25/05/2023
 */
fun main(args: Array<String>) {

    for (i in 1..10) {
        println("i = $i")
    }

    println("-----------------------------------------------------------")

    for (i in 1 until 10) {
        println("i = $i")
    }

    println("-----------------------------------------------------------")

    for (i in 10 downTo 1) {
        println("i = $i")
    }

    println("-----------------------------------------------------------")

    for (i in 1 until 10 step 2) {
        println("i = $i")
    }

    println("-----------------------------------------------------------")

    var number = 0
    while (number < 10) {
        number++
        if (number == 7) {
            continue
        }
        println(number)
    }

    println("-----------------------------------------------------------")

    var num = 10
    do {
        println(num++)
    } while (num < 20)

    println("-----------------------------------------------------------")

    for (i in 0..10) {
        if (i in 3..8) {
            continue
        }
        println(i)
    }
}