// In a factory a printer prints labels for boxes. For one kind of boxes the printer has
// to use colors which, for the sake of simplicity, are named with letters from a to m.
//
// The colors used by the printer are recorded in a control string.
// Sometimes there are problems: lack of colors, technical malfunction and a "bad" control
// string is produced e.g. aaaxbbbbyyhwawiwjjjwwm with letters not from a to m.
//
// You have to write a function printer_error which given a string will return the error rate of
// the printer as a string representing a rational whose numerator is the number of errors and
// the denominator the length of the control string.

// The string has a length greater or equal to one and contains only letters from ato z.

import java.util.regex.Pattern
//fun printerError(s: String): String {
//    val matcher = Pattern.compile("[^a-m]").matcher(s)
//    var counter = 0
//
//    while (matcher.find()) {
//        counter++
//    }
//
//    return "${(counter.toString())}/${s.length}"
//}

fun printerError(s: String) = "${s.count { it !in 'a'..'m' }}/${s.length}"

fun main() {
    printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")
}