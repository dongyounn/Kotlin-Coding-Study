package study.programmers.retry.lv1

/*
* https://programmers.co.kr/learn/courses/30/lessons/12917
* 문자열 내림차순으로 배치하기
* 복습
* */

fun solution202102216(s: String) =
    String(s.toCharArray().sortedArrayDescending())

fun main(array: Array<String>) {
    solution202102216("Zbcdefg")
}