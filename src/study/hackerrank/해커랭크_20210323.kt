package study.hackerrank

import java.util.*

//https://www.hackerrank.com/challenges/utopian-tree/problem?isFullScreen=true

// fold 스트림 ? 초깃값을 정하고 이후 작업 수행
// Complete the utopianTree function below.
fun utopianTree(n: Int): Int {
    return (0..n).fold(
        0, { j, it ->
            if (it.rem(2) == 1) j * 2 else j + 1
        }
    )
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val result = utopianTree(n)

        println(result)
    }
}
