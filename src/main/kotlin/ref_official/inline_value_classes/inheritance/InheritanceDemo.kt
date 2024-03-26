package ref_official.inline_value_classes.inheritance

/**
 * @author : Lex Yu
 */
interface Printable {
    fun prettyPrint(): String
}

@JvmInline
value class Name(val name: String) : Printable {
    override fun prettyPrint(): String = "Let's $name!"
}

fun main() {
    val name = Name("Kotlin")
    println(name.prettyPrint()) // Still called as a static method
}