val PI = 3.14
var x = 1;

fun main(args: Array<String>) {
//    println(sum(4, 3))
//    printSum(3,4);


    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment
    println("$a : $b : $c")

    //x incremented
    println(x)
    increment()
    println(x)

}

fun increment() = x++

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