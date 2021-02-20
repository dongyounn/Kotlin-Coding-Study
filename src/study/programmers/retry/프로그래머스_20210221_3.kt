package study.programmers.retry
// https://programmers.co.kr/learn/courses/30/lessons/12910// 복습
// 나누어 떨어지는 숫자 배
// 복습

fun solution202102213(arr: IntArray, divisor: Int): IntArray {
    val result = arr.filter { it.rem(divisor) == 0 }.sorted().toIntArray()
    return if (result.isNotEmpty()) result else intArrayOf(-1)
}

fun main(array: Array<String>) {
    solution202102213(intArrayOf(5, 9, 7, 10), 5)
}