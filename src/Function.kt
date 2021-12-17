fun main(args: Array<String>) {
    //Задание 1
    println("Здравствуй, о храбрый житель Королевства Жуков!")
    println("-=-=-=-=-=-=-=-")

    //Задание 2
    var name = readLine()
    println(" могучий правитель Королевства Жуков, землянин по имени " + name + " приветствует тебя!")
    println("-=-=-=-=-=-=-=-")

    //Задание 3
    var varible: Int = 0;
    var x: Int = 0;
    while (varible < 6) {
        x = readLine()!!.toInt();
        calcChair(x)
        varible++
    }
    println("-=-=-=-=-=-=-=-")
  //Задание 4
    println(cashAmount(10,2,25))
}

fun calcChair(x: Int) {
    var z: Int = x / 2
    var y: Int = x + z

    println("" + y + ", ")
}

fun cashAmount(dayNumber: Int, bugRank: Int, money: Int): Int? {

    return (dayNumber * (bugRank + 42)) * money;
}