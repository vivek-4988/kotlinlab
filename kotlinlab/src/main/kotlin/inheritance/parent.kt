package inheritance

class parent : child() {

    override fun getMyValue(i: Int) {
        super.getMyValue(i)
        println("from parent $i")
    }

}