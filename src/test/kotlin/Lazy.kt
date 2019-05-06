import org.junit.Test
import kotlin.test.assertEquals

class Lazy {

    @Test
    fun successTest() {
        val myLazyclass = LazyInitializer()
        assertEquals(myLazyclass.initDone, false)
        assertEquals(myLazyclass.lazyProperty, "Value")
        assertEquals(myLazyclass.initDone, true)
    }
}

private class LazyInitializer {
    val lazyProperty by lazy {
        initDone = true
        return@lazy "Value"
    }
    var initDone = false
}
