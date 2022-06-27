package functionskotlin

class MultiObjectFunction {
    fun penDown(){
        println("pen down")
    }
    fun penUp(){
        println("pen up")
    }
    fun turn(degrees: Double): Double {
        return degrees
    }
    fun forward(pixels: Double): Double {
        return pixels
    }
}