package ref_official.visibility_modifiers

/**
 * @author : Lex Yu
 */
private fun privateTopLevelFunction() {
    println("This is a private top-level function")
}
class Example {
    private var privateProperty: String = "Private Property"

    fun getPrivateProperty(): String {
        return privateProperty
    }

    fun setPrivateProperty(value: String) {
        privateProperty = value
    }

    private fun exampleFoo() {
        println("private exampleFoo()")
    } // visible inside example.kt
    public fun exampleFoo2() {
        println("public exampleFoo2()")
    } // visible inside example.kt

    public var bar: Int = 5 // property is visible everywhere
        private set         // setter is visible only in example.kt

    internal val baz = 6    // visible inside the same module
}

