package study.programmers.retry.lv1

/*
* https://programmers.co.kr/learn/courses/30/lessons/12917
* 문자열 내림차순으로 배치하기
* 복습
* */

fun solution202102217(s: String): Boolean {
    var result = true
    return if (s.length == 4 || s.length == 6) {
        s.toCharArray().forEach {
            if (!it.isDigit()) result = false
        }
        result
    } else !result
}

fun main(array: Array<String>) {
    solution202102217("a234")
}