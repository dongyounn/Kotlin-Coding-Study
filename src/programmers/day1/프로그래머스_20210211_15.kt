package programmers.day1

fun solution3(s: String): Boolean {
    var answer = true
    s.split("").filter { it.isNotEmpty() }.forEach {
        if (!it.contains("[0-9]".toRegex())) {
            return false
        }
    }

    return s.length == 2 || s.length == 4
}

fun main(args: Array<String>) {
    solution3("1234")
}