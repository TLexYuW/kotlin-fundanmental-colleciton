package ref_official.visibility_modifiers


/**
 * @author : Lex Yu
 */
fun main() {
    val e = Example()
//    e.exampleFoo() // Cannot access 'exampleFoo': it is private in 'Example'
    e.exampleFoo2()
    e.baz
}