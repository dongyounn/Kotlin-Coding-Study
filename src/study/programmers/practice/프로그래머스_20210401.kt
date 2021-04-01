/*
* https://programmers.co.kr/learn/courses/30/lessons/12977
* 소수 만들기
*
* */
fun solution20210401(nums: IntArray): Int {
    fun Int.isPrime(): Boolean {
        for (i in 2..this - 2) {
            if (this % i == 0) {
                return false
            }
        }
        if (this <= 1) return false
        return true
    }

    var result = 0
    for (i in 0..nums.size.minus(1)) {
        for (j in i.plus(1)..nums.size.minus(1)) {
            for (k in j.plus(1)..nums.size.minus(1)) {
                if (nums[i].plus(nums[j]).plus(nums[k]).isPrime()) result++
            }
        }
    }
    return result
}

fun main(args: Array<String>) {
    solution20210401(
        intArrayOf(1, 2, 3, 4)
    )
}