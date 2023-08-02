package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var tex_tv = findViewById<TextView>(R.id.tV2)
        var tex_nama = findViewById<EditText>(R.id.text_Name)
        var start_botton = findViewById<Button>(R.id.start_button)



    }
}