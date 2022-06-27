package functionskotlin

import java.awt.geom.Area

fun main() {

    myLocalScope(25,30)
}

fun myLocalScope(a: Int, b: Int) {
    fun calculateArea(width: Int, height: Int): Int = width * height
    val area = calculateArea(a, b)

    fun divideArea(area: Int) : Int = area/2

    val finalValue = divideArea(area)
    println("The area is $finalValue")
}