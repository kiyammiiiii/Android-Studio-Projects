package com.labactivity.simpleloginscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.labactivity.simpleloginscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener(){

            var usernameInput = binding.usernameEditTxt.text.toString()
            var passwordInput = binding.passwordEditTxt.text.toString()

            val defaultUsername = "admin123"
            val defaultPassword = "adminpass123"

            if (usernameInput.isBlank() || passwordInput.isBlank()) {
                Toast.makeText(applicationContext, "Please Enter Username and/or Password", Toast.LENGTH_LONG).show()
            }

            else if(usernameInput == defaultUsername && passwordInput == defaultPassword){
                Toast.makeText(applicationContext, "Logging in", Toast.LENGTH_LONG).show()
            }
            else{
                    Toast.makeText(applicationContext, "Invalid Username and Password", Toast.LENGTH_LONG).show()
                }

        }
    }




}