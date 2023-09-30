package _09_loops

/**
 * @author : Lex Yu
 */
fun main(args: Array<String>) {
    var number = 1
    var lastNumber = 20
    var evenNumberCounter = 0

    while (number <= lastNumber) {
        number++

//        if (!isEvenNumber(number)) {
//            continue
//        }

        if (number % 2 != 0) {
            continue
        }

        evenNumberCounter++
        println("Found $number")
    }
    println("Total Even Nums Found $evenNumberCounter")

    evenNumberCounter = 0
    for (i in 1..20) {
        if (i % 2 != 0) {
            continue
        }
        evenNumberCounter++
        println(i)
    }
    println("Total Even Nums Found $evenNumberCounter")
}

/*
fun isEvenNumber(number: Int): Boolean {
    if (number % 2 == 0) {
        return true
    }
    return false
}
 */
fun isEvenNumber(number: Int) = number % 2 == 0