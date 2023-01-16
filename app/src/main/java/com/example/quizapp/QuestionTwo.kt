package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class QuestionTwo : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.q2)

        val btnReset = findViewById<Button>(R.id.btnReset)
        val radioGroup=findViewById<RadioGroup>(R.id.radioGroup)
        var score = intent.getIntExtra("scoreIntent", 0)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        println(score)


        btnSubmit.setOnClickListener {
            //open an alert dialog to show scores
            if(radioGroup.getCheckedRadioButtonId() == -1) {
                //no radio button is checked
                Toast.makeText(this, "Please select an answer for question 2", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(findViewById<RadioButton>(R.id.radioBtn1).isChecked){
                score+=1
            }
            if(findViewById<RadioButton>(R.id.radioBtn2).isChecked){
                score+=0
            }
            if(findViewById<RadioButton>(R.id.radioBtn3).isChecked){
                score+=0
            }
            val intent = Intent(this, Result::class.java)
            intent.putExtra("scoreIntent", score)
            startActivity(intent)

        }

        btnReset.setOnClickListener {
            radioGroup.clearCheck()
        }
    }
}