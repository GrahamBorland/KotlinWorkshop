import com.gramboid.sayHelloKotlinConf
import kotlin.test.*

class SayHelloKotlinConfTest {
    @Test
    fun testSayHelloCommon() {
        assertEquals(
            "Hello KotlinConf, Kotlin/Multiplatform is awesome!",
            sayHelloKotlinConf().lines().first()
        )
    }
}