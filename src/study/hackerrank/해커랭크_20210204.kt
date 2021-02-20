import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.ArrayList
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*


// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {
    val originList = ArrayList<Int>()

    arr.forEach {
        originList.add(it)
    }

    var sumValue = 0L
    val sortedList = originList.sortedDescending()
    sortedList.forEach {
        sumValue = sumValue.plus(it.toLong())
    }

    println("${sumValue.minus(sortedList.first())} ${sumValue.minus(sortedList.last())}")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}