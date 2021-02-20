package study.programmers

class Solution1 {
    fun solution(numbers: IntArray): IntArray {
        val result = ArrayList<Int>()

        for (i in numbers.indices) {
            for (j in numbers.indices) {
                if (i != j) {
                    result.add(numbers[i].plus(numbers[j]))
                }
            }
        }
        return result.distinct().sorted().toIntArray()
    }
}