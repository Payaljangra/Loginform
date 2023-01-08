package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val register= findViewById<Button>(R.id.register)
        register.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        val login = findViewById<Button>(R.id.login)
        login.setOnClickListener{
            val a = Intent(this,MainActivity3::class.java)
            startActivity(a)
        }

    }
}