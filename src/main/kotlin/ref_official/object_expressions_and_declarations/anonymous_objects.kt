package ref_official.object_expressions_and_declarations

/**
 * @author : Lex Yu
 */

fun main() {
    val helloWorld = object {
        val hello = "Hello"
        val world = "World"
        // object expressions extend Any, so `override` is required on `toString()`
        override fun toString() = "$hello $world"
    }

    println(helloWorld)
    println(helloWorld.hello.hashCode())
    println(helloWorld.world.hashCode())
    println(helloWorld.hashCode())
}
