/**
 * @author : Lex Yu
 * @date : 25/05/2023
 */
fun main() {
    val str: String? = null
    println("str = $str")

    var text: String? = "Something"
    text = null
    if (text != null) {
        println("str = ${text.length}")
    } else {
        println("The variable is null")
    }

    var str2: String? = "Test"
    str2 = null
    println(str2?.length)

    var str3: String? = null
    str3 = "String 3"
    println(str3!!.length)

    val str4 = str3 ?: "Some Word" // 如果左邊不是空值的話直接回傳左邊的內容，否則回傳右邊的內容
    println("str4 = $str4")
}