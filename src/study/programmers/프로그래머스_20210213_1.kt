package study.programmers

fun solution(seoul: Array<String>): String {
    seoul.mapIndexed { index, s ->
        if (s == "Kim") {
            return "김서방은 ${index}에 있다. "
        }
    }
    return "A"
}