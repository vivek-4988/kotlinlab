import java.io.File

fun main(args: Array<String>) {
    val name:String? = null;
    println(name) // this will not through exception
   // print(name!!) // this will through exception
    println("----- checking empty -------")
    // size is printed if files is not null
    val files = File("Test").listFiles()
//    //println(files?.size)
//
    println(files?.size ?: "empty")


    println("-- checking email --")
    val emails = listOf<String>() // might be empty
    val mainEmail = emails.firstOrNull() ?: "gettingNull"
    println(mainEmail)

    println("-- check null and execute --")
    val values = "v"
    values?.let{
        "vivek"
    }
    println(values)

}