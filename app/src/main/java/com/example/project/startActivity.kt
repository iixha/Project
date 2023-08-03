package com.example.project

import android.app.Dialog
import android.content.Intent
import android.icu.text.CaseMap.Title
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.project.R.id.text_Name
import com.example.project.databinding.ActivityStartBinding

class startActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityStartBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        addName()


    }
    private fun addName() {
        binding.apply {
            startButton.setOnClickListener{
                startActivity(Intent(this@startActivity, MainActivity11::class.java))
            }
        }
            
        }


    }
