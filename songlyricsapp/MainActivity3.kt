package com.labactivity.songlyricsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.songlyricsapp.databinding.ActivityMain3Binding
import com.labactivity.songlyricsapp.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.backbtn.setOnClickListener(){
            val intent1 = Intent(this, MainActivity::class.java)
            intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent1)
        }
    }
}