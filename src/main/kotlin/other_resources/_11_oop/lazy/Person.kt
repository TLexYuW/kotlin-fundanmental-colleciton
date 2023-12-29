package other_resources._11_oop.lazy

fun main(args: Array<String>) {
    val p1 = Person("Alex", "EEEErrrrr", 2222)
    val p2 = Person("QQQQ", "lllll", 1111)
    val p3 by lazy {
        Person("Person3", "LastName", 1000)
    }

//    println(p3.firstName)
}

class Person(var firstName: String, var lastName: String, var age: Int) {
    init {
        println("User: $firstName was created")
    }

}