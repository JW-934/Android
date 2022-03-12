package com.example.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.w3c.dom.Text

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloTextView: TextView = findViewById(R.id.hello_world)
        helloTextView.text = "Hello, debugging!"

        //logging()
        division()
    }

    fun division() {
        val numerator = 60
        var denominator = 4
        repeat(4) { // was previously 5 to show dividing by zero errors
            Thread.sleep(1)
            //Log.d(TAG, "$denominator")
            findViewById<TextView>(R.id.division_textview).setText("${numerator / denominator}")
            Log.v(TAG, "${numerator / denominator}")
            denominator--
        }
    }

    fun logging() {
        Log.e(TAG, "ERROR: a serious error like an app crash")
        Log.w(TAG, "WARN: warns about the potential for serious errors")
        Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
        Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
        Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
    }
}