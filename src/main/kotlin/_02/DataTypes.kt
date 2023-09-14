package _02

fun main() {
    // Integer, Short, Long, Float, Double
    var number: Int = 22

    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue: Int = Int.MIN_VALUE
    println("Int max value = $maxIntegerValue")
    println("Int min value = $minIntegerValue")

    number = 2147483647 + 1
    println("overflow ... $number")

    val maxByteValue: Byte = Byte.MAX_VALUE
    val minByteValue: Byte = Byte.MIN_VALUE
    println("Byte max value = $maxByteValue")
    println("Byte min value = $minByteValue")

    val maxShortValue: Short = Short.MAX_VALUE
    val minShortValue: Short = Short.MIN_VALUE
    println("Short max value = $maxShortValue")
    println("Short min value = $minShortValue")

    val maxLongValue: Long = Long.MAX_VALUE
    val minLongValue: Long = Long.MIN_VALUE
    println("Long max value = $maxLongValue")
    println("Long min value = $minLongValue")

    val maxFloatValue: Float = Float.MAX_VALUE
    val minFloatValue: Float = Float.MIN_VALUE
    println("Float max value = $maxFloatValue")
    println("Float min value = $minFloatValue")

    val myFNum = 1.5f
    println("Class = ${myFNum.javaClass}")
    val myFNum2 = 3.5
    println("Class = ${myFNum2.javaClass}")

    val maxDoubleValue: Double = Double.MAX_VALUE
    val minDoubleValue: Double = Double.MIN_VALUE
    println("Double max value = $maxDoubleValue")
    println("Double min value = $minDoubleValue")

    val myCharValue: Char = 'a'
    val myBooleanValue: Boolean = true
    println("Char value = $myCharValue")
    println("Boolean value = $myBooleanValue")
}
