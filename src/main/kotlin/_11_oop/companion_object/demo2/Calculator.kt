package _11_oop.companion_object.demo2

fun main() {
//    val cal = Calculator()
//    val sum = cal.sum(1111, 2222)
//    println(sum)

    val sum = Calculator.sum(1111, 2222)
    println(sum)

    println(Calculator.max)
}

class Calculator() {
    companion object {
        var max = Int.MAX_VALUE
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }

}