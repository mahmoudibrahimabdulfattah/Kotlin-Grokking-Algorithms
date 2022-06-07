
fun main() {

    println(pow(2, 3))

}

fun pow(Base: Int, Power: Int): Int{
    if (Power == 0) return 1
    if(Power == 1)  return Base
    return Base * pow(Base, Power-1)
}
