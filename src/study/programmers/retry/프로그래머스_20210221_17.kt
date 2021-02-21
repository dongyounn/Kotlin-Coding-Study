package study.programmers.retry
/*
* 제일 작은 수 제거하기
* https://programmers.co.kr/learn/courses/30/lessons/12935
* 복습
* */

fun solution2021022117(arr: IntArray): IntArray {
    val min = arr.sorted()[0]
    return if (arr.size == 1) intArrayOf(-1) else arr.filterNot { it == min }.toIntArray()
}

fun main(args: Array<String>) {
    solution2021022117(intArrayOf(4, 3, 2, 1))
}