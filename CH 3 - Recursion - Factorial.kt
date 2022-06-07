
fun main() {
    val n = readLine()!!.trim().toInt()
    println(factorial(n))
}

fun factorial(x: Int): Int {
    if(x == 1 || x == 0) return 1
    return x * factorial(x-1)
}