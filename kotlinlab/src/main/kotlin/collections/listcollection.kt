package collections

import java.util.*


val systemUser:MutableList<Int> = mutableListOf(1,2,3)
val sudoers : List<Int> = systemUser

fun main(){
    addSystemUser(4)
    println("todo ${getSysUser().size}")

    getSysUser().forEach {
        i-> print("$i ,")
    }


    println("========= minOrNull and maxOrNull ============")
    val numbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()
    val only = listOf(3)

    println("Numbers: $numbers, min = ${numbers.minOrNull()} max = ${numbers.maxOrNull()}") // 1
    println("Empty: $empty, min = ${empty.minOrNull()}, max = ${empty.maxOrNull()}")        // 2
    println("Only: $only, min = ${only.minOrNull()}, max = ${only.maxOrNull()}")

}

fun addSystemUser(newUser:Int){
    systemUser.add(newUser)
}

fun getSysUser():List<Int>{
    return sudoers
}
