package com.example.linearlayout_ex4

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.linearlayout_ex4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener{

            var user : String = binding.editUsername.text.toString()
            var pass : String = binding.editPassword.text.toString()

            if (user == "user" && pass == "pass"){

                Toast.makeText(applicationContext," Login valido", Toast.LENGTH_SHORT).show()

            } else if(user == "user" && pass != "pass"){

                Toast.makeText(applicationContext," Password invalida", Toast.LENGTH_SHORT).show()

            }else if (user != "user" && pass == "pass"){

                Toast.makeText(applicationContext," User invalido", Toast.LENGTH_SHORT).show()

            }
            else{
                Toast.makeText(applicationContext," Login invalido", Toast.LENGTH_SHORT).show()
            }


            binding.editUsername.text.clear()
            binding.editPassword.text.clear()
        }
    }
}