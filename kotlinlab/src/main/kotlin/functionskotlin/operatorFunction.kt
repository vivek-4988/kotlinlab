package functionskotlin

import inheritance.parent

fun main() {
    println(2 * "bye ")

    operator fun String.get(range: IntRange) = substring(range)  // 3
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])                                          // 4
}


operator fun Int.times(str: String) = str.repeat(this)