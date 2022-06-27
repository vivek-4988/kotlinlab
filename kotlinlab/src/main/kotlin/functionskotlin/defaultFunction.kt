package functionskotlin

import inheritance.parent

fun main() {
    defaultParams()
    defaultParams(4, "filled")
    printWithPrefix("Vivek")

    parent().getMyValue();

}

fun defaultParams(value: Int = 1, str: String = "nothing") {
    println("My int value is $value & string is $str")
}

fun printWithPrefix(msg:String,prefix:String = "Mr."){
    println("$prefix $msg")
}