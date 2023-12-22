package other_resources._10_arrays

import java.nio.IntBuffer

/**
 * @author : Lex Yu
 */

fun main() {
    val max = findMax(arrayOf(100, 99, 8, 5, 6, 7, 1))
    val min = findMin(arrayOf(1, 2, 3, 4, 5, 6, 7))
    println("Max value = $max")
    println("Min value = $min")

    println("---------------------------------------------------------")

    val result1 = findMinAndMax(arrayOf(100, 99, 8, 5, 6, 7, 1), true)
    println("value = $result1")
    val result2 = findMinAndMax(arrayOf(100, 99, 8, 5, 6, 7, 1), false)
    println("value = $result2")

}

fun findMax(numbers: Array<Int>): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}

fun findMin(numbers: Array<Int>): Int {
    var min = numbers[0]
    for (number in numbers) {
        if (number < min) {
            min = number
        }
    }
    return min
}

fun findMinAndMax(numbers: Array<Int>, searchMax: Boolean): Int {
    var max = numbers[0]
    var min = max
    if (searchMax) {
        for (number in numbers) {
            if (number > max) {
                max = number
            }
        }
        return max
    } else {
        for (number in numbers) {
            if (number < min) {
                min = number
            }
        }
        return min
    }
}