package other_resources._lambda

import java.lang.StringBuilder

/**
 * @author : Lex Yu
 */

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun String.abbreviate(): String {
    val splitStrings = this.split(" ", " ", ignoreCase = true)
    var abbrevation: StringBuilder? = StringBuilder("")
    for (word in splitStrings) {
        abbrevation?.append(word[0])
    }
    return abbrevation.toString().uppercase()
}

class College(val name: String, var affiliation: String, val city: String) {
    operator fun component1(): Any {
        return name
    }

    operator fun component2(): Any {
        return affiliation
    }

    operator fun component3(): Any {
        return city
    }
}

data class College2(val name: String, var affiliation: String, val city: String)

fun main() {
    val add2: (Int, Int) -> Int = { a: Int, b: Int -> a + b }

    println("Result = ${add(100, 500)}")

    println("Result = ${add2(100, 500)}")

    val square: (Int) -> Int = { num: Int -> num * num }
    val cube: (Int) -> Int = { it * it * it }


    println("Square = ${square(10)}")
    println("Cub = ${cube(100)}")

    // Lambda as Class extension

    val lambdaAbbreviate: String.() -> String = {
        val splitStrings = this.split(" ", " ", ignoreCase = true)
        var abbrevation: StringBuilder? = StringBuilder("")
        for (word in splitStrings) {
            abbrevation?.append(word[0])
        }
        abbrevation.toString().uppercase()
    }

    val fullName = "This is Test Name"
    println(fullName.abbreviate())
    println(fullName.lambdaAbbreviate())

    val lambdaAgeDescription: (Int) -> String = description@{ age: Int ->
        if (age < 13) return@description "Child"
        else if (age in 13..19) return@description "Teenage"
        else if (age in 20..60) return@description "Adult"
        else return@description "Senior Citizen"
    }
    val lambdaAgeDescription2: (Int) -> String = { age: Int ->
        if (age < 13) {
            "Child"
        } else if (age in 13..19) {
            "Teenage"
        } else if (age in 20..60) {
            "Adult"
        }
        "Senior Citizen"
    }

    val n = 70
    println(lambdaAgeDescription(n))
    println(lambdaAgeDescription2(n))

    // Ignoring parameters
    val sampleLambda: (String, String, String, String) -> Unit =
        { fullName, mName, lName, _ ->
            println("$mName, $lName, $fullName")
        }
    sampleLambda("ABC", "DEF", "PQO", "test")

    // Destructuring
    val college = College("IIT", "Autonomous/Deemed", "Madras")
    val (collegeName, universityAffiliation, estCity) = college
    println("$collegeName, $universityAffiliation is in $estCity")
    val college2 = College2("IIT", "Autonomous/Deemed", "Madras")
    val (collegeName2, universityAffiliation2, estCity2) = college2
    println("$collegeName2, $universityAffiliation2 is in $estCity2")

    // Pair
    val nationCapital: Pair<String, String> = Pair("test", "TEST")
    val nationCapital2: Pair<String, String> = Pair("test2", "TEST2")
    val nationCapital3: Pair<String, String> = Pair("test3", "TEST3")
    val printNationCapital: (Pair<String, String>) -> Unit = { pair ->
        println("${pair.first}'s capital is ${pair.second}")
    }
    printNationCapital(nationCapital)

    val listOfNations = listOf<Pair<String, String>>(nationCapital, nationCapital2, nationCapital3)
    listOfNations.forEach(printNationCapital)

}
