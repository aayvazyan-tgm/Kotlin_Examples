import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class Nullability {

    @Test
    fun nullableAccess() {
        val exampleClass = ExampleClass("value", "value")
        assertEquals(
            exampleClass.mayBeNullString?.toUpperCase(),
            exampleClass.neverNullString.toUpperCase()
        )
    }

    @Test
    fun nullableAccessEnsured() {
        val exampleClass = ExampleClass("value", "value")
        exampleClass.mayBeNullString!!

        assertEquals(
            exampleClass.mayBeNullString.toUpperCase(),
            exampleClass.neverNullString.toUpperCase()
        )
    }

    @Test
    fun nullableAccessEnsuredError() {
        val exampleClass = ExampleClass(null, "value")
        assertFails {
            try {
                exampleClass.mayBeNullString!!
            } catch (e: Exception) {
                e.printStackTrace()
                throw e
            }
        }
    }

    @Test
    fun conditionals() {
        val exampleClass = ExampleClass(null, "value")

        assertEquals(
            exampleClass.mayBeNullString?.toUpperCase() ?: "Fallback",
            "Fallback"
        )
    }
}

private class ExampleClass(
    val mayBeNullString: String?,
    val neverNullString: String
)
