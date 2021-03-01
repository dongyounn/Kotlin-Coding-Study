package study.programmers.retry.lv1

// 체육복
// https://programmers.co.kr/learn/courses/30/lessons/42862
// 복습
//
fun solution202102202(n: Int, lost: IntArray, reserve: IntArray): Int {
    var result = n
    val lostSet = lost.toSet().minus(reserve.toSet())
    val reserveSet = reserve.toSet().minus(lost.toSet()).toMutableSet()

    for (i in lostSet) {
        when {
            reserveSet.contains(i.plus(1)) -> reserveSet.remove(i.plus(1))
            reserveSet.contains(i.minus(1)) -> reserveSet.remove(i.minus(1))
            else -> result--
        }
    }
    return result
}


fun main(array: Array<String>) {
    solution202102202(
        5, intArrayOf(2, 4), intArrayOf(1, 3, 5)
    )
}