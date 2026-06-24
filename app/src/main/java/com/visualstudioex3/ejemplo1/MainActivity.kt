package com.visualstudioex3.ejemplo1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Buscar elementos de la interfaz
        val texto = findViewById<TextView>(R.id.textoSaludo)
        val boton = findViewById<Button>(R.id.botonCambiar)

// Acción del botón
        boton.setOnClickListener {
            texto.text = "¡Hola! Has pulsado el botón "
        }
    }
}
