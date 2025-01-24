import org.example.Game
import org.example.Players.Random
import org.example.Players.Rock
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class GameTest {
    @Test
    fun gameTest() {
        val playerA = Rock()
        val playerB = Random()
        val game = Game(playerA, playerB)

        game.playRounds(100)

        val totalGames = game.winsA + game.winsB + game.draws
        assertEquals(100, totalGames)
    }
}