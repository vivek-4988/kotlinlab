package inheritance

// to inherit class should be open
open class child {
    //default i is 10 set
    open fun getMyValue(i:Int = 10){
        println("from child $i")
    }
}