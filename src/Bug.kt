open class Bug(val rank: Int, val name:String) {
    open fun getSugarLimit(): Int {
        return rank
    }

    fun getId(): String{
        return "${rank}.${name}"
    }
}
