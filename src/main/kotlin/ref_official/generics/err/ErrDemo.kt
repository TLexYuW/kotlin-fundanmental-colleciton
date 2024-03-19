package ref_official.generics.err

/**
 * @author : Lex Yu
 */

fun copy(from: Array<Any>, to: Array<Any>) {
    assert(from.size == to.size)
    for (i in from.indices) {
        to[i] = from[i]
    }
}

fun main() {
    val intArray: Array<Int> = arrayOf(1, 2, 3)
    val anyArray = Array<Any>(3) { "" }
    /*
    Type mismatch.
        Required:
        Array<Any>
        Found:
        Array<Int>
     */
//    copy(from = intArray, to = anyArray)

}