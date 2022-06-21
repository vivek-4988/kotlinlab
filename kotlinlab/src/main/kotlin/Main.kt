fun main(args: Array<String>) {
    println(sum(4, 3))
    printSum(3,4);
}

//A function body can be an expression. Its return type is inferred./auto judjed
//fun sum(a: Int, b: Int): Int {
//    return a + b
//}
fun sum(a: Int, b: Int) = a + b

//Unit can be omitted
fun printSum(a: Int, b: Int) : Unit {
    println("sum of $a and $b is ${a+b}")
    println("sum of $a and $b is ${a + b}")
}