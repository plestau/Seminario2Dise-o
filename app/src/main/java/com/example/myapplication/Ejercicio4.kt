package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pais(val nombre: String, val habitantes: Int, val bandera: Int) : Parcelable

class Ejercicio4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio4)
        val españa = findViewById<android.widget.Button>(R.id.españa)
        val francia = findViewById<android.widget.Button>(R.id.francia)


        españa.setOnClickListener {
            val intent = android.content.Intent(this, Ejercicio4Espana::class.java)
            startActivity(intent)
        }

        francia.setOnClickListener {
            val intent = android.content.Intent(this, Ejercicio4Francia::class.java)
            startActivity(intent)
        }
    }
}