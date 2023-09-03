package com.bi.flagmania

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvScore: TextView= findViewById(R.id.tv_score)
        val btnFinish : Button = findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Content.USER_NAME)

        val totalQuestions = intent.getIntExtra(Content.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(Content.CORRECT_ANSWERS,0)

        tvScore.text ="Your score is ${correctAnswers} out of ${totalQuestions}"

        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}