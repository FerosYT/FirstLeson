open class BugCivilian: Bug(rank = 2 ,name = "Dan") {
    override fun getSugarLimit(): Int {
        return super.getSugarLimit()/2
    }
}