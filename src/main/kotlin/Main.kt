const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"

@Deprecated(SUBSYSTEM_DEPRECATED)
fun foo() {
    println("This function is deprecated.")
}

fun main(args: Array<String>) {

    println("Hello, World")

    if (args.isNotEmpty()){
        for (a in args){
            println(a)
        }
        args.forEachIndexed { index, a ->
            println("Index $index: $a")
        }
    }else{
        println("No Argument Provided")
    }

    foo()
}