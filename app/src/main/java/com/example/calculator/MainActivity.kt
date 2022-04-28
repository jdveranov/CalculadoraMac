package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun pressNumber(view: View) {
        val resultTextView: TextView = findViewById(R.id.resultTextView)
        var result: Double = resultTextView.text.toString().toDouble()

        //When, equivalente a switch en java
        when(view.id){
            R.id.zeroButton -> resultTextView.setText(resultTextView + "0")
            R.id.oneButton -> resultTextView.setText(resultTextView + "1")
            R.id.twoButton -> resultTextView.setText(resultTextView + "2")
            R.id.threeButton -> resultTextView.setText(resultTextView + "3")
            R.id.fourButton -> resultTextView.setText(resultTextView + "4")
            R.id.fiveButton -> resultTextView.setText(resultTextView + "5")
            R.id.sixButton -> resultTextView.setText(resultTextView + "6")
            R.id.sevenButton -> resultTextView.setText(resultTextView + "7")
            R.id.eightButton -> resultTextView.setText(resultTextView + "8")
            R.id.nineButton -> resultTextView.setText(resultTextView + "9")
            R.id.pointButton -> resultTextView.setText(resultTextView + ".")

        }

    }
 }
