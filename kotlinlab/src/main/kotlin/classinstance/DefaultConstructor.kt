import classinstance.Rectangle
import classinstance.mysealedclass
import classinstance.sealedParent
import classinstance.sealedParent2

fun main(args: Array<String>) {
    val rectangle = Rectangle(5.0,8.0)
    println("${rectangle.param}")
    println("${rectangle.greetings}")
    println(greetMammal(sealedParent(5)))
}

fun greetMammal(mammal: mysealedclass): String {
    when (mammal) {                                                                     // 3
        is sealedParent -> return "Hello ${mammal.name} You're working as a ${mammal.age}"    // 4
        is sealedParent2 ->return "Hello ${mammal.name} You're working as a ${mammal.age}"
        else -> {
            return "else"
        }
    }
}