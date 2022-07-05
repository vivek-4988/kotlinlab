package functionskotlin.scopeFunctions

fun customPrint(s: String) {
    print(s.uppercase())
}
class Configuration(var host: String, var port: Int)
data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}
fun main(){
    // ======== let ========
   /* var empty = "test".let {               // 1
        customPrint(it)                    // 2
        it.isEmpty()                       // 3
    }
    println(" is empty: $empty")

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First","Second")*/

    //======== run ======
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")

    //with will work as object
    val configuration = Configuration(host = "127.0.0.1", port = 9000)
    with(configuration) {
        println("$host:$port")
    }
//    // instead of:
//    println("${configuration.host}:${configuration.port}")

    //apply will work as object
    val myApplyObject = Person()                                     // 1
    val stringDescription = myApplyObject.apply {                    // 2
        name = "Vivek"                                       // 3
        age = 32
        about = "Android developer"
    }.toString()                                            // 4
    println(stringDescription)
    println(myApplyObject.about)

    //also will work
    val myAlsoObject = Person("Naira", 4, "Student")   // 1
        .also {                                          // 2
            writeCreationLog(it)                         // 3
        }

}

fun writeCreationLog(p: Person) {
    println("A new person ${p.name} was created.")
}


fun getNullableLength(ns: String?) {
    println("for \"$ns\":")
    ns?.run {                                                  // 1
        println("\tis empty? " + isEmpty())                    // 2
        println("\tlength = $length")
        length                                                 // 3
    }
}

fun printNonNull(str: String?) {
    println("Printing \"$str\":")

    str?.let {                         // 4
        print("\t")
        customPrint(it)
        println()
    }
}

fun printIfBothNonNull(strOne: String?, strTwo: String?) {
    strOne?.let {
            firstString -> strTwo?.let {
                secondString ->
                    customPrint("$firstString : $secondString")
            println()
        }
    }
}

