package own.loops

/**
 * @author : Lex Yu
 */
fun main() {
    whileDemo()

    doWhileDemo()
}

private fun doWhileDemo() {
    println("Do While Demo ----------------------------------------------------------->")
    var num = 10
    do {
        println(num++)
    } while (num < 20)
}

private fun whileDemo() {
    println("While Demo ----------------------------------------------------------->")
    var number = 0
    while (number < 10) {
        number++
        if (number == 7) {
            continue
        }
        println(number)
    }
}