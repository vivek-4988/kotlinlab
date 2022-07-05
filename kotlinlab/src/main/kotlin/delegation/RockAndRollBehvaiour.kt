package delegation

class RockAndRollBehvaiour(val n:String):SoundBehaviour {
    override fun makeSound() {
        println("Rpck and roll $n")
    }
}