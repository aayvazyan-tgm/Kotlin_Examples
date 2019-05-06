import org.junit.Test
import kotlin.test.assertEquals

class Destructuring {

    @Test
    fun destructureObject() {
        val (name, _, age) = ContainerClass("Franz")
        assertEquals(name, "Franz")
    }

    @Test
    fun destructureInLambda() {
        val map = mapOf(Pair("key", "value"))
        map.forEach { entry ->
            assertEquals(entry.key, "key")
            assertEquals(entry.value, "value")
        }
        map.forEach { (key, value) ->
            assertEquals(key, "key")
            assertEquals(value, "value")
        }
    }
}

private data class ContainerClass(val name: String = "John", val telNr: String = "0664 1234", val age: Int = 42)
