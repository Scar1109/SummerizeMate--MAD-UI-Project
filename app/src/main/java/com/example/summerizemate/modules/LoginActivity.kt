package com.example.summerizemate.modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.summerizemate.R
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val toSignup : TextView = findViewById(R.id.toSignup_btn)
        val back_btn_login : ImageView = findViewById(R.id.back_btn_login)
        val inputEmail : TextInputLayout = findViewById(R.id.inputEmail)
        val inputPwd : TextInputLayout = findViewById(R.id.inputPwd)

        val loginpage_btn : Button = findViewById(R.id.loginpage_btn)


        toSignup.setOnClickListener{
            val intent1 = Intent(this, SignupActivity::class.java)
            startActivity(intent1)
        }

        back_btn_login.setOnClickListener{
            finish();
        }

        loginpage_btn.setOnClickListener{
            Toast.makeText(this, "Hello, ${inputEmail.editText?.text.toString()}, ${inputPwd.editText?.text.toString()}", Toast.LENGTH_LONG).show()
        }



    }
}