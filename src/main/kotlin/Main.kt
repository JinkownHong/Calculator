package org.example

fun main() {
    println("메뉴를 확인 후, 번호를 입력해주세요.")
    println("1.더하기 / 2.빼기 / 3.곱하기 / 4.몫 구하기/ 5.나머지 구하기")

    val selectedMenu = readLine()

    when (selectedMenu) {
        "1" -> addCalculator()
        "2" -> subtractCalculator()
        "3" -> multiplyCalculator()
        "4" -> divideCalculator()
        "5" -> RemainderCalculator()
        "" -> println("값을 입력하지 않았습니다. 다시 실행해주세요.")
        else -> println("잘못된 값을 입력했습니다. 다시 실행해주세요.")
    }
}

fun addCalculator() {
    println("더하기 연산을 실행합니다.")
    println("하나의 숫자를 입력해주세요.")

    val number1 = readln().toDouble()

    println("더할 숫자를 입력해주세요.")
    val number2 = readln().toDouble()

    val answer = number1 + number2
    println("값: $answer")
}

fun subtractCalculator() {
    println("빼기 연산을 실행합니다.")
    println("하나의 숫자를 입력해주세요.")

    val number1 = readln().toDouble()

    println("뺄 숫자를 입력해주세요.")
    val number2 = readln().toDouble()

    val answer = number1 - number2
    println("값: $answer")
}

fun multiplyCalculator() {
    println("곱하기 연산을 실행합니다.")
    println("하나의 숫자를 입력해주세요.")

    val number1 = readln().toDouble()

    println("곱하기 연산할 숫자를 입력해주세요.")
    val number2 = readln().toDouble()

    val answer = number1 * number2
    println("값: $answer")
}

fun divideCalculator() {
    println("몫 구하기 연산을 실행합니다.")
    println("하나의 숫자를 입력해주세요.")

    val number1 = readln().toLong()

    println("몫 구하기 연산할 숫자를 입력해주세요.")
    val number2 = readln().toLong()

    val answer = number1 / number2
    println("값: $answer")
}

fun RemainderCalculator() {
    println("나머지 구하기 연산을 실행합니다.")
    println("하나의 숫자를 입력해주세요.")

    val number1 = readln().toLong()

    println("나머지 구하기 연산할 숫자를 입력해주세요.")
    val number2 = readln().toLong()

    val answer = number1 % number2
    println("값: $answer")
}