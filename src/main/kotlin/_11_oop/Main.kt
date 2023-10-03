package _11_oop

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

    val car2 = Car2("Test",  "None", "White", 4);
    println(car2.toString())

    val user = User("Blex","Test",111)
    println(user.toString())
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

    override fun toString(): String {
        return "User(lastName='$lastName', age=$age, name='$name')"
    }

}