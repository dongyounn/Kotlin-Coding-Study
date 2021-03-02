package study.programmers.utils

// 최대공약수 계산 함수
fun gcd(a: Int, b: Int): Int {
    return if (a.rem(b) == 0) {
        b
    } else
        gcd(b, a.rem(b))
}

// 최소공배수 계산 함수
fun lcm(a: Int, b: Int): Int {
    return a.times(b).div(gcd(a, b))
}

// 소수 여부 체크
fun Int.isPrime(): Boolean {
    for (i in 2..this - 2) {
        if (this % i == 0) {
            return false
        }
    }
    if (this <= 1) return false
    return true
}