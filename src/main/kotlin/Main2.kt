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

}