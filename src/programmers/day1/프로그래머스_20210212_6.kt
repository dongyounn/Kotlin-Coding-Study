package programmers.day1

fun solution(n: Long): Long {

    return String(n.toString().toCharArray().sortedArrayDescending()).toLong()
}