package conditional

//in
//this will work like 1 to 10

fun main(){
    val x=15
    val y=10
    println(1..y)
    for (i in 1..x){
        //here 1..y is 1 to 10
        print("$i ")
    }
    println()
    val list = listOf("a","b","C")
    if(-1 !in 0..list.lastIndex){
        println("-1 not available")
    }

    if (list.size !in list.indices){
        println("too large")
    }


    for (x in 1..10 step 2) {
        print("$x ")
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print("$x ")
    }

    for (i in  0 until 3){
        print("$i ")
    }
    println("========")

    for (c in 'a'..'d') {        // 1
        print(c)
    }
    println(" ==========")

    for (c in 'z' downTo 's' step 2) { // 2
        print(c)
    }
    println(" =============")


}
