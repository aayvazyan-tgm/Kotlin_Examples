import org.junit.Test
import kotlin.test.assertEquals

private class MyContainer {
    class MyInnerClass {
        //static
        companion object {
            val property = "test"
        }
    }
}

private typealias MyAlias = MyContainer.MyInnerClass

class TypeAliasExample {
    @Test
    fun f() {
        assertEquals(MyContainer.MyInnerClass.property, MyAlias.property)
    }
}
