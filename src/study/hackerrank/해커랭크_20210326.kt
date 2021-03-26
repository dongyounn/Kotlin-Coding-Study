package study.hackerrank

import java.util.*
import kotlin.math.abs

// https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?isFullScreen=true
// Complete the catAndMouse function below.
fun catAndMouse(x: Int, y: Int, z: Int): String {
    val firstValue = abs(z.minus(x))
    val secondValue = abs(z.minus(y))
    return when {
        firstValue == secondValue -> {
            "Mouse C"
        }
        firstValue < secondValue -> {
            "Cat A"
        }
        else -> "Cat B"
    }

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}
