package com.example.ex_01

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ex_01.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.buttonConvert.setOnClickListener{

            var euros: Double = binding.editValor.text.toString().toDouble()
            var taxaConversao : Double = 1.09

            var dolares : Double = euros * taxaConversao
            dolares = String.format("%.2f",euros*0.8).toDouble()

            val amount = "25"
            val escapedString = "~ ${'$'}$amount"

            binding.textView.text= "$escapedString + $dolares"
        }
    }
}