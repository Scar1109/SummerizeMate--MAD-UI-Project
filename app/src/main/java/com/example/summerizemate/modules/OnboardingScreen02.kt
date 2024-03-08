package com.example.summerizemate.modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.example.summerizemate.R

class OnboardingScreen02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_screen_02)

        val onboardingbtn02 : ImageButton = findViewById(R.id.onboardingbtn02)
        val skipbtn02 : TextView = findViewById(R.id.skipText02)

        onboardingbtn02.setOnClickListener{
            val intent1 = Intent(this, OnboardingScreen03::class.java)
            startActivity(intent1)

        }

        skipbtn02.setOnClickListener{
            val intent2 = Intent( this, OnStartScreenActivity::class.java)
            startActivity(intent2)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
}