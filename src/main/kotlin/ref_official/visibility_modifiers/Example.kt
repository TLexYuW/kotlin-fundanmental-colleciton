package ref_official.visibility_modifiers

/**
 * @author : Lex Yu
 */
class Example {
    private fun exampleFoo() {
        println("private foo()")
    } // visible inside example.kt
    public fun exampleFoo2() {
        println("private foo()")
    } // visible inside example.kt

    public var bar: Int = 5 // property is visible everywhere
        private set         // setter is visible only in example.kt

    internal val baz = 6    // visible inside the same module
}