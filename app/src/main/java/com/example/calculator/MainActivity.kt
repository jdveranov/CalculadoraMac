package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity




class MainActivity : AppCompatActivity() {

    //0 -> nothing, 1->plus, 2-> minus, 3-> multiply, 4-> divide

    var operation: Int = 0
    var number: Double = 0.0
    lateinit var resultTextView: TextView
    lateinit var result2TextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)
        result2TextView = findViewById(R.id.result2TextView)
        val clearButton: Button = findViewById(R.id.clearButton)
        val equalButton: Button = findViewById(R.id.equalButton)

        equalButton.setOnClickListener {
            var number2: Double = resultTextView.text.toString().toDouble()
            var product: Double = 0.0

            when (operation) {
                1 -> product = number + number2
                2 -> product = number - number2
                3 -> product = number * number2
                4 -> product = number / number2
            }

            resultTextView.setText(product.toString())
            result2TextView.setText("")
        }

        clearButton.setOnClickListener {
            result2TextView.setText("")
            resultTextView.setText("")
            number = 0.0
            operation = 0
        }
    }

    fun pressNumber(view: View) {
        //val resultTextView: TextView = findViewById(R.id.resultTextView)
        var result: String = resultTextView.text.toString()

        //When, equivalente a switch en java
        when (view.id) {
            R.id.zeroButton -> resultTextView.setText(result + "0")
            R.id.oneButton -> resultTextView.setText(result + "1")
            R.id.twoButton -> resultTextView.setText(result + "2")
            R.id.threeButton -> resultTextView.setText(result + "3")
            R.id.fourButton -> resultTextView.setText(result + "4")
            R.id.fiveButton -> resultTextView.setText(result + "5")
            R.id.sixButton -> resultTextView.setText(result + "6")
            R.id.sevenButton -> resultTextView.setText(result + "7")
            R.id.eightButton -> resultTextView.setText(result + "8")
            R.id.nineButton -> resultTextView.setText(result + "9")
            R.id.pointButton -> resultTextView.setText(result + ".")

        }

    }

    fun clickOperation(view: View) {
        number = resultTextView.text.toString().toDouble()
        var result2: String = resultTextView.text.toString()
        resultTextView.setText("")

        when (view.id) {
            R.id.plusButton -> {
                result2TextView.setText(result2 + "+")
                operation = 1
            }
            R.id.minusButton -> {
                result2TextView.setText(result2 + "-")
                operation = 2
            }
            R.id.multiplyButton -> {
                result2TextView.setText(result2 + "*")
                operation = 3
            }
            R.id.divisionButton -> {
                result2TextView.setText(result2 + "/")
                operation = 4
            }
        }
    }
}