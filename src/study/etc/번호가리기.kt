package study.programmers

import java.lang.StringBuilder

fun main(args: Array<String>) {
    fun solution(phone_number: String): String {
        var answer = ""
        val numberSize = phone_number.length

        val stringBuilder = StringBuilder()
        for (i in 1..numberSize - 4){
            stringBuilder.append("*")
        }
        val result = stringBuilder.append(phone_number.substring(numberSize-4, numberSize)).toString()
        println("###결과는 ? --> $result")
        return result
    }

    solution("010902901067")
}
