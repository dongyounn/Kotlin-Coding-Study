package programmers.day1

fun solution(clothes: Array<Array<String>>): Int {
    val map = HashMap<String, Int>()
    clothes.forEach {
        if (map.containsKey(it[1])) {
            map[it[1]] = map[it[1]]!!.plus(1)
        } else
            map[it[1]] = 1
    }
    var answer = 1
    map.keys.forEach {
        answer *= (map[it]!!.plus(1))
    }
    return answer.minus(1)
}

fun solution2(clothes: Array<Array<String>>) = clothes
    .groupBy { it[1] }.values   // group by type of clothes, keep only names of clothes
    .map { it.size + 1 }        // number of things to wear in a group (including wearing nothing)
    .reduce(Int::times)         // combine
    .minus(1)                   // remove the case where the spy wears nothing


fun solution3(clothes: Array<Array<String>>): Int {
    return clothes.groupBy { it[1] }.values.fold(1) { acc, v -> acc * (v.size + 1) } - 1
}

fun main(args: Array<String>) {
    solution2(
        arrayOf(
            arrayOf("yellow_hat", "headgear"),
            arrayOf("blue_sunglasses", "eyewear"),
            arrayOf("green_turban", "headgear")
        )
    )
}