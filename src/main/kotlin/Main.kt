fun main(args: Array<String>) {

    var userName: String = "Lex"
    userName = "????"
    // userName = 5 // err
    val age: Int = 1_000
    println("Hello, $userName ! your age is $age.")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}