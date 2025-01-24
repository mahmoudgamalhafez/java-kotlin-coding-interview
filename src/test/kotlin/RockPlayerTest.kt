import org.example.Action
import org.example.Players.Rock
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class RockPlayerTest {
    @Test
    fun rockplayer() {
        val player = Rock()
        assertEquals(Action.ROCK, player.play())
    }
}