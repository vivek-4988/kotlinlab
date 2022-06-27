package conditional

fun main(){
    val items = listOf("apple","banana","orange")
    for (item in items){
        println(item)
    }
    //or
    for (i in items.indices){
        println("item @ $i is ${items[i]}")
    }
    //
}