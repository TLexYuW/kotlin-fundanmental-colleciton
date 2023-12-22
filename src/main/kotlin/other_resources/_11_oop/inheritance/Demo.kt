package other_resources._11_oop.inheritance

fun main() {
    val car = Car("BMW", "RED", 1, 4)
    val plane = Plane("Boeing", "White", 4, 4)

    car.move()
    car.stop()

    plane.move()
    plane.stop()

    println("=============================================================================================>")

    val view = View()
    val button = Button("Login", "Center")
    val roundButton = RoundButton("Sing Up", "Center", 30)

    view.draw()
    println("=============================================================================================>")
    button.draw()
    println("=============================================================================================>")
    roundButton.draw()
}

open class Vehicle(val name: String, val color: String) {
    open fun move() {
        println("$name is moving")
    }

    open fun stop() {
        println("$name has stopped")
    }
}

class Car(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color) {

}

class Plane(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color) {
    override fun move() {
        flying()
        super.move()
    }

    override fun stop() {
        super.stop()
    }

    private fun flying() {
        println("The play is flying")
    }
}

open class View() {

    open fun draw() {
        println("Drawing a view.")
    }
}

open class Button(val text: String, val orientation: String) : View() {

    override fun draw() {
        println("Drawing the button")
        super.draw()
    }
}

class RoundButton(text: String, orientation: String, val corners: Int) : Button(text, orientation) {
    override fun draw() {
        println("Drawing the round button.")
        super.draw()
    }
}

