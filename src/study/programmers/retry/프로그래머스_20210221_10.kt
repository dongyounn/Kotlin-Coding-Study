package study.programmers.retry

import java.lang.StringBuilder

/*
* https://programmers.co.kr/learn/courses/30/lessons/12925
* 문자열을 정수로 바꾸기
* 복습
* */

fun solution2021022110(s: String): Int =
    s.removePrefix("+").toInt()


fun main(array: Array<String>) {
    solution2021022110("1234")
}