package com.example.summerizemate.modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.summerizemate.R
import com.example.summerizemate.modelsheets.editSummeryModel
import com.example.summerizemate.modelsheets.savedSummeryDeleteModel
import com.google.android.material.bottomnavigation.BottomNavigationView

class ViewSavedSummmeryScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_saved_summmery_screen)

        val back_btn_saved_view : ImageView = findViewById(R.id.back_btn_saved_view)
        val bottom_navigation : BottomNavigationView = findViewById(R.id.bottom_navigation)
        val delete_summery_btn : ImageView = findViewById(R.id.delete_summery_btn)
        val edit_summery_btn : ImageView = findViewById(R.id.edit_summery_btn)

        bottom_navigation.selectedItemId = R.id.page_3

        edit_summery_btn.setOnClickListener{
            val summeryModel = editSummeryModel()

            summeryModel.show(supportFragmentManager, editSummeryModel.TAG)
        }

        delete_summery_btn.setOnClickListener{
            val conformDeleteModel = savedSummeryDeleteModel()

            conformDeleteModel.show(supportFragmentManager, savedSummeryDeleteModel.TAG)
        }

        back_btn_saved_view.setOnClickListener{
            finish()
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