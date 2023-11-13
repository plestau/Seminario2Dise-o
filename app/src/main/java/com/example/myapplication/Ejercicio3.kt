package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Ejercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)
        var lista = mutableListOf<String>()
        val insertar = findViewById<Button>(R.id.insertar)
        val cadena = findViewById<EditText>(R.id.cadena)
        val insertadas = findViewById<TextView>(R.id.insertadas)
        val nuevaActividad = findViewById<Button>(R.id.nuevaActividad)

        insertar.setOnClickListener {
            lista.add(cadena.text.toString())
            cadena.setText("")
            insertadas.setText(lista.toString())
        }

        nuevaActividad.setOnClickListener {
            val intent = android.content.Intent(this, Ejercicio3B::class.java)
            intent.putExtra("lista", lista.toString())
            startActivity(intent)
        }
    }
}