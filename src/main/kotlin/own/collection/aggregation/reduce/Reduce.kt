package own.collection.aggregation.reduce

/**
 * @author : Lex Yu
 */
fun main() {
    val numbers = listOf(5, 2, 10, 4)
    val sum = numbers.reduce { sum, element -> sum + element }
    println(sum)
}