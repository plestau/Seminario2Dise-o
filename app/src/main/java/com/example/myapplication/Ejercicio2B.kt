package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Ejercicio2B : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2_b)
        val numero = findViewById<TextView>(R.id.numeroRecibido)
        val frase = findViewById<TextView>(R.id.textoRecibido)
        val numeroRecibido = intent.getStringExtra("numero")
        val fraseRecibida = intent.getStringExtra("editar")
        numero.setText(numeroRecibido)
        frase.setText(fraseRecibida)
    }
}