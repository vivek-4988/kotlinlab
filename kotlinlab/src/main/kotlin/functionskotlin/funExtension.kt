package functionskotlin

import kotlinspecial.forSingleTone

fun main(){
    val myString = "Hello Earth"
    val getSingleTpne = forSingleTone.name
    println(myString.makeCamel())
    println(myString.removeFirstLastChar())

    println(getSingleTpne)
}

fun String.makeCamel(): String = uppercase()


fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)