package org.example

class MultiplyCalculator {
    fun multiplyCalculator() {
        println("곱하기 연산을 실행합니다.")
        println("하나의 숫자를 입력해주세요.")

        val number1 = readln().toDouble()

        println("곱하기 연산할 숫자를 입력해주세요.")
        val number2 = readln().toDouble()

        val answer = number1 * number2
        println("값: $answer")
    }
}