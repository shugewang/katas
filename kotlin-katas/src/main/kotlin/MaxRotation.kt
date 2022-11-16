// https://www.codewars.com/kata/56a4872cbb65f3a610000026

fun maxRot(n:Long): Long {
    var nString = n.toString()
    val len = nString.length
    var i = 0
    var nSubstring1: String
    var nSubstring2: String
    var list = mutableListOf(n)
    while (i < len) {
        nSubstring1 = nString.take(i)
        nSubstring2 = nString.substring(i)
        nSubstring2 = nSubstring2.drop(1) + nSubstring2.take(1)
        nString = nSubstring1 + nSubstring2
        i++
        list.add(nString.toLong())
    }
    return list.maxOrNull() ?: 0
}

fun main() {
    maxRot(38458215)
}