package com.example.convencoes_ex01

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.convencoes_ex01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonMensagem.setOnClickListener{


            startActivity(Intent(this,MainActivity2::class.java))

        }

        binding.buttonClique.setOnClickListener{

            Toast.makeText(applicationContext,"Botao Clicado", Toast.LENGTH_SHORT).show()

        }
    }
}