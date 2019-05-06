import kotlinx.coroutines.*
import org.junit.Test
import kotlin.test.assertEquals

class ZCoroutines {

    @Test
    fun coroutine() {
        GlobalScope.launch {
            delay(1000)
            println("Hello")
        }
        Thread.sleep(2000)
        println("World!")
    }

    @Test
    fun lightWeight() {
        val deferredList = (1..1_000_000).map {
            GlobalScope.async {
                it
            }
        }
        runBlocking {
            println(deferredList.awaitAll().sum())
        }
    }

    @Test
    fun delaysFreeThreads() {
        val result = runBlocking {
            getIntegerAfterSecond()
        }
        assertEquals(result, 1)
    }

    private suspend fun getIntegerAfterSecond(): Int {
        delay(1000)
        return 1
    }
}
