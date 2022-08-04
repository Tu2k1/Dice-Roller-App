package com.example.dicerollerhw3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceNumber: TextView = findViewById(R.id.dice_number)
        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener {
            Toast.makeText(
                this,
                "Dice Rolled",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}