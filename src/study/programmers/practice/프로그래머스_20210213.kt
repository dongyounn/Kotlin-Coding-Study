package study.programmers.practice

import kotlin.math.sqrt

fun solution202102210(n: Long): Long {
    val target = sqrt(n.toDouble()).toLong()
    return if (target * target == n) target.plus(1) * target.plus(1) else -1
}

fun main(args: Array<String>) {
    solution202102210(121)
}