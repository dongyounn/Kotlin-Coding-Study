package study.codility

fun solution20210306(A: IntArray): Int {
    var result = 1
    A.forEach {
        result *= it
    }
    return when (result) {
        in 1..1000 -> 1
        0 -> 0
        else -> -1
    }
}

fun main(args: Array<String>) {
    solution20210306(intArrayOf(-1, 0, 1))
}
