package study.programmers

import java.lang.Math.pow
import kotlin.math.sqrt

fun solution7(n: Long): Long {
    val target = sqrt(n.toDouble()).toLong()
    return if (target * target == n) target.plus(1) * target.plus(1) else -1
}

fun main(args: Array<String>) {
    solution7(121)
}