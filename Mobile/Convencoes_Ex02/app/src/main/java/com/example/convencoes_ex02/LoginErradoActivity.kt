package com.example.convencoes_ex02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginErradoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.activity_login_errado)


        val  voltaMain: Button = findViewById( R.id.buttonRetry)
        Toast.makeText(applicationContext,"Login Errado!", Toast.LENGTH_SHORT).show()

        voltaMain.setOnClickListener{

            startActivity(Intent(this,MainActivity::class.java))

        }


        }

    }