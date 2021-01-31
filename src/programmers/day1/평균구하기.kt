package programmers.day1

fun main(args: Array<String>) {
    fun solution(arr: Array<Int>): Double {
        var sumAmount = 0
        for (a in arr) {
            sumAmount = sumAmount.plus(a)
        }
        val result =  sumAmount / arr.size.toDouble()
        println("##결과는 ? -->  $result")

        return result
    }
    solution(arrayOf(1, 2, 3))
}
