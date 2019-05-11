package com.felipejose.imageviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val javaImagem = findViewById<ImageView>(R.id.javaImagem) as ImageView

        javaImagem.setOnClickListener {
            Toast.makeText(this@MainActivity, "Esse é o símbolo da linguagem de programação Java", Toast.LENGTH_SHORT).show()
        }
    }
}
