package study.programmers.retry.lv2

/*
* JadenCase 문자열 만들기
* https://programmers.co.kr/learn/courses/30/lessons/42883
* */


// 런타임 에러;;;;
fun solution202102284(s: String): String {
    val upper = s.split(" ").map { it[0].toUpperCase() }

    val sb = StringBuilder()
    val lower = s.toLowerCase().split(" ")
    for (it in lower.indices) {
        sb.append(lower[it].replace(lower[it].first() , upper[it])).append(" ")
    }

    return sb.removeSuffix(" ").toString()
}


// 이런방법이....
fun other2021022842(s: String): String {
    return s.toLowerCase().split(" ").joinToString(" ") {
        it.capitalize()
    }
}

fun other202102284(s: String): String {
    val charArray = s.toLowerCase().toCharArray()
    for (index in 1 until charArray.size) {
        if (charArray[index].isLowerCase()) {
            with (charArray) {
                if (this[index-1] == ' ') this[index] = this[index].toUpperCase()
            }
        }
    }

    charArray[0] = charArray[0].toUpperCase()

    return String(charArray)
}

fun main(args: Array<String>) {
    other2021022842(
        "3people unFollowed me"
    )
}