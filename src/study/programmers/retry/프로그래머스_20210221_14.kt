package study.programmers.retry

import java.lang.StringBuilder

/*
* https://programmers.co.kr/learn/courses/30/lessons/12931
* 자릿수 더하기
* 복습
* */

fun solution2021022114(n: Int): Int {
    return n.toString().toCharArray().sumBy { it.toString().toInt() }
}

fun main(array: Array<String>) {
    solution2021022114(123)
}