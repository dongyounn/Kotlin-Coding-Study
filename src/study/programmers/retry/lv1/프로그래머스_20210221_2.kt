package study.programmers.retry.lv1

// https://programmers.co.kr/learn/courses/30/lessons/68935
// 3진법 뒤집기
// 복습

fun solution202102212(n: Int) = n.toString(3).reversed().toInt(3)

fun main(array: Array<String>) {
    solution202102212(45)
}