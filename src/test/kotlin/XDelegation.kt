import org.junit.Test
import kotlin.test.assertEquals

class XDelegation {
    //A alternative to extending classes or using boiler plate code
    @Test
    fun delegate() {
        val person = Person(MyName())
        assertEquals(person.name, "Ari")
    }
}

private interface Nameable {
    var name: String
}

private class MyName : Nameable {
    override var name = "Ari"
}

private class Person(nameProvider: Nameable) : Nameable by nameProvider

private class AlternativePerson(val nameProvider: Nameable) : Nameable {
    override var name: String
        get() = nameProvider.name
        set(value) {
            nameProvider.name = value
        }
}
