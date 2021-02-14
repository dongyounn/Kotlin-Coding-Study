package programmers.day1


class Solution23 {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        return strings.sortedWith(Comparator<String> { a, b ->
            if(a[n] == (b[n])) a.compareTo(b)
            else a[n].compareTo(b[n])
        }).toTypedArray()
    }
}

class Solution22{
    fun solution(strings: Array<String>, n: Int): Array<String> {
        return strings.also {
            it.sort()
            it.sortBy { it[n] }
        }
    }
}
