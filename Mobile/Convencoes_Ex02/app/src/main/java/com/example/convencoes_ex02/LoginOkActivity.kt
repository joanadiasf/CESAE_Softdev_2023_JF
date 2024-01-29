package com.example.convencoes_ex02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.convencoes_ex02.databinding.ActivityMainBinding

class LoginOkActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}