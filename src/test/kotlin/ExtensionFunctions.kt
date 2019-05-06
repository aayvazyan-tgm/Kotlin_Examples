import org.junit.Test
import kotlin.test.assertEquals

class ExtensionFunctions {
    @Test
    fun extensionFun() {
        assertEquals("1234567".shorten(), "1234")
    }
}

private fun String.shorten(): String {
    return this.substring(0, 4)
}
