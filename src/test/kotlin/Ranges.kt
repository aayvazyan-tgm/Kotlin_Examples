import org.junit.Test
import java.util.*

class Ranges {

    @Test
    fun simpleRange() {
        for (i in 4..6) {
            assert(i in 4..6)
        }
    }

    @Test
    fun rangeStep() {
        for (i in 4..9 step 2) {
            println(i)
            assert(i in 4..8)
            assert(i % 2 == 0)
        }
    }

    @Test
    fun rangeVar() {
        val range = 1..4
        range.map {it + 20 }
            .forEach { assert(it in 21..24) }
    }

    @Test
    fun dates() {
        assert(Date(1_000) in Date(0)..Date(10_000))
    }
}
