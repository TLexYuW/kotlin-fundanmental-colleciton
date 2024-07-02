package own.collection.aggregation.fold

/**
 * @author : Lex Yu
 */
fun main() {
    val numbers = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sumEven = numbers.foldIndexed(0) { index, sum, element ->
        if (index % 2 == 0) {
            println("index = $index, element = $element")
            sum + element
        } else sum
    }
    println(sumEven) // 0 + 2 + 4 + 6 + 8 + 10

    val sumEvenRight = numbers.foldRightIndexed(0) { index, element, sum ->
        if (index % 2 == 0) {
            println("index = $index, element = $element")
            sum + element
        } else sum
    }
    println(sumEvenRight) // 10 + 8 + 6 + 4 + 2 + 0
}