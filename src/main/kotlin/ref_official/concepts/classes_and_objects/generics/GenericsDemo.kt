package ref_official.concepts.classes_and_objects.generics

/**
 * @author : Lex Yu
 */
class Box<T>(t: T) {
    var value = t
}

fun main() {
    val box: Box<Int> = Box(1)
    val box2: Box<String> = Box("1")

    println(box.value.javaClass)
    println(box2.value.javaClass)
}