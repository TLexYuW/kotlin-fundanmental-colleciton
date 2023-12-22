package other_resources._11_oop

import other_resources._11_oop.lateinit_keyword.Car2
import other_resources._11_oop.lateinit_keyword.Staff

/**
 * @author : Lex Yu
 */
fun main(args: Array<String>) {
    val car1 = Car();
    car1.name = "Tesla"
    car1.model = "S Plaid"
    car1.color = "Red"
    car1.doors = 4

    println(car1.toString())
    car1.move()
    car1.stop()

    val car2 = Car2("Test", "None", "White", 4);
    println(car2.toString())

    val u1 = User("Alex", "TestLastName", 1000)
    println(u1.toString())

    val user = User("BBBBB", "Test", 111)
    println(user.toString())


    val u2t = User2("Alex", "TestLastName", 1000)
    println(u2t.toString())

    val u2 = User2("LL")
    println(u2.toString())

    val u3 = User2("NNN", "LLL")
    println(u3.toString())

    val u4 = User2()
    println(u4.toString())

    val u3t = User3("Alex", "TestLastName", 1000)
    println(u3t.firstname)
    println(u3t.toString())

    val staff1 = Staff("first", "last", 12222)
//    println(staff1.movie) // err
    staff1.movie = "Movie??"
    println(staff1)

}

class Car {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name has stopped")
    }

    override fun toString(): String {
        return "Car(name='$name', model='$model', color='$color', doors=$doors)"
    }
}

class User(name: String, var lastName: String, var age: Int) {
    var name: String

    init {
        if (name.lowercase().startsWith("a")) {
            this.name = name
        } else {
            this.name = "Default User Name"
            println("The name doesn't start with the letter 'a' or 'A'")
        }
    }

    init {

    }

    override fun toString(): String {
        return "User(lastName='$lastName', age=$age, name='$name')"
    }

}

class User2(var name: String, var lastName: String, var age: Int) {

    constructor(name: String) : this(name, "2ndLastName", 2) {
        println("2nd")
    }

    constructor(name: String, lastName: String) : this(name = "3rdName", lastName = "3rdLastName", age = 3) {
        println("3rd")
    }

    constructor() : this(name = "", lastName = "", age = 0) {
        println("4rd")
    }

    override fun toString(): String {
        return "User2(name='$name', lastName='$lastName', age=$age)"
    }

}

class User3(firstname: String, var lastName: String, var age: Int) {
    var firstname = firstname
        get() {
            return "First: $field"
        }
        set(value) {
            println("$value was assigned to firstname property")
            field = value
        }

    override fun toString(): String {
        return "User3(lastName='$lastName', age=$age)"
    }

}