package com.example.summerizemate.modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.summerizemate.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_screen)

        val bottom_navigation : BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottom_navigation.selectedItemId = R.id.page_4

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_1 -> {
                    val intent = Intent(this, HomeScreenActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
                    true
                }
                R.id.page_2 -> {
                    val intent = Intent(this, RecentScreenActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
                    true
                }
                R.id.page_3 -> {
                    val intent = Intent(this, SavedScreenActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
                    true
                }
                R.id.page_4 -> {
                    true
                }
                else -> false
            } }
    }
}