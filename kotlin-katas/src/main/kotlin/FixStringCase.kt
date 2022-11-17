//In this Kata, you will be given a string that may have mixed uppercase and lowercase letters and
//your task is to convert that string to either lowercase only or uppercase only based on:
// - make as few changes as possible.
// - if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.

object FixStringCase {
    fun solve(s: String): String {
        return if (s.count { it.isUpperCase()} > s.length/2) {
            s.uppercase()
        } else {
            s.lowercase()
        }
    }

//    fun solve(s: String): String {
//        var sArr = s.toList()
//        var totalUppercase: Int = 0
//        var totalLowercase: Int = 0
//
//        for (c in sArr) {
//            if (c.isUpperCase()) {
//                totalUppercase++
//            } else {
//                totalLowercase++
//            }
//        }
//
//        var fixedString : String = if (totalUppercase > totalLowercase) {
//            s.uppercase()
//        } else {
//            s.lowercase()
//        }
//        return fixedString
//    }

}

fun main() {
    FixStringCase.solve("codE")
}