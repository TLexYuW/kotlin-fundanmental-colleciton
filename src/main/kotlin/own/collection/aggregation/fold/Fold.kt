package own.collection.aggregation.fold

/**
 * @author : Lex Yu
 */
fun main() {
    val numbers = listOf(5, 2, 10, 4)
    val sumDoubled = numbers.fold(18) { sum, element -> sum + element * 2 } // 18 + 42
    println(sumDoubled)
}