import com.gramboid.*
import kotlin.test.*

class AdditionTests {

    @Test
    fun testSimpleAddition() {
        assertEquals(5, addition(2, 3))
    }

    @Test
    fun testNegativeAddition() {
        assertEquals(-1, addition(2, -3))
    }
}