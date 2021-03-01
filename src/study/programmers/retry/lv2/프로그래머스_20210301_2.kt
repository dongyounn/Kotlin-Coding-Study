package study.programmers.retry.lv2
/*
* https://programmers.co.kr/learn/courses/30/lessons/72412
* 순위검색
* 런타임 오류;;;
* 처음 */

fun solution202103012(info: Array<String>, query: Array<String>): IntArray {

    val splitList = info.map { it.split(" ") }
    val queryList = query.map { it.split(" ").filter { j -> j != "and" } }
    val resultList = ArrayList<Int>()
    queryList.forEach {
        var tempList = splitList
        for (i in it.indices) {
            if (i != it.lastIndex) {
                if (it[i] != "-") {
                    tempList = tempList.filter { j -> j[i] == it[i] }
                }
            } else
                tempList = tempList.filter { k -> k[i].toLong() >= it[i].toLong() }
        }
        resultList.add(tempList.size)
    }

    return resultList.toIntArray()
}

fun main(args: Array<String>) {
    solution202103012(
        arrayOf(
            "java backend junior pizza 150",
            "python frontend senior chicken 210",
            "python frontend senior chicken 150",
            "cpp backend senior pizza 260",
            "java backend junior chicken 80",
            "python backend senior chicken 50"
        ),
        arrayOf(
            "java and backend and junior and pizza 100",
            "python and frontend and senior and chicken 200",
            "cpp and - and senior and pizza 250",
            "- and backend and senior and - 150",
            "- and - and - and chicken 100",
            "- and - and - and - 150"
        )
    )
}