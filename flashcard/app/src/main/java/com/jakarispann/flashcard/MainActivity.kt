package com.jakarispann.flashcard

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var createButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createButton = findViewById(R.id.btnCreate)

        createButton.setOnClickListener {
            val intent = Intent(this, CreateCardActivity::class.java)
            startActivity(intent)
        }
    }
}