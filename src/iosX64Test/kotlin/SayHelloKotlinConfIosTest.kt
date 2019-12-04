import com.gramboid.sayHelloKotlinConf
import kotlin.test.*

class SayHelloKotlinConfIosTest {
    @Test
    fun testSayHelloIos() {
        assertEquals(
            "We are running on iOS",
            sayHelloKotlinConf().lines().last()
        )
    }
}