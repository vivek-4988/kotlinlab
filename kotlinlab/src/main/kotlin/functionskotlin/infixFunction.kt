package functionskotlin

fun main() {
    println(1.doPlus(2))
}

//infix allows only one parameter
infix fun Int.doPlus(a: Int) = a*a
