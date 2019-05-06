import org.junit.Test
import kotlin.test.assertEquals

class PropertyAccessors {

    @Test
    fun javaPropertyAccessor() {
        //SetterGetterClass is a Java Class
        val setterGetterClass = SetterGetterClass()
        setterGetterClass.value = "Test"
        setterGetterClass.setValue("Test")
        assertEquals(setterGetterClass.value, setterGetterClass.getValue())
    }

    @Test
    fun kotlinProperties() {
        val kotlinPropertyClass = KotlinPropertyClass()
        kotlinPropertyClass.value = "Test"
        assertEquals(kotlinPropertyClass.value, "Test")
    }
}


private class KotlinPropertyClass{
    var value = ""
}
