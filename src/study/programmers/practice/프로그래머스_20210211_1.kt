package study.programmers.practice


fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
    val reserveList = ArrayList<Int>()
    val lostList = ArrayList<Int>()

    reserve.forEach {
        reserveList.add(it)
    }
    lost.forEach {
        lostList.add(it)
    }

    var result = 0
    lost.forEach {
        reserve.forEach { j ->
            if (j == it) {
                reserveList.remove(it)
                lostList.remove(j)
                result += 1
            }
        }
    }
    lostList.forEach {
        for (rest in reserveList.indices) {
            if (
                it.plus(1) == reserveList[rest] ||
                it.minus(1) == reserveList[rest]
            ) {
                reserveList.remove(reserveList[rest])
                result += 1
                break
            }
        }
    }
    return result.plus(n.minus(lost.size))
}

fun main(args: Array<String>) {
    print(solution(8, intArrayOf(1, 2, 4, 6), intArrayOf(1, 2, 4, 6)))
}
