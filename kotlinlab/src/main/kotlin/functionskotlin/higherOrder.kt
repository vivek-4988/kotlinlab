package functionskotlin

fun main() {
    val sumResult1 = calc(4, 5, ::sum)
    println(sumResult1)
    val multiResult = calc(4, 5) { x, y -> x * y }
    println(multiResult)

    val sqr = operation()
    println(sqr(4))
}


fun sum(x: Int, y: Int) = x + y


fun calc(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}



fun operation(): (Int) -> Int {                                     // 1
    return ::square
}

fun square(x: Int) = x * x