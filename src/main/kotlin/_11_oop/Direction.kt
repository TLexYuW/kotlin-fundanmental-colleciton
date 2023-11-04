package _11_oop

fun main() {

    println(Direction.NORTH)
    println(Direction.NORTH.direction)
    println(Direction.NORTH.distance)
    println(Direction.SOUTH)
    println(Direction.EAST)
    println(Direction.WEST)

    for (dir in Direction.values()){
        println(dir)
    }

    for (dir in Direction.entries){
        println(dir)
    }

    Direction.WEST.printData()

    val dir = Direction.valueOf("east".uppercase())
    println(dir)

    val east = Direction.EAST
    when(east){
        Direction.NORTH -> println("The Direction is North")
        Direction.SOUTH -> println("The Direction is South")
        Direction.WEST -> println("The Direction is West")
        Direction.EAST -> println("The Direction is East")
    }

}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 30),
    WEST("west", 40);


    fun printData(){
        println("Direction = $direction, Distance = $distance")
    }


}