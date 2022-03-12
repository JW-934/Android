package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// Allows user to roll a die and view the result.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Non default code
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

        // First method
        //val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()

        //val resultTextView: TextView = findViewById(R.id.textView)
        //resultTextView.text = "6"
    }

    // Rolls the die and updates the screen with the result.
    private fun rollDice() {
        // Creates new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Updates the screen with roll value
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}