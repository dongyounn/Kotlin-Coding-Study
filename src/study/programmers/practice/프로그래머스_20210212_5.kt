package study.programmers.practice

fun solution(a: IntArray, b: IntArray): Int {
    val resultList = ArrayList<Int>()

    for (target in a.indices) {
        resultList.add(a[target] * b[target])
    }
    return resultList.sumBy { it }
}

fun main(args: Array<String>) {

}