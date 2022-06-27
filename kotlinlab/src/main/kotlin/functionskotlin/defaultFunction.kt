package functionskotlin

fun main() {
    defaultParams()
    defaultParams(4, "filled")
}

fun defaultParams(value: Int = 1, str: String = "nothing") {
    println("My int value is $value & string is $str")
}