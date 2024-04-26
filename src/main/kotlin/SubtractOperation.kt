package org.example

import Calculator

class SubtractOperation {
    fun subtractCalculator() {
        println("빼기 연산을 실행합니다.")
        println("하나의 숫자를 입력해주세요.")

        val number1 = readln().toLong()

        println("뺄 숫자를 입력해주세요.")
        val number2 = readln().toLong()

        val calculator = Calculator()
        println("값: ${calculator.subtractOperate(number1, number2)}")
    }
}