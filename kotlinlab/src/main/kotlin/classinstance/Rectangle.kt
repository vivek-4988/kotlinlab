package classinstance

//Properties of a class can be listed in its declaration or body.
class Rectangle(var height:Double,var length:Double) {
     var param = (height + length) * 2;
     val greetings : String

     //todo Initializer is the common parts to initialize the instance but not depended on arguments passing.
     init {
          param += 5;
          greetings  = "welcome"
     }
}