fun main(args: Array<String>) {
    val name:String? = null;
    print(name) // this will not through exception
    print(name!!) // this will through exception
}