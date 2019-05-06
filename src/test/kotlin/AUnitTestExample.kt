import org.junit.Test
import kotlin.test.assertEquals

class AUnitTestExample {

    @Test
    fun successTest() {
        assertEquals(true, true)
    }

    @Test
    fun failingTest() {
        val shouldBeTrue = false
        assert(shouldBeTrue == true) { "shouldBeTrue was: $shouldBeTrue" }
    }
}
