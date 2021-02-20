package study.programmers.retry

import java.lang.StringBuilder

/*
* https://programmers.co.kr/learn/courses/30/lessons/12932
* 자연수 뒤집어 배열로 만들기
* 복습
* */

fun solution2021022115(n: Long): IntArray {
    return n.toString().reversed().toCharArray().map { it.toString().toInt() }.toIntArray()
}

fun main(array: Array<String>) {
    solution2021022115(12345)
}