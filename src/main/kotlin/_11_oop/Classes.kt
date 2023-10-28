package _11_oop

/**
 * @author : Lex Yu
 */
class Car2(name: String, var model: String, var color: String, var doors: Int) {

    var name = name.trim()

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

class Staff(var firstname: String, var lastname: String, var age: Int) {
    lateinit var movie: String
    override fun toString(): String {
        return "Staff(firstname='$firstname', lastname='$lastname', age=$age, movie='$movie')"
    }
}
