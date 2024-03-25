package ref_official.enumerations

/**
 * @author : Lex Yu
 */

enum class RGB { RED, GREEN, BLUE }

/**
 * After 1.9.20
 */
inline fun <reified T : Enum<T>> printAllValues() {
    println(enumValues<T>().joinToString { it.name })
}
fun main() {
    printAllValues<RGB>()
}
