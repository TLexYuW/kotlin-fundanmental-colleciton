package _08

/**
 * @author : Lex Yu
 * @date : 25/05/2023
 */
fun main(args: Array<String>) {
    sayHi()
    println("number= " + sayHello("L", 10000));

    val hasConn = true
    if (hasConn) {
        getData("Some Data")
    } else {
        showMessage()
    }

    println("max = " + getMax(10, 99999))
    println("min = " + getMin(10, 99999))

    sendMsg("K")
    sendMsg(message = "This is msg")

    println(sum(5, 10, 15, 20))
}

fun getData(data: String) {
    println("Data = $data")
}

fun showMessage() {
    println("No Conn")
}

fun sayHi() {
    println("Hi")
}

fun sayHello(name: String, age: Int): Int {
    val number = age
    println("Hello, $name. Your age is $age")
    return number
}

fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    return max
}

fun getMin(a: Int, b: Int) = if (a < b) a else b

fun sendMsg(name: String = "User", message: String = sendText()) {
    println("Name = $name and Message = $message")
}

fun sendText(): String = "Some Text!"

/*
fun sum(a: Int, b: Int, c: Int, d: Int): Int {
    return a + b + c + d
}
 */

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}

