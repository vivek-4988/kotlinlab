package conditional

fun main(){
    println(describe(131232))
    println(whenAssign(1))
}

fun describe(obj:Any): String =
    when(obj){
        1 -> "One"
        "Hello" -> "Hello"
        is Long -> "long"
        !is String -> "Not a string"
        else -> "Else"
    }

fun whenAssign(obj: Any): Any {
    val result = when (obj) {                   // 1
        1 -> "one"                              // 2
        "Hello" -> 1                            // 3
        is Long -> false                        // 4
        else -> 42                              // 5
    }
    return result
}