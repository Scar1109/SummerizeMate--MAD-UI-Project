package com.example.summerizemate.modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.summerizemate.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.slider.Slider

class HomeScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val summery_size : Slider = findViewById(R.id.summery_size)
        val bottom_navigation : BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottom_navigation.selectedItemId = R.id.page_1

        summery_size.addOnChangeListener { slider, value, fromUser ->
            Toast.makeText(this, "Hello, ${value}",Toast.LENGTH_LONG).show()
        }

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_1 -> {
                    true
                }
                R.id.page_2 -> {
                    val intent = Intent(this, OnboardingScreen01::class.java)
                    startActivity(intent)
                    true
                }
                R.id.page_3 -> {
                    val intent = Intent(this, OnboardingScreen02::class.java)
                    startActivity(intent)
                    true
                }
                R.id.page_4 -> {
                    val intent = Intent(this, OnboardingScreen03::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            } }
    }
}