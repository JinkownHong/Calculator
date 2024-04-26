package org.example

import Calculator

class DivideOperation {
    fun divideCalculator() {
        getDivideNumber()
    }
}

fun getDivideNumber() {
    println("몫 구하기 연산을 실행합니다.")
    println("하나의 숫자를 입력해주세요.")

    var isValidInput = false
    var number1: Long = 0

    while (!isValidInput) {
        try {
            number1 = readln().toLong()
            isValidInput = true
        } catch (e: Exception) {
            println("숫자만 입력할 수 있습니다.")
        }
    }

    var isValidInput2 = false
    val calculator = Calculator()
    var number2: Long = 0

    println("몫 구하기 연산할 숫자를 입력해주세요.")

    while (!isValidInput2) {
        try {
            number2 = readln().toLong()
            isValidInput2 = true
            println("값: ${calculator.divideOperate(number1, number2)}")
        } catch (e: NumberFormatException) {
            println("숫자만 입력할 수 있습니다.")
        } catch (e: ArithmeticException) {
            println("숫자 0을 입력할 수 없습니다. 다른 숫자를 입력해주세요.")
        }
    }
}