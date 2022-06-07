fun main() {

    val key  = readLine()!!.trim().toInt()
    
    val list = (1..10).toList()
    for (i in list.indices){
        print("${list[i]} ")
    }

    print("\nBinary Search = ")
    var upper = list.size - 1
    var lower = 0
    var binResult = -1
    while (upper >= lower){
        var mid = (upper + lower) / 2
        if(list[mid]  == key){
            binResult = mid
            break
        } else if(list[mid] > key){
            upper = mid
        } else{
            lower = mid + 1
        }
    }
    print(binResult)
}
