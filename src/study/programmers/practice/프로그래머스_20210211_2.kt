package study.programmers.practice


fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
    val resultList = ArrayList<Int>()

    commands.forEach {
        val sepList = ArrayList<Int>()
        for (i in it[0].minus(1)..it[1].minus(1)) {
            sepList.add(array[i])
        }
        sepList.sort()
        resultList.add(sepList[it[2].minus(1)])
    }
    return resultList.toIntArray()
}

fun main(args: Array<String>) {
    print(
        solution(
            intArrayOf(1, 5, 2, 6, 3, 7, 4),
            arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))
        )
    )
}