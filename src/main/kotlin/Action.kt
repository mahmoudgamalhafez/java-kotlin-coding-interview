package org.example

enum class Action {
    ROCK, PAPER, SCISSORS;

    fun beats(other: Action): Boolean {
        return (this == ROCK && other == SCISSORS) ||
                (this == PAPER && other == ROCK) ||
                (this == SCISSORS && other == PAPER)
    }

}