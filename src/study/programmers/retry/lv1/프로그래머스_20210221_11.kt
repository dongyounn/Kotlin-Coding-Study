package study.programmers.retry.lv1

import java.lang.StringBuilder

/*
* https://programmers.co.kr/learn/courses/30/lessons/70128
* 내적
* 복습
* */

fun solution2021022111(a: IntArray, b: IntArray): Int =
    a.zip(b).map {
        it.first.times(it.second)
    }.sum()

fun main(array: Array<String>) {
    solution2021022110("1234")
}