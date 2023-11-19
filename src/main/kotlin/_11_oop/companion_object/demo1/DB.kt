package _11_oop.companion_object.demo1

fun main() {
    println(DB)
    println(DB)
}

object DB {
    init {
        println("Database Created")
    }
}