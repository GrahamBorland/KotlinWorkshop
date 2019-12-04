import com.gramboid.sayHelloKotlinConf
import kotlin.test.*

class SayHelloKotlinConfJvmTest {
    @Test
    fun testSayHelloJvm() {
        assertEquals(
            "We are running on JVM",
            sayHelloKotlinConf().lines().last()
        )
    }
}