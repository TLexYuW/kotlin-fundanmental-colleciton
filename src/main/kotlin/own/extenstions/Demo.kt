package own.extenstions

/**
 * @author : Lex Yu
 */

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

fun Int.multiplyByTen(): Int {
    return this * 10
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}
fun main() {
    val arr = mutableListOf('a', 'b', 'c')
    arr.swap(0, 2)

    println(arr)

    println(10.multiplyByTen())

    println("String".lastChar())
}