package com.example.summerizemate.modules

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.summerizemate.R
import com.example.summerizemate.modelsheets.resultModelSheet
import com.google.android.material.bottomnavigation.BottomNavigationView

class ResultScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_screen)

        val summery = "Your text here"

        val bottom_navigation : BottomNavigationView = findViewById(R.id.bottom_navigation)
        val ans_back_btn : ImageView = findViewById(R.id.ans_back_btn)
        val copy_btn : Button = findViewById(R.id.copy_btn)
        val result_view : EditText = findViewById(R.id.result_view)
        val saveButton: Button = findViewById(R.id.save_btn)
        val share_btn : Button = findViewById(R.id.share_btn)

        share_btn.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, summery)
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }

        saveButton.setOnClickListener {
            val resultModel = resultModelSheet()

            resultModel.show(supportFragmentManager, resultModelSheet.TAG)
        }

        result_view.setText(summery)

        ans_back_btn.setOnClickListener{
            finish()
        }

        copy_btn.setOnClickListener {

            val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clipData = ClipData.newPlainText("text", summery)
            clipboardManager.setPrimaryClip(clipData)

            Toast.makeText(this, "Text copied to clipboard", Toast.LENGTH_SHORT).show()
        }

        bottom_navigation.selectedItemId = R.id.page_1


        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_1 -> {
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
                    val intent = Intent(this, ProfileScreenActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
                    true
                }
                else -> false
            } }
    }
}