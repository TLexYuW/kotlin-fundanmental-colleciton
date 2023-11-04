package _11_oop.inheritance

import _11_oop.Car

fun main() {
    val car = Car("BMW", "RED", 1, 4)
    val plane = Plane("Boeing", "White", 4, 4)

    car.move()
    car.stop()

    plane.move()
    plane.stop()
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
    }

    override fun stop() {
        super.stop()
    }

    private fun flying() {
        println("The play is flying")
    }
}

class View() {
    fun draw(){
        println("Drawing a view.")
    }
}