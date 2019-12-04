import com.gramboid.sayHelloKotlinConf
import kotlin.test.*

class SayHelloKotlinConfLinuxTest {
    @Test
    fun testSayHelloLinux() {
        assertEquals(
            "We are running on MacOS",
            sayHelloKotlinConf().lines().last()
        )
    }
}