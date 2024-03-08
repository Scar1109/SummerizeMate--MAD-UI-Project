package com.example.summerizemate.modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.example.summerizemate.R

class OnboardingScreen03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_screen_03)

        val onboardingbtn03 : ImageButton = findViewById(R.id.onboardingbtn03)
        val skipbtn03 : TextView = findViewById(R.id.skipText03)

        onboardingbtn03.setOnClickListener{
            val intent1 = Intent(this, OnStartActivity::class.java)
            startActivity(intent1)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        skipbtn03.setOnClickListener{
            val intent2 = Intent( this, OnStartActivity::class.java)
            startActivity(intent2)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }

}