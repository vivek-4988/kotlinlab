package functionskotlin

import inheritance.parent

fun main() {

    printAll("a","b","c","d")


    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好"
    )
}

fun printAll(vararg msg: String) {
    for (m in msg) {
        println(m)
    }
}

fun printAllWithPrefix(vararg messages: String, prefix: String="Greetings : ") {  // 3
    for (m in messages) println(prefix + m)
}