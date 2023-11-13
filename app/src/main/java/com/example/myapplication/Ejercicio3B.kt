package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Ejercicio3B : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3_b)
        val cadenas = findViewById<TextView>(R.id.cadenas)
        val lista = intent.getStringExtra("lista")

        cadenas.setText(lista)
    }
}