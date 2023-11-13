package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Ejercicio2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)
        val boton = findViewById<android.widget.Button>(R.id.boton)
        val editar = findViewById<android.widget.EditText>(R.id.editar)
        val numero = findViewById<TextView>(R.id.numero)
        boton.setOnClickListener {
            val intent = Intent(this, Ejercicio2B::class.java)
            intent.putExtra("numero", numero.text.toString())
            intent.putExtra("editar", editar.text.toString())
            startActivity(intent)
        }
    }
}