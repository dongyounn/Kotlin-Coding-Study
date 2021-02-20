package study.programmers.retry

import java.lang.StringBuilder

/*
* https://programmers.co.kr/learn/courses/30/lessons/12928
* 약수의 합
* 복습
* */

fun solution2021022111(n: Int): Int {
    val list = ArrayList<Int>()
    for (i in 0..n) {
        if (n.rem(i) == 0) {
            list.add(i)
        }
    }
    return list.sum()
}

fun main(array: Array<String>) {
    solution2021022111(12)
}