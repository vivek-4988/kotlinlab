import javax.swing.GroupLayout.Group

class Demo {

    var age:Int = 5

    val myName: String by lazy {
        println("Welcome to Lazy declaration");
        "www.er.com"
    }

}

class checkingClass(var name:String){

    var second:Int = 0
    constructor(sectionName: String, id: Int) : this(sectionName) {
        this.second = 2
        println("secondary $second $name")
    }
    init {
        println("now init $name")
    }
}

//can not be local
private const val _pi = Math.PI

fun main(args: Array<String>) {

    //immutable
    val name = "Vivek"
    println(_pi)

    //it will not initialize until using it
    //also you can change it later once used

    //and there should be primitive types assign
    lateinit var test: String

    //If they are only meant to be initialized once and shared by all, and it’s more internally set (dependent on variables internal to the class), then use lazy.
    val obj by lazy {
        Demo()
    }
    println(obj.myName);
    println("Second time call to the same object--"+obj.myName);
    obj.age = 7;
    println(obj.myName)

    //checking class flow
    checkingClass("vivek",5)


    //!! will tell you , yes I'll be not null, or I'll be die in middle
    var email: String?
    email = null
    //println(email!!)
    //
}

