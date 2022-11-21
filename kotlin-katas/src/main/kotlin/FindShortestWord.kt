//Simple, given a string of words, return the length of the shortest word(s).
//
//String will never be empty and you do not need to account for different data types.

fun findShort(s: String): Int = s.split(" ").minOf{it.length}

//fun findShort(s: String): Int {
//    val sArr = s.split(" ")
//    var shortestLen = sArr[0].length
//    for (s in sArr) {
//        if (s.length < shortestLen) {
//            shortestLen = s.length
//        }
//    }
//    println(shortestLen)
//    return shortestLen
//}

fun main() {
    findShort("bitcoin take over the world maybe who knows perhaps")
}