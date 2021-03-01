package study.programmers.retry.lv1

/*
* 짝수와 홀
* https://programmers.co.kr/learn/courses/30/lessons/12937
* 복습
* */

fun solution20210223(num: Int): String =
    if (num.rem(2) == 1) "Odd" else "Even"

fun main(args: Array<String>) {
    solution20210223(3)
}