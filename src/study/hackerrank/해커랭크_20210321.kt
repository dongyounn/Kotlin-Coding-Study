package study.hackerrank

import kotlin.math.abs

/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */
//https://www.hackerrank.com/challenges/picking-numbers/problem?isFullScreen=true

fun pickingNumbers(a: Array<Int>): Int {
    // Write your code here
    val resultList = HashMap<Int, Int>()
    val resultMap = a.groupBy { it }
    a.distinct().sorted().let {
        for (i in it.indices) {
            for (j in i + 1 until it.size) {
                resultList[abs(it[i].minus(it[j]))] = (resultMap[it[i]]!!.count().plus(resultMap[it[j]]!!.count()))
            }
        }
    }
    return resultList[resultMap.keys.minOrNull()]?:a.count()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}
