import org.junit.Test
import kotlin.test.assertEquals as assert

class AUnitTestExample {

    @Test
    fun successTest() {
        assert(true, true)
    }

    @Test
    fun failingTest() {
        val shouldBeTrue = false
        assert(shouldBeTrue == true) { "shouldBeTrue was: $shouldBeTrue" }
    }
}
