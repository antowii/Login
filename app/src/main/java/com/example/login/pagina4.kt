package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pagina4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina4)

        val btnInicio: Button = findViewById(R.id.btnInicio)
        val btn1: Button = findViewById(R.id.btnPrev1)
        val btn2: Button = findViewById(R.id.btnPrev2)
        val btn3: Button = findViewById(R.id.btnPrev3)

        btnInicio.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btn1.setOnClickListener {
            val intent: Intent = Intent(this, pagina1::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent: Intent = Intent(this, pagina2::class.java)
            startActivity(intent)
        }

        btn3.setOnClickListener {
            val intent: Intent = Intent(this, pagina3::class.java)
            startActivity(intent)
        }

    }
}