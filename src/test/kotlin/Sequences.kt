import org.junit.Test
import java.util.stream.Collectors
import kotlin.streams.toList
import kotlin.test.assertEquals

class Sequences {

    @Test
    fun streams() {
        val collection = listOf(1, 2, 3, 4)
        val result = collection.stream()
            .map { it * 2 }
            .collect(Collectors.toList())
    }

    @Test
    fun sequences() {
        val collection = listOf(1, 2, 3, 4)
        val result = collection
            .map { it * 2 }
    }
}
