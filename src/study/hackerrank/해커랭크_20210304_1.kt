import java.util.*

/*
* https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true
* */
// Complete the divisibleSumPairs function below.
fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var cnt = 0
    for (i in ar.indices) {
        for (j in i.plus(1) until ar.size) {
            if ((ar[i].plus(ar[j])).rem(k) == 0) cnt++
        }
    }
    return cnt
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}
