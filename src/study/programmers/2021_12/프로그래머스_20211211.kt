/*
* https://programmers.co.kr/learn/courses/30/lessons/86051?language=kotlin
* */
class Solution {
    fun solution(numbers: IntArray): Int {
        var result = 0
        (0..9).forEach {
            if (!numbers.contains(it)) {
                result += it
            }
        }
        return result
    }
}

fun main(args: Array<String>) {

}

