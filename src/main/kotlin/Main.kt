package org.example

import org.example.Players.Random
import org.example.Players.Rock

fun main() {
    val playerA = Rock()
    val playerB = Random()

    val game = Game(playerA, playerB)
    game.playRounds(100)
    game.printResults(100)
}