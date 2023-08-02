package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project.databinding.ActivityQuizzieBinding

class activity_quizzie : AppCompatActivity() {
    private lateinit var Binding:  ActivityQuizzieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Binding = ActivityQuizzieBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(Binding.root)
        addName()
    }
    private fun  addName() {
         Binding.apply {
           button.setOnClickListener{
               startActivity(Intent(this@activity_quizzie, activity_quiz::class.java))
           }
         }
         }

       }