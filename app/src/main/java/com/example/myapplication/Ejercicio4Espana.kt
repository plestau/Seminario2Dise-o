package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Ejercicio4Espana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio4_espana)
        val pais = Pais("España", 47000000, R.drawable.espana)
        val nombre = findViewById<android.widget.TextView>(R.id.nombrePais)
        val bandera = findViewById<android.widget.ImageView>(R.id.banderaPais)
        val habitantes = findViewById<android.widget.TextView>(R.id.habitantesPais)
        nombre.text = pais.nombre
        bandera.setImageResource(pais.bandera)
        habitantes.text = pais.habitantes.toString()
    }
}