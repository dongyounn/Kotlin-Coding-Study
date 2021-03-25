package study.hackerrank

import java.util.*

// Complete the angryProfessor function below.
//https://www.hackerrank.com/challenges/angry-professor/problem?isFullScreen=true
fun angryProfessor(k: Int, a: Array<Int>): String {
    return if (a.filter { it <= 0 }.count() >= k) "NO" else "YES"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val nk = scan.nextLine().split(" ")

        val n = nk[0].trim().toInt()

        val k = nk[1].trim().toInt()

        val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        val result = angryProfessor(k, a)

        println(result)
    }
}
