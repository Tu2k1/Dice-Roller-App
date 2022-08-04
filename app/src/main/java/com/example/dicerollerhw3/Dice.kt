package com.example.dicerollerhw3

class Dice(private val sides: Int) {
    fun roll(): Int = (1..sides).random()
}