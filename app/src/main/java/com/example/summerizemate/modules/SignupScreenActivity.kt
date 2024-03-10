package com.example.summerizemate.modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.summerizemate.R

class SignupScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val toSignin : TextView = findViewById(R.id.toSignin)
        val back_btn_sgnup : ImageView = findViewById((R.id.back_btn_sgnup))
        val signuppage_btn : Button = findViewById(R.id.signuppage_btn)

        toSignin.setOnClickListener {
            val intent1 = Intent(this, LoginScreenActivity::class.java)
            startActivity(intent1)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

        back_btn_sgnup.setOnClickListener{
            finish()
        }

        signuppage_btn.setOnClickListener {
            val intent = Intent(this,HomeScreenActivity::class.java)
            startActivity(intent)
        }
    }
}