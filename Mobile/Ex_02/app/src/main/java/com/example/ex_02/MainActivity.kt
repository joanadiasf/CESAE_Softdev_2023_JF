package com.example.ex_02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ex_02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener{

            var celcius: Double = binding.celciusText.text.toString().toDouble()

            var fahrenheit = celcius * 1.8 + 32

            binding.fahrenheitText.text = "$fahrenheit º Fahrenheit"

        }

    }
}