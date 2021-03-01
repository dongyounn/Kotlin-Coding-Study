package study.programmers.retry.lv2

/*
* 큰 수 만들기
* https://programmers.co.kr/learn/courses/30/lessons/42883
* 복습
* */

fun solution202102283(number: String, k: Int): String {
    var answer = StringBuilder(number)
    for (l in 0 until k) {
        for (i in 0 until answer.length - 1) {
            if (answer[i] < answer[i + 1]) {
                answer = answer.deleteCharAt(i)
                break;
            }
        }
    }
    return answer.substring(0, number.length - k)
}

fun main(args: Array<String>) {
    solution202102283(
        "1924", 2
    )
}