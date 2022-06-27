package functionskotlin

fun main() {
    println(1.doPlus(2))
    //println(2 times "Bye")

    val pair = "Ferrari" to "Katrina"                          // 3
    println(pair)
    infix fun String.onto(other: String) = Pair(this, other)   // 4
    val myPair = "McLaren" onto "Lucas"
    println(myPair)
}

//infix allows only one parameter
infix fun Int.doPlus(a: Int) = a*a


//infix fun Int.times(str: String) = str.repeat(this)        // 1
