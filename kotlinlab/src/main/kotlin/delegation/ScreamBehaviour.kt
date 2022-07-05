package delegation

import java.util.*

class ScreamBehaviour(val n:String):SoundBehaviour {
    override fun makeSound() = println("${n.uppercase(Locale.getDefault())} !!!")
}