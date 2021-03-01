package study.programmers.retry.lv1

import java.lang.StringBuilder

/*
* https://programmers.co.kr/learn/courses/30/lessons/12922
* 수박수박수박수?
* 복습
* */

fun solution202102219(n: Int): String =
    StringBuilder("수박".repeat(n.div(2))).append(if (n.rem(2) == 1) "수" else "").toString()


fun main(array: Array<String>) {
    solution202102219(3)
}