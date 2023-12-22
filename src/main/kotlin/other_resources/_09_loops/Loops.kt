package other_resources._09_loops

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

    println("-----------------------------------------------------------")

    for (i in 0..10) {
        if (i == 7) {
            break
        }
        println(i)
    }

    println("-----------------------------------------------------------")

    var n = 0
    while (n < 5){
        n++
        println(n)
        var q = 0
        while (q < 5){
            if (q == 2) break
            q++
            println("***$q")
        }
    }

    println("-----------------------------------------------------------")

    var o = 0
    outer@ while (o < 5){
        o++
        println(o)

        var q = 0
        while (q < 5){
            if (q == 0) break@outer
            q++
            println("***$q")
        }
    }
}