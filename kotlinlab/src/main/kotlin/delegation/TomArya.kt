package delegation


//The classes TomAraya and ElvisPresley also implement the interface, but not the method.
// Instead, they delegate the method calls to the responsible implementation.
// todo The delegate object is defined after the by keyword.
class TomArya(n:String):SoundBehaviour by ScreamBehaviour(n)

class ElvisPresley(n:String): SoundBehaviour by RockAndRollBehvaiour(n)

