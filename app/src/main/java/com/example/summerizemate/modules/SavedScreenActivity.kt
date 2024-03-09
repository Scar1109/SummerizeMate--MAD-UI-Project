package com.example.summerizemate.modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.summerizemate.R
import com.example.summerizemate.modelsheets.saveConformationModel
import com.example.summerizemate.modelsheets.savedSummeryDeleteModel
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.card.MaterialCardView

class SavedScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved_screen)

        val bottom_navigation : BottomNavigationView = findViewById(R.id.bottom_navigation)
        val delete_btn_1 : ImageView = findViewById(R.id.delete_btn_1)
        val card_view_1 : MaterialCardView = findViewById(R.id.card_view_1)

        bottom_navigation.selectedItemId = R.id.page_3

        delete_btn_1.setOnClickListener {
            val conformDeleteModel = savedSummeryDeleteModel()

            conformDeleteModel.show(supportFragmentManager, savedSummeryDeleteModel.TAG)
        }

        card_view_1.setOnClickListener{
            val intent = Intent(this, ViewSavedSummmeryScreen::class.java)
            startActivity(intent)
        }


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
                    true
                }
                R.id.page_4 -> {
                    val intent = Intent(this, ProfileScreenActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
                    true
                }
                else -> false
            } }

    }
}