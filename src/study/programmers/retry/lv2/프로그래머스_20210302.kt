package study.programmers.retry.lv2

import study.programmers.utils.isPrime

/*
* https://programmers.co.kr/learn/courses/30/lessons/72412
* 소수 찾기
* 처음 */

//이거 에러나는 이유 주말에 찾아보자
fun solution20210302(numbers: String): Int {
    val resultList = ArrayList<Int>()
    if (numbers == "") return 0
    numbers.toCharArray().map { it.toString() }.let {
        for (i in it.indices) {
            val sb = StringBuilder(it[i])
            resultList.add(sb.toString().toInt())
            for (j in it.indices) {
                if (i != j) {
                    sb.append(it[j])
                    resultList.add(sb.toString().toInt())
                }
            }
        }
    }
    return resultList.distinct().filter { it.isPrime() }.count()
}

fun Int.isPrime(): Boolean {
    for (i in 2..this - 2) {
        if (this % i == 0) {
            return false
        }
    }
    if (this <= 1) return false
    return true
}


lateinit var string: String
lateinit var check: BooleanArray
val answerSet = mutableSetOf<Int>()
fun solution(numbers: String): Int {
    string = numbers
    check = BooleanArray(string.length)
    permutation(0, "")
    return answerSet.size
}

fun permutation(depth: Int, makeStr: String) {
    if (depth == string.length) {
        if (makeStr == "") return
        if ((makeStr.toInt()).isPrime()) {
            answerSet.add(makeStr.toInt())
        }
        return
    }
    for (i in string.indices) {
        if (!check[i]) {
            check[i] = true
            permutation(depth + 1, makeStr + string[i])
            check[i] = false
            permutation(depth + 1, makeStr)
        }
    }
}


fun main(args: Array<String>) {
    solution("17")
}