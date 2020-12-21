package com.example.second_lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun add_click(view: View) {
        val text_num1 = findViewById<TextView>(R.id.editTextTextPersonName).text.toString()
        val text_num2 = findViewById<TextView>(R.id.editTextTextPersonName2).text.toString()

        if (text_num1 == "" || text_num2 == "") {
            val dur = Toast.LENGTH_SHORT;
            val toast = Toast.makeText(applicationContext, R.string.toast_war, dur)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        } else {
            val dur = Toast.LENGTH_SHORT
            val num1: Double = text_num1.toDouble()
            val num2: Double = text_num2.toDouble()

            val toast = Toast.makeText(applicationContext, (num1 + num2).toString(), dur)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }
    }
}