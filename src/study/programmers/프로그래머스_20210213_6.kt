package study.programmers

fun solution(N: Int, stages: IntArray): IntArray {
    var tempList = stages.toMutableList()
    val resultList = ArrayList<Int>()
    val mapping = HashMap<Int, Double>()

    for (i in 1..N) {
        mapping[i] = if (stages.contains(i)) stages.filter { j -> i == j }.count().toDouble() / tempList.size.toDouble() else 0.0
        tempList = tempList.filter { k -> i != k }.toMutableList()
    }
    mapping.toList().sortedByDescending { (_, value) -> value }.toMap().forEach {
        resultList.add(it.key)
    }
    return resultList.toIntArray()
}

fun main(args: Array<String>) {
    solution(7, intArrayOf(2, 1, 2, 6, 2, 4, 3, 3))
}