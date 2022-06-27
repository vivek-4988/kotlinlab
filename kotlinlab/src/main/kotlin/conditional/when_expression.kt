package conditional

fun main(){
    println(describe(131232))
}

fun describe(obj:Any): String =
    when(obj){
        1 -> "One"
        "Hello" -> "Hello"
        is Long -> "long"
        !is String -> "Not a string"
        else -> "Else"
    }
