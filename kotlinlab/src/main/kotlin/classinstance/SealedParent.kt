package classinstance

import classinstance.mysealedclass

//mysealedclass will only work on this package
class sealedParent(val age:Int) : mysealedclass("vivek") {
}

class sealedParent2(val age:Int) : mysealedclass("naira") {
}