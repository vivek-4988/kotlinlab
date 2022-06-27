package conditional

fun main(){
    print(maxOfSimple(4,5))
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