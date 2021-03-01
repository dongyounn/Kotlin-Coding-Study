package study.programmers.retry.lv1

// https://programmers.co.kr/learn/courses/30/lessons/12901?language=kotlin
// 2016년
// 복습
import java.text.SimpleDateFormat
import java.util.*

fun solution202102210(a: Int, b: Int): String {
    val stringBuilder = StringBuilder()
    val cal = Calendar.getInstance()
    cal.time = SimpleDateFormat("yyyyMMdd").parse(
        stringBuilder.append("2016").append(a.toString().padStart(2, '0')).append(b.toString()).toString()
    )
    return cal.getDisplayName(Calendar.DAY_OF_WEEK, 1, Locale.US).toUpperCase()
}

fun main(args: Array<String>) {
    solution202102210(5, 24)
}