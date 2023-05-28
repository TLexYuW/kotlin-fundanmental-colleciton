import java.util.Scanner

/**
 * @author : Lex Yu
 * @date : 25/05/2023
 */
fun main() {
    val isActive = true
    if (isActive) {
        println("Is Active")
    } else {
        println("Is Not Active")
    }

    val scan = Scanner(System.`in`).nextLine().trim()
    val myNum = scan.toInt()
    val result =
        if (myNum == 1000) "Less than or equal 1000" else if (myNum > 1000) "Greater than 1000" else "All Failed"
    println("bool = $result")
}