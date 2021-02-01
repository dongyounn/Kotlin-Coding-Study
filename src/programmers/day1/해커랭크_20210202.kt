import java.text.DecimalFormat
import java.util.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): ArrayList<String> {
    var positive = 0
    var negative = 0
    var zero = 0
    arr.forEach {
        if (it > 0) positive++
        if (it < 0) negative++
        if (it == 0) zero++
    }
    val arrSize = arr.size.toDouble()
    fun getResult(double: Int) = DecimalFormat("0.000000").format(double.toDouble() / arrSize)

    return arrayListOf(
        getResult(positive),
        getResult(negative),
        getResult(zero)
    )
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    plusMinus(arr).forEach{
        println(it)
    }

}
