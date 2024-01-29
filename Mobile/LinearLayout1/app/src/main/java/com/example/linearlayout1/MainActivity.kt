package com.example.linearlayout1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.linearlayout1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.botaoDolar.setOnClickListener{

            var euros: Double = binding.editValorEuros.text.toString().toDouble()
            var taxaConversao : Double = 1.09

            var dolares : Double = euros * taxaConversao
            dolares = String.format("%.2f",euros*0.8).toDouble()

            val amount = ""
            val escapedString = " ${'$'}$amount"

          // binding.textValorDolares.text= "$escapedString $dolares"

            Toast.makeText(applicationContext," $escapedString $dolares ",Toast.LENGTH_SHORT).show()
        }

        binding.botaoReal.setOnClickListener{

            var euros: Double = binding.editValorEuros.text.toString().toDouble()
            var taxaConversao : Double = 4.40

            var reais : Double = euros * taxaConversao
            reais + String.format("%.2f",euros*0.8).toDouble()  //R$

            val amount = ""
            val escapedString = " R${'$'}$amount"

           // binding.textValorDolares.text= "$escapedString $reais"
            Toast.makeText(applicationContext," $escapedString $reais ",Toast.LENGTH_SHORT).show()
        }

        binding.botaoPeso.setOnClickListener{

            var euros: Double = binding.editValorEuros.text.toString().toDouble()
            var taxaConversao : Double = 31.50

            var peso : Double = euros * taxaConversao
            peso + String.format("%.2f",euros*0.8).toDouble()

            val amount = ""
            val escapedString = " ${'$'}$amount"

           // binding.textValorDolares.text= "$escapedString $peso"
            Toast.makeText(applicationContext," $escapedString $peso ",Toast.LENGTH_SHORT).show()
        }
    }
}