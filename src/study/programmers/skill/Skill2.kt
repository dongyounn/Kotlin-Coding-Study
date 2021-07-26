package study.programmers.skill

fun main(args: Array<String>) {
    solutionSkill2(arrayOf(arrayOf("ICN", "JFK"), arrayOf("HND", "IAD"), arrayOf("JFK", "HND")))
}


fun solutionSkill2(tickets: Array<Array<String>>): Array<String> {
    var next = "ICN"
    val result = ArrayList<String>()
    val temp = tickets.toMutableList()
    repeat(tickets.size) {
        temp.filter { it[0] == next }.minByOrNull { it[1] }!!.let {
            next = it[1]
            result.add(it[0])
            if (temp.size == 1) {
                result.add(it[1])
            }
            temp.remove(it)
        }
    }
    return result.toTypedArray()
}

fun solutionSkill22(arr: IntArray): Double = arr.average()
