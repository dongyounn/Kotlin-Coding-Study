package study.hackerrank

/*
*
* https://www.hackerrank.com/challenges/migratory-birds/problem?h_r=next-challenge&h_v=zen&isFullScreen=false
* */
// Complete the migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int {
    return arr.groupBy { it }.map { Pair(it.key, it.value.size) }.sortedByDescending { it.second }[0].first
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
