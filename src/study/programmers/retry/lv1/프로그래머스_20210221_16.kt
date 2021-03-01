package study.programmers.retry.lv1
/*
* 정수 내림차순으로 배치하기
* https://programmers.co.kr/learn/courses/30/lessons/12933
* 복습
* */

fun solution2021022116(n: Long): Long {

    return n.toString().toList().sortedDescending().joinToString("").toLong()
}

fun main(args: Array<String>) {
    solution2021022116(118372)
}