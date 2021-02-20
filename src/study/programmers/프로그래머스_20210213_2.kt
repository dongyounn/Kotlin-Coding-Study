package study.programmers

import kotlin.math.max
import kotlin.math.min

fun solution2(n: Int, m: Int): IntArray {
    val minValue = min(n, m)
    val maxValue = max(n, m)

    fun getMax(a: Int, b: Int): Int = if (a % b == 0) b else getMax(b, a % b)

    return intArrayOf(getMax(minValue, maxValue),minValue * maxValue / getMax(minValue, maxValue))
}


