package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.project.databinding.QuizzieBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:  QuizzieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = QuizzieBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quizzie)



    }
}