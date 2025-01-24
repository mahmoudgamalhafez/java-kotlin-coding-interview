package org.example.Players

import org.example.Action
import org.example.Player

class Random : Player {
    override fun play() = Action.values().random()
}