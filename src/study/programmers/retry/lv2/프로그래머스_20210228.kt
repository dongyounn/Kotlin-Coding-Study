package study.programmers.retry.lv2
/*
* 최댓값과 최솟값
* https://programmers.co.kr/learn/courses/30/lessons/12939
* 복습
* */

fun solution20210228(s: String): String = s.split(" ").map { it.toLong() }.let {
    "${it.minOrNull()} ${it.maxOrNull()}"
}

fun main(args: Array<String>) {
    solution20210228("1 2 3 4")
}