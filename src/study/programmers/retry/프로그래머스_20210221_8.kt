package study.programmers.retry

/*
* https://programmers.co.kr/learn/courses/30/lessons/12919
* 서울에서 김서방 찾기
* 복습
* */

fun solution202102218(seoul: Array<String>): String {
    seoul.forEachIndexed { index, s ->
        if (s == "Kim") {
            return "김서방은 ${index}에 있다"
        }
    }
    return "없다"
}
// 참고
fun solution(seoul: Array<String>): String = "김서방은 ${seoul.indexOf("Kim")}에 있다"

fun main(array: Array<String>) {
    solution202102218(arrayOf("Jane", "Kim"))
}