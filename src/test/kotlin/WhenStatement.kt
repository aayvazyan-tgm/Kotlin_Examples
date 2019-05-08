import org.junit.Test
import kotlin.test.fail

class WhenStatement {

    @Test
    fun whenStatement() {
        val myNum = 1
        when (myNum) {
            1234 -> fail()
            in 1..5 -> println("success")
            is Number -> println("is a Number")
            else -> fail()
        }

        when {
            1 < 2 -> println("1 < 2")
        }
    }

}
