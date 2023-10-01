package _11_oop

/**
 * @author : Lex Yu
 */
class Car2(name: String = "", model: String = "", color: String = "", door: Int = 0) {

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