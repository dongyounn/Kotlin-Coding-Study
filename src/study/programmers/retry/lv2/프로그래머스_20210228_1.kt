package study.programmers.retry.lv2

/*
* 위장
* https://programmers.co.kr/learn/courses/30/lessons/42578
* 복습
* */

fun solution202102281(clothes: Array<Array<String>>): Int {
    val clothMap = HashMap<String, Int>()
    clothes.forEach {
        clothMap[it[1]] = clothMap.getOrDefault(it[1], 0).plus(1)
    }
    return clothMap.values.fold(1) { total, num -> total * (num.plus(1)) }.minus(1)
}

/*
* 더좋은 풀이 방법
*/
fun other202102281(clothes: Array<Array<String>>): Int {
    return clothes.groupBy { it[1] }.values.fold(1) { acc, v -> acc * (v.size + 1) } - 1
}

fun main(args: Array<String>) {
    solution202102281(
        arrayOf(
            arrayOf("yellow_hat", "headgear"),
            arrayOf("blue_sunglasses", "eyewear"),
            arrayOf("green_turban", "headgear")
        )
    )
}