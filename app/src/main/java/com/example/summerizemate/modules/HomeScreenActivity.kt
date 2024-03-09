package com.example.summerizemate.modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.summerizemate.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.slider.Slider
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class HomeScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        val summery_size : Slider = findViewById(R.id.summery_size)
        val bottom_navigation : BottomNavigationView = findViewById(R.id.bottom_navigation)
        val greeting : TextView = findViewById(R.id.greeting)
        val date : TextView = findViewById(R.id.date)
        val time_img : ImageView = findViewById(R.id.time_img)
        val summey_btn : Button = findViewById(R.id.summey_btn)

        val currentTime = Calendar.getInstance()
        val currentHour = currentTime.get(Calendar.HOUR_OF_DAY)

        val greetingMessage = when (currentHour) {
            in 6..11 -> "Good morning"
            in 12..16 -> "Good afternoon"
            else -> "Good evening"
        }
        greeting.text = greetingMessage

        // Format date
        val dateFormat = SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.getDefault())
        val formattedDate = dateFormat.format(currentTime.time)
        date.text = formattedDate

        val imageResId = if (currentHour in 6..17) {
            // Daytime, show sun image
            R.drawable.sun_icon
        } else {
            // Nighttime, show moon image
            R.drawable.moon_icon
        }

        time_img.setImageResource(imageResId)

        summey_btn.setOnClickListener{
            val intent = Intent(this, ResultScreenActivity::class.java)
            startActivity(intent)
        }

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