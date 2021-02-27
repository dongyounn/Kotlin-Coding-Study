package study.programmers.practice

import java.lang.StringBuilder

fun solution(n: Int): String {
    val sb = StringBuilder()
    for (i in 1..n.div(2)){
        sb.append("수박")
    }
    if (n.rem(2) == 1) {
        sb.append("수")
    }
    return sb.toString()
}
