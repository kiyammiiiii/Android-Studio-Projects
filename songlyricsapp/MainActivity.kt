package com.labactivity.songlyricsapp

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.songlyricsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.background)

            binding.videoView.setVideoURI(videoUri)
            binding.videoView.start()

        binding.videoView.setOnPreparedListener{ mediaPlayer ->
            mediaPlayer.isLooping = true
        }


        binding.firstSongBtn.setOnClickListener(){
            val intent1 = Intent(this, MainActivity2::class.java)
            intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent1)
        }

        binding.scnSongBtn.setOnClickListener() {
            val intent2 = Intent(this, MainActivity3::class.java)
            intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent2)
        }

        binding.thrdSondBtn.setOnClickListener() {
            val intent3 = Intent(this, MainActivity4::class.java)
            intent3.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent3)
        }

        binding.frtSongButton.setOnClickListener() {
            val intent4 = Intent(this, MainActivity5::class.java)
            intent4.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent4)
        }

        binding.ftfSongButton.setOnClickListener() {
            val intent5 = Intent(this, MainActivity6::class.java)
            intent5.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent5)

        }

    }



}


