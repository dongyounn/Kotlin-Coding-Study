package study.programmers.retry

import java.lang.StringBuilder

/*
* https://programmers.co.kr/learn/courses/30/lessons/12928
* 약수의 합
* 복습
* */

fun solution2021022112(n: Int): Int {
    val list = ArrayList<Int>()
    for (i in 1..n) {
        if (n.rem(i) == 0) {
            list.add(i)
        }
    }
    return list.sum()
}

fun 다른방법2021022112(n: Int) = (1..n).filter { n.rem(it) == 0 }.sum()

fun main(array: Array<String>) {
    solution2021022112(12)
}