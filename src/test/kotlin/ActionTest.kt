import org.example.Action
import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.test.Test

class ActionTest {
    @Test
    fun rockVsScissor() {
        assertTrue(Action.ROCK.beats(Action.SCISSORS))
    }

    @Test
    fun paperVsRock() {
        assertTrue(Action.PAPER.beats(Action.ROCK))
    }

    @Test
    fun scissorsVsPaper() {
        assertTrue(Action.SCISSORS.beats(Action.PAPER))
    }
}