package com.example.summerizemate.modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.summerizemate.R
import com.example.summerizemate.modelsheets.editPasswordModel
import com.example.summerizemate.modelsheets.editProfileModel
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_screen)

        val bottom_navigation : BottomNavigationView = findViewById(R.id.bottom_navigation)
        val logout_btn : ImageView = findViewById(R.id.logout_btn)
        val edit_profile_btn : Button = findViewById(R.id.edit_profile_btn)
        val change_pwd_btn : Button = findViewById(R.id.change_pwd_btn)

        change_pwd_btn.setOnClickListener {
            val editPwd = editPasswordModel()

            editPwd.show(supportFragmentManager,editPasswordModel.TAG)
        }

        edit_profile_btn.setOnClickListener {
            val editProfile = editProfileModel()

            editProfile.show(supportFragmentManager,editProfileModel.TAG)
        }

        logout_btn.setOnClickListener{
            val intent = Intent(this, OnStartScreenActivity::class.java)
            startActivity(intent)
        }

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