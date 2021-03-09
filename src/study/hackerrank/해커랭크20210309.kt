package study.hackerrank

import java.util.*

/*
* https://www.hackerrank.com/challenges/permutation-equation/problem?isFullScreen=true
* */
// Complete the permutationEquation function below.
fun permutationEquation(p: Array<Int>): Array<Int> =
    (1..p.size).map {
        p.indexOf(p.indexOf(it).plus(1)).plus(1)
    }.toTypedArray()


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = permutationEquation(p)

    println(result.joinToString("\n"))
}
