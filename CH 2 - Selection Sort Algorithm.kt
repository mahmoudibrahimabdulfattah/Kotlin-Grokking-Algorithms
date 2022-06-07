
fun main() {
    var list = listOf(1, 4, 2, 8, 6)
    var sortLis = sortList(list)
    println(sortLis)

}

fun sortList(inputList: List<Int>): MutableList<Int> {
    var currIndex = 0
    val resList: MutableList<Int> = inputList.toMutableList()

    for (i in resList.indices){
        var lowIndex = currIndex
        for (j in currIndex until  resList.size){
            if (resList[j] < resList[lowIndex]){
                lowIndex = j
            }
        }
        val temp = resList[currIndex]
        resList[currIndex] = resList[lowIndex]
        resList[lowIndex] = temp
        currIndex++
    }
    return resList
}