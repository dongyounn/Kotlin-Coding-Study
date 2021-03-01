package study.programmers.retry.lv2
/*
* https://programmers.co.kr/learn/courses/30/lessons/12953
* N개의 최소공배수
* 처음 */

fun solution202103011(arr: IntArray): Int {
    fun lcm(a: Int, b: Int): Int {
        fun gcd(a: Int, b: Int): Int {
            return if (a.rem(b) == 0) {
                b
            } else
                gcd(b, a.rem(b))
        }
        return a.times(b).div(gcd(a, b))
    }

    var lcmValue = lcm(arr[0], arr[1])
    for (i in 2 until arr.size) {
        lcmValue = lcm(lcmValue, arr[i])
    }
    return lcmValue
}

fun main(args: Array<String>) {
    solution202103011(intArrayOf(2, 6, 8, 14))
}