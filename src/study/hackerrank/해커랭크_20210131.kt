import kotlin.math.abs

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val loopSize = a.size
    var first = 0
    var second = 0

    for (target in 0 until loopSize) {
        a[target].compareTo(b[target]).let {
            if (it > 0) first = first.plus(it)
            if (it < 0) second = second.plus(abs(it))
        }
    }
    return arrayOf(first, second)
}

fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
