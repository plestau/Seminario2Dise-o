package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Ejercicio1 : AppCompatActivity() {
    // Declaración de una matriz para representar el tablero
    val tablero = Array(3) { CharArray(3) { ' ' } }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)

        // reinicio de partida
        val resetButton = findViewById<Button>(R.id.resetButton)
        resetButton.setOnClickListener {
            reiniciarJuego()
        }

        // Inicializar el turno (X inicia el juego)
        var turno = 'X'

        // Configurar el OnClickListener de cada botón
        val buttons = Array(9) { findViewById<Button>(resources.getIdentifier("button${it + 1}", "id", packageName)) }

        for (i in 0 until 9) {
            buttons[i].setOnClickListener {
                val tag = buttons[i].tag as String
                if (tag == "empty" && !hayGanador()) {
                    val fila = i / 3
                    val columna = i % 3
                    if (turno == 'X') {
                        buttons[i].setBackgroundResource(R.drawable.x)
                        tablero[fila][columna] = 'X'
                        turno = 'O'
                    } else {
                        buttons[i].setBackgroundResource(R.drawable.o)
                        tablero[fila][columna] = 'O'
                        turno = 'X'
                    }
                    buttons[i].tag = "filled"

                    if (hayGanador()) {
                        mostrarResultado("${if (turno == 'X') 'O' else 'X'} ha ganado.")
                    } else if (tableroLLeno()) {
                        mostrarResultado("Empate")
                    }
                }
            }
        }
    }

    // Función para verificar si hay un ganador
    fun hayGanador(): Boolean {
        // Lógica para verificar las condiciones de victoria (filas, columnas, diagonales)
        for (i in 0 until 3) {
            if (tablero[i][0] != ' ' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
                return true // Ganador en una fila
            }
            if (tablero[0][i] != ' ' && tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) {
                return true // Ganador en una columna
            }
        }
        if (tablero[0][0] != ' ' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
            return true // Ganador en la diagonal principal
        }
        if (tablero[0][2] != ' ' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
            return true // Ganador en la diagonal secundaria
        }
        return false
    }

    // Función para verificar si el tablero está lleno (empate)
    fun tableroLLeno(): Boolean {
        for (fila in tablero) {
            for (casilla in fila) {
                if (casilla == ' ') {
                    return false
                }
            }
        }
        return true
    }

    // Función para mostrar el resultado del juego
    fun mostrarResultado(resultado: String) {
        val resultadoTextView = findViewById<TextView>(R.id.resultado)
        resultadoTextView.text = resultado
        resultadoTextView.visibility = View.VISIBLE
    }

    // Función para reiniciar el juego
    fun reiniciarJuego() {
        // Reiniciar el tablero
        for (fila in tablero) {
            for (i in fila.indices) {
                fila[i] = ' '
            }
        }

        // Reiniciar los botones
        val buttons = Array(9) { findViewById<Button>(resources.getIdentifier("button${it + 1}", "id", packageName)) }
        for (button in buttons) {
            button.setBackgroundResource(R.drawable.roundstyle)
            button.tag = "empty"
        }


        // Ocultar el resultado
        val resultadoTextView = findViewById<TextView>(R.id.resultado)
        resultadoTextView.visibility = View.INVISIBLE
    }
}
