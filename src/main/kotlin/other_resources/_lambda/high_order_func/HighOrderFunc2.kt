package other_resources._lambda.high_order_func

/**
 * @author : Lex Yu
 */
fun highOrderFun(name: String, func: (String) -> Unit) {
    func(name)
}

fun hello(name: String) {
    println("Hello $name")
}

fun main() {
    highOrderFun("World", ::hello)

    highOrderFun("Errr") { name -> println("Hello $name") }
}