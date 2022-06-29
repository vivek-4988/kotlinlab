package conditional

fun main(){
    print(maxOfSimple(4,5))

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")
    val oddWriters = setOf("Shakespeare", "Hemingway", "Twain")

    println(authors == writers)
    println(authors === writers)//only true if its in order
    println(authors == oddWriters)
}

//todo if conditions
fun maxOfSimple(a: Int, b: Int) = if (a > b) a else b

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}