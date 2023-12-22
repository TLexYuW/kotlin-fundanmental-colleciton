package other_resources._operator_overloading

/**
 * @author : Lex Yu
 */
data class Point(val x: Int, val y: Int)

fun main() {
    operator fun Point.plus(other: Point) = Point(x + other.x, y + other.y)
    val p1 = Point(0, 1)
    val p2 = Point(1, 2)
    println(p1 + p2)
}