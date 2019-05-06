import org.junit.Test
import kotlin.test.assertEquals

class StringTemplates {

    @Test
    fun simpleNumber() {
        val number = 123
        val template = "Hello $number"
        assertEquals(template, "Hello 123")
    }

    @Test
    fun propertyAccess() {
        val values = Pair("key", "123")
        val template = "Hello ${values.second}"
        assertEquals(template, "Hello 123")
    }

    @Test
    fun calculations() {
        val template = "Hello ${124 - 1}"
        assertEquals(template, "Hello 123")
    }


    @Test
    fun stringLiteralsAndFunctions() {
        val newLineString = """
            Hello
            123
        """.trimIndent()
        val newLineDefault = "Hello\n123"
        assertEquals(newLineString, newLineDefault)
    }


}
