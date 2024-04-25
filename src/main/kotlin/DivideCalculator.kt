package org.example

class DivideCalculator {
    fun divideCalculator() {
        println("몫 구하기 연산을 실행합니다.")
        println("하나의 숫자를 입력해주세요.")

        val number1 = readln().toLong()

        println("몫 구하기 연산할 숫자를 입력해주세요.")
        val number2 = readln().toLong()

        val answer = number1 / number2
        println("값: $answer")
    }
}