package org.example

fun main() {
    println("메뉴를 확인 후, 번호를 입력해주세요.")
    println("1.더하기 / 2.빼기 / 3.곱하기 / 4.몫 구하기/ 5.나머지 구하기")

    val selectedMenu = readLine()

    val addOperation = AddCalculator()
    val subtractOperation = SubtractCalculator()
    val multiplyOperation = MultiplyCalculator()
    val divideOperation = DivideCalculator()
    val remainderOperation = RemainderCalculator()


    when (selectedMenu) {
        "1" -> addOperation.addCalculator()
        "2" -> subtractOperation.subtractCalculator()
        "3" -> multiplyOperation.multiplyCalculator()
        "4" -> divideOperation.divideCalculator()
        "5" -> remainderOperation.remainderCalculator()
        "" -> println("값을 입력하지 않았습니다. 다시 실행해주세요.")
        else -> println("잘못된 값을 입력했습니다. 다시 실행해주세요.")
    }
}