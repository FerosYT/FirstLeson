fun main(args: Array<String>){
    fun calcNullValues(input: Array<Int?>): Array<Int> {
        var nulls: Int = 0;
        var sum: Int = 0;
        for (item in input) {
            if (item == null) {
                nulls++
            } else {
                sum += item
            }
        }
        return arrayOf (nulls, sum)
    }
    var result:Array<Int> =  calcNullValues(arrayOf(82, 4, null, null, 65, null, 7, null))
    for (item in result){
        println(item)
    }
}