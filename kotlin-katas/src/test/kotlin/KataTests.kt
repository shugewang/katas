import org.junit.Test
import kotlin.test.assertEquals

class KataTests {

    @Test
    fun smallEnoughTest() {
        assertEquals(false, smallEnough(intArrayOf(1,2), 1))
    }

    @Test
    fun fixStringCaseTest() {
        assertEquals("code", FixStringCase.solve("code"))
        assertEquals("CODE", FixStringCase.solve("CODe"))
        assertEquals("code", FixStringCase.solve("COde"))
        assertEquals("code", FixStringCase.solve("Code"))
        assertEquals("", FixStringCase.solve(""))
    }

    @Test
    fun argsCountBasicTest() {
        assertEquals(1, argsCount(100))
        assertEquals(3, argsCount(100, 2, 3))
        assertEquals(2, argsCount(32, 12))
        assertEquals(0, argsCount())
        assertEquals(1, argsCount("a string!"))
    }
    @Test
    fun argsCountRandomTest() {
        assertEquals(2, argsCount("a string!", Pair(1, "2")))
    }

    @Test
    fun printerErrorTest() {
        assertEquals("3/56", printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"))
        assertEquals("6/60", printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"))
        assertEquals("11/65", printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyzuuuuu"))
        assertEquals("0/53", printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmm"))
    }

    @Test
    fun findShortTest() {
        assertEquals(3, findShort("bitcoin take over the world maybe who knows perhaps"))
        assertEquals(3, findShort("turns out random test cases are easier than writing out basic ones"))
        assertEquals(2, findShort("Let's travel abroad shall we"))
    }

}

