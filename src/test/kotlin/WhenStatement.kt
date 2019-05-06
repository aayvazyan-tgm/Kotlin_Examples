import org.junit.Test
import kotlin.test.fail

class WhenStatement {

    @Test
    fun successTest() {
        val myString = "expected"
        when (myString) {
            "1" -> fail()
            "expected" -> print("success")
            else -> fail()
        }
    }

}
