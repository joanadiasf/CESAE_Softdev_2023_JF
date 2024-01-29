package com.example.ex3_doisnomes

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ex3_doisnomes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {

            val nome: String = binding.primeiroNome.text.toString()
            val ultimoNome: String = binding.ultimoNome.text.toString()


            if (nome.isEmpty()) {
               // binding.textOla.text = "Primeiro Nome nao inserido"
                Toast.makeText(applicationContext,"Primeiro Nome nao inserido",Toast.LENGTH_SHORT).show()

            } else if (ultimoNome.isEmpty()) {
               // binding.textOla.text = "Ultimo Nome nao inserido"
                Toast.makeText(applicationContext,"Ultimo Nome nao inserido",Toast.LENGTH_SHORT).show()
            } else {
               // binding.textOla.text = "Olá $nome $ultimoNome"
                Toast.makeText(applicationContext,"Olá $nome $ultimoNome",Toast.LENGTH_SHORT).show()
            }

        }
    }
}