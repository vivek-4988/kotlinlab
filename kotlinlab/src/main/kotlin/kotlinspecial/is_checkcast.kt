package kotlinspecial

fun main(){
    println(getStringObj("this is string obj"))
}


fun getStringObj(obj:Any): Int?{
    if (obj is String){
        return obj.length
    }
    return null
}