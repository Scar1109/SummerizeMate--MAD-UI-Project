package com.example.summerizemate.modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.summerizemate.R

class OnStartScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.on_start)

        val signup_btn : Button = findViewById(R.id.signup_btn)
        val login_btn : Button = findViewById(R.id.login_btn)

        signup_btn.setOnClickListener{
            val intent1 = Intent(this,SignupScreenActivity::class.java)
            startActivity(intent1)
        }

        login_btn.setOnClickListener{
            val intent2 = Intent(this, LoginScreenActivity::class.java)
            startActivity(intent2)
        }
    }
}