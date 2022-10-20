// Создание пустой коллекции (collect), наполнение до заданного размера (number - ввод c консоли),
// вывод содержимого в консоль c помощью функции mySuperPrint().


fun main() {

    val collect = mutableListOf<Int>()  // создание пустой коллекции
    println("Введите колличество элементов")
    var number = readLine()!!.toInt()  // колличество элементов

    var k = 1
    for(i in 1..number){   // заполнение списка числами от 0 до 10
        collect.add(k)
        if(k == 10) k = 1
        else k++
    }

    mySuperPrint(collect, number)  // вывод на печать с помощью функции

}

fun mySuperPrint (list: MutableList<Int>, num: Int){  // функция вывода на печать списка MutableList<Int>
                                                      // с колличеством элементов num
    println("содержимое коллекции:\n")

    if (num == 0) println("Список не содержит элементов\n")
    else {

        println(" номер         значение\n")

        for(i in 1..num) {
            if(i < 10 ) println("   ${i}              ${list[i-1]}")
            else println("   ${i}             ${list[i-1]}")
        }
    }
}