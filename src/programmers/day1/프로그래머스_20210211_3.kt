package programmers.day1

import java.text.SimpleDateFormat
import java.util.*

fun solution(a: Int, b: Int): String {
    val stringBuilder = StringBuilder()
    val cal = Calendar.getInstance()
    cal.time = SimpleDateFormat("yyyyMMdd").parse(
        stringBuilder.append("2016").append(a.toString().padStart(2, '0')).append(b.toString()).toString()
    )
    return cal.getDisplayName(Calendar.DAY_OF_WEEK, 1, Locale.US).toUpperCase()
}

fun main(args: Array<String>) {
    print(
        solution(
            5, 24
        )
    )
}