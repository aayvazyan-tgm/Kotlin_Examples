import org.junit.Test
import kotlin.test.assertEquals

class MutabilityInCollections {

    @Test
    fun successTest() {
        val unMutableList = listOf(1, 2, 3)
        val mutableList = mutableListOf(1, 2)
        mutableList.add(3)
        assertEquals(unMutableList.last(), mutableList.last())
    }

}
