package org.example

class Game(private val playerA: Player, private val playerB: Player) {
    var winsA = 0
    var winsB = 0
    var draws = 0

    fun playRounds(rounds: Int) {
        repeat(rounds) {
            val actionA = playerA.play()
            val actionB = playerB.play()

            when {
                actionA.beats(actionB) -> winsA++
                actionB.beats(actionA) -> winsB++
                else -> draws++
            }
        }
    }

    fun printResults(rounds: Int) {
        println("Player A wins $winsA of $rounds games")
        println("Player B wins $winsB of $rounds games")
        println("Draws: $draws of $rounds games")
    }
}
