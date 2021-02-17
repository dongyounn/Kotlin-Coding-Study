package programmers.day1

import java.lang.StringBuilder

fun solution2(number: String, k: Int): String {
    val tempList = number.split("").filter { it.isNotEmpty() }.toMutableList()

    var count = 0
    var index = 0
    do {
        if (tempList[index.plus(1)] > tempList[index]) {
            tempList.removeAt(index)
            count++
        } else
            index++

        if (index + 1 >= tempList.size) {
            index = 0
        }
    } while (count < k)

    val sb = StringBuilder()
    tempList.forEach {
        sb.append(it)
    }
    return sb.toString()
}

fun solution(number: String, k: Int): String {
    var answer = StringBuilder(number)
    for (l in 0 until k) {
        for (i in 0 until answer.length - 1) {
            if (answer[i] < answer[i + 1]) {
                answer = answer.deleteCharAt(i)
                break;
            }
        }
    }
    return answer.substring(0, number.length - k)
}

fun main(args: Array<String>) {
    solution("999", 2)
}