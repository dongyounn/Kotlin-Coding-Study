package study.programmers.retry.lv1

import java.lang.StringBuilder

/*
* https://programmers.co.kr/learn/courses/30/lessons/12930
* 이상한 문자 만들기
* 복습
* */

fun solution2021022113(s: String): String {
    return s.split(" ").joinToString(" ") {
        it.toCharArray().mapIndexed { index, c ->
            if (index.rem(2) == 0) {
                c.toUpperCase()
            } else c.toLowerCase()
        }.joinToString("")
    }
}

fun main(array: Array<String>) {
    solution2021022113("try hello world")
}