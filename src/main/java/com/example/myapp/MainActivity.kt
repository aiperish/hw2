package com.example.myapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isMinus = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setMinusOperator()
    }
    private fun calculate() {
        summarize.setOnClickListener{
            val first = edit_textFirst?.text.toString().toInt()
            val second = edit_textSecond?.text.toString().toInt()
            var result = first + second

            if(isMinus) result = first-second
            else result = first + second

            edit_textFirst?.text?.clear()
            edit_textSecond?.text?.clear()
            text_view?.text = result.toString()
        }

    }

    private fun setMinusOperator() {
        minus_button.setOnClickListener {
            isMinus = true

        }

    }

    private fun plusMinusOperator() {
        plus_button.setOnClickListener {
            isMinus = false

        }

    }
}




