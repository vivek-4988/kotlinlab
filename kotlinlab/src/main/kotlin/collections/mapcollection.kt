package collections

import java.util.*

fun main(){
    val items = listOf("kiwi","apple","banana","orange","avocado")
    val mapItems = mapOf("a" to "here" , "b" to 1, "c" to 3.0f)

    println(mapItems["a"])
    for ((k,v) in mapItems){
//        println("$k -> $v")
                println("$v")
    }

}