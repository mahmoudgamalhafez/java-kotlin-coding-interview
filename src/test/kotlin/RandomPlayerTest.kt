import org.example.Action
import org.example.Players.Random
import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.test.Test

class RandomPlayerTest {
    @Test
    fun randomplayer() {
        val player = Random()
        repeat(10) {
            assertTrue(player.play() in Action.values())
        }
    }
}