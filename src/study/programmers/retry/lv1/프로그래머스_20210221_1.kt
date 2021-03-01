package study.programmers.retry.lv1

// https://programmers.co.kr/learn/courses/30/lessons/12903
// 가운데 글자 가져오기
// 복습

fun solution202102211(s: String): String {
    val center = s.length.div(2)
    return when (s.length.rem(1)) {
        1 -> s.substring(center, center)
        else -> s.substring(center, center + 1)
    }
}

fun solution_복습(s: String) =
    with(s) { substring(length / 2 - 1 + (length % 2)..length / 2) }

fun main(args: Array<String>) {
    solution202102211("abcde")
}