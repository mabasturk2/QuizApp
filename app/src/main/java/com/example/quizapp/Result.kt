package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Result : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.score)
        val scoreTxt : TextView = findViewById(R.id.score_text)
        val score = intent.getIntExtra("scoreIntent", 0)
        val startagainBtn : Button = findViewById(R.id.btnStart)
        println(score)
        scoreTxt.apply {
            text = score.toString()
        }
        startagainBtn.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}