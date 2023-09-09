package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.RatingBar
import android.widget.Toast

class pagina5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina5)

        val ratingBar:RatingBar = findViewById(R.id.rankingID)
        val progressBar:ProgressBar = findViewById(R.id.progressID)
        val radioButton1:RadioButton = findViewById(R.id.radioID_1)
        val radioButton2:RadioButton = findViewById(R.id.radioID_2)
        val checkBox:CheckBox = findViewById(R.id.checkID)

        //Barra de progreso
        progressBar.progress = 20
        progressBar.visibility = View.INVISIBLE

        //obtener la califiación seleccionada
        val rating = ratingBar.rating
        ratingBar.numStars = 5
        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            Toast.makeText(this, "Califación: $rating", Toast.LENGTH_SHORT).show()
            //Barra de progreso
            progressBar.visibility = View.VISIBLE
        }

        //Selecciona radio button
        radioButton1.setOnClickListener{
            Toast.makeText(this, "Opción 1 - seleccionada", Toast.LENGTH_SHORT).show()
            progressBar.visibility = View.VISIBLE
        }
        radioButton2.setOnClickListener{
            Toast.makeText(this, "Opción 2 - seleccionada", Toast.LENGTH_SHORT).show()
            progressBar.visibility = View.VISIBLE
        }

        //Checkbox funciones
        checkBox.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked)
            {
                Toast.makeText(this, "Marcado", Toast.LENGTH_SHORT).show()
                progressBar.visibility = View.VISIBLE
            }
            else{
                Toast.makeText(this, "Desmarcado", Toast.LENGTH_SHORT).show()
                progressBar.visibility = View.INVISIBLE
            }
        }


    }
}