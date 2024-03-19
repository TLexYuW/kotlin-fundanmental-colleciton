package ref_official.generics.upper_bounds

/**
 * @author : Lex Yu
 */

fun <T> copyWhenGreater(list: List<T>, threshold: T): List<String>
        where T : CharSequence,
              T : Comparable<T> {
    return list.filter { it > threshold }.map { it.toString() }
}

fun main() {
    val stringList = listOf("apple", "banana", "cherry")
    val copiedList = copyWhenGreater(stringList, "b")
    println(copiedList)
}