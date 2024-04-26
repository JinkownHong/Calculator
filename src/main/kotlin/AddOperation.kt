package org.example

import Calculator

class AddOperation {
    fun addCalculator() {
        getAddNumber()
    }
}

fun getAddNumber() {
    println("더하기 연산을 실행합니다.")
    println("하나의 숫자를 입력해주세요.")

    var isValidInput = false
    var number1: Long = 0
    var number2: Long = 0

    while (!isValidInput) {
        try {
            number1 = readln().toLong()
            isValidInput = true
        } catch (e: Exception) {
            println("숫자만 입력할 수 있습니다.")
        }
    }

    var isValidInput2 = false

    println("더하기 연산할 숫자를 입력해주세요.")
    while (!isValidInput2) {
        try {
            number2 = readln().toLong()
            isValidInput2 = true
        } catch (e: Exception) {
            println("숫자만 입력할 수 있습니다.")
        }
    }

    val calculator = Calculator()
    println("값: ${calculator.addOperate(number1, number2)}")
}