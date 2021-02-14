package programmers.day1

fun solution(n: Int): Int {
    return n.toString().sumBy { it.toInt() -48 }

}

fun main(args: Array<String>) {
    solution(1293)
}