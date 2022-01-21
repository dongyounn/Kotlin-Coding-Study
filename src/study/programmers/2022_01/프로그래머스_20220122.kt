//https://programmers.co.kr/learn/courses/30/lessons/92334?language=kotlin

fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {

    val uniqueReport = report.map { userSelect ->
        userSelect.split(" ").let {
            Pair(it[0], it[1])
        }
    }.distinct()

    val reportMap = HashMap<String, Int>().apply {
        uniqueReport.forEach { user ->
            this[user.second] = this.getOrDefault(user.second, 0) + 1
        }
    }.filter { it.value >= k }

    val reportMapping = HashMap<String, Int>().apply {
        reportMap.keys.forEach { target ->
            uniqueReport.filter { it.second == target }.forEach { user ->
                this[user.first] = this.getOrDefault(user.first, 0) + 1
            }
        }
    }

    return ArrayList<Int>().apply {
        id_list.forEach { id ->
            this.add(reportMapping.getOrDefault(id, 0))
        }
    }.toIntArray()

}


fun main(args: Array<String>) {
    solution(
        arrayOf("con", "ryan"),
        arrayOf("ryan con", "ryan con", "ryan con", "ryan con"),
        3
    )
}
