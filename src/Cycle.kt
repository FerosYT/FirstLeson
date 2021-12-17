import java.util.*

fun main(args: Array<String>){
    val scan = Scanner(System.`in`)
    val year = scan.nextInt()

    //Задание 5
    if(year<1970){
        println("До")
    }
    else if(year == 1970){
        println("соответсвует")
    }
    else if(year > 1970 && year < 2000){
        println("после (XX век)")
    }
    else if(year > 2000 && year < 3000){
        println("после (XXI век)")
    }
    else{
        println("далекое будущее")
    }
    println("-=-=-=-=-=-=-=-")

    var result:Int =  calculateEvenDigits("1234")
    println(result)
}


fun calculateEvenDigits(wage: String): Int {
    var sum: Int = 0
    for (item in wage){
        if (Character.isDigit(item)){
            var x: Int = item.digitToInt()
            if (x % 2 == 0){
                sum += x
            }
        }
    }
    return sum
}