package study.programmers.skill

fun main(args: Array<String>) {
    solutionSkill1(118372)
    solutionSkill11(intArrayOf(5, 5))
}


fun solutionSkill1(n: Long): Long {
    return n.toString().toCharArray().sortedByDescending { it.toLong() }.joinToString("").toLong()
}

fun solutionSkill11(arr: IntArray): Double = arr.average()
