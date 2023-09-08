package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pagina1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina1)

        val btn: Button = findViewById(R.id.btnNext2)

        btn.setOnClickListener {
            val intent: Intent = Intent(this, pagina2::class.java)
            startActivity(intent)
        }
    }
}
