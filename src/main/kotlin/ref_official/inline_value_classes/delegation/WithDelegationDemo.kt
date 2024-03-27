package ref_official.inline_value_classes.delegation

/**
 * @author : Lex Yu
 */
interface MyInterface {
    fun bar() = "bar"
    fun foo() = "foo"
}

@JvmInline
value class MyInterfaceWrapper(val myInterface: MyInterface) : MyInterface by myInterface

fun main() {
    val my = MyInterfaceWrapper(object : MyInterface {
        override fun bar(): String {
            return "bar2"
        }
    })
    println(my.foo()) // prints "foo"
    println(my.bar())

}