package programmers.day1

fun solution11(numbers: IntArray): String {
    val answer = numbers
        .map { it.toString() }
        .sortedWith(Comparator { a, b -> (b + a).toInt() - (a + b).toInt() })
        .joinToString ("") { it }
    return if (answer.startsWith('0')) "0" else answer
}

fun main(args: Array<String>) {
    solution11(intArrayOf(1000, 0, 5, 99, 100))
}