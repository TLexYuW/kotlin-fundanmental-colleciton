package own.loops

/**
 * @author : Lex Yu
 */
fun main() {
    continueDemo()

    breakDemo()

    breakDemo2()

    flagDemo()
}

private fun breakDemo2() {
    println("break Demo 2 ----------------------------------------------------------->")

    var n = 0
    while (n < 5) {
        n++
        println(n)
        var q = 0
        while (q < 5) {
            if (q == 2) break
            q++
            println("***$q")
        }
    }
}

private fun breakDemo() {
    println("break Demo ----------------------------------------------------------->")

    for (i in 0..10) {
        if (i == 7) {
            break
        }
        println(i)
    }
}

private fun flagDemo() {
    println("flag Demo ----------------------------------------------------------->")

    var o = 0
    outer@ while (o < 5) {
        o++
        println(o)

        var q = 0
        while (q < 5) {
            if (q == 0) break@outer
            q++
            println("***$q")
        }
    }
}

private fun continueDemo() {
    println("continue Demo ----------------------------------------------------------->")

    for (i in 0..10) {
        if (i in 3..8) {
            continue
        }
        println(i)
    }
}