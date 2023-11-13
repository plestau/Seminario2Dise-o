package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonEjercicio1 = findViewById<android.widget.Button>(R.id.btnEjercicio1)
        botonEjercicio1.setOnClickListener {
            val ejercicio1 = android.content.Intent(this, Ejercicio1::class.java)
            startActivity(ejercicio1)
        }
        val botonEjercicio2 = findViewById<android.widget.Button>(R.id.btnEjercicio2)
        botonEjercicio2.setOnClickListener {
            val ejercicio2 = android.content.Intent(this, Ejercicio2::class.java)
            startActivity(ejercicio2)
        }
        val botonEjercicio3 = findViewById<android.widget.Button>(R.id.btnEjercicio3)
        botonEjercicio3.setOnClickListener {
            val ejercicio3 = android.content.Intent(this, Ejercicio3::class.java)
            startActivity(ejercicio3)
        }
        val botonEjercicio4 = findViewById<android.widget.Button>(R.id.btnEjercicio4)
        botonEjercicio4.setOnClickListener {
            val ejercicio4 = android.content.Intent(this, Ejercicio4::class.java)
            startActivity(ejercicio4)
        }
        val botonEjercicio5 = findViewById<android.widget.Button>(R.id.btnEjercicio5)
        botonEjercicio5.setOnClickListener {
            val ejercicio5 = android.content.Intent(this, Ejercicio5::class.java)
            startActivity(ejercicio5)
        }
        val botonEjercicio6 = findViewById<android.widget.Button>(R.id.btnEjercicio6)
        botonEjercicio6.setOnClickListener {
            val ejercicio6 = android.content.Intent(this, Ejercicio6::class.java)
            startActivity(ejercicio6)
        }
        val botonEjercicio7 = findViewById<android.widget.Button>(R.id.btnEjercicio7)
        botonEjercicio7.setOnClickListener {
            val ejercicio7 = android.content.Intent(this, Ejercicio7::class.java)
            startActivity(ejercicio7)
        }
        val botonEjercicio8 = findViewById<android.widget.Button>(R.id.btnEjercicio8)
        botonEjercicio8.setOnClickListener {
            val ejercicio8 = android.content.Intent(this, Ejercicio8::class.java)
            startActivity(ejercicio8)
        }
    }
}