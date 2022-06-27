package collections

import java.util.*

fun main(){
    val items = listOf("kiwi","apple","banana","orange","avocado")

    when{
        "kiwi" in items -> println("yes")
        else -> println("no")
    }

    items
        .filter { it.startsWith('a') }
        //.sortedBy { it }
        .map { it.uppercase(Locale.getDefault()) }
        .forEach {
        println(it)
    }

//    for (item in items){
//        print("$item ,")
//    }

}