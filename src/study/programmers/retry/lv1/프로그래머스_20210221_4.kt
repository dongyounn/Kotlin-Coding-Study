package study.programmers.retry.lv1

import kotlin.math.max
import kotlin.math.min

// https://programmers.co.kr/learn/courses/30/lessons/12912
// 두 정수 사이의 합
// 복습

fun solution202102214(a: Int, b: Int): Long {
    var minValue = 0L
    for (i in min(a, b)..max(a, b)) {
        minValue += i
    }
    return minValue
}

fun main(array: Array<String>) {
    solution202102214(3, 5)
}