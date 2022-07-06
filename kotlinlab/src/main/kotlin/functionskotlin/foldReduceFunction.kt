package functionskotlin

import java.awt.geom.Area

fun main() {
    val calc = listOf(1, 2,3)
//    var sum = calc.fold(0) { i, sum -> i + sum }
//    println(sum)

    var sum = calc.reduce{ i, sum -> i + sum }
    println(sum)


}