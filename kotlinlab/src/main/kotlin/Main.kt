import classinstance.appRunEnum
import functionskotlin.MultiObjectFunction

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

    val myMultiObj = MultiObjectFunction()
    with(myMultiObj){
        penUp()
        print(turn(90.0))
        println(forward(9.8))
        penDown()
    }

    checkEnumClass()

}

fun checkEnumClass(){
    var checkstate = appRunEnum.IDLE
    val message = when (checkstate) {                  // 3
        appRunEnum.IDLE -> "It's idle"
        appRunEnum.RUNNING -> "It's running"
        appRunEnum.FINISHED -> "It's finished"
    }
    println(message)
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