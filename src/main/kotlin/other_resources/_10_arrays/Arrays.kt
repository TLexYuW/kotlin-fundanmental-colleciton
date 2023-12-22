package other_resources._10_arrays

/**
 * @author : Lex Yu
 */

fun main() {
    val names = arrayOf("J", "S", "M")
    val numbers = arrayOf(1, 2, 3, 4, 5, "J", "S", "M", "Name 1", 'a')
    println(names[0])
    println("------------------------------------------------------")
    for(i in numbers){
        println(i)
        if (i is String){
            println(i)
        }
    }
}