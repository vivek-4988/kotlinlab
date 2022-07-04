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
}

fun addSystemUser(newUser:Int){
    systemUser.add(newUser)
}

fun getSysUser():List<Int>{
    return sudoers
}
