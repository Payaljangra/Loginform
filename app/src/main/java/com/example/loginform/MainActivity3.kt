package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val firstname = findViewById<TextView>(R.id.txt1)
        val lastname = findViewById<TextView>(R.id.txt2)
        val email = findViewById<TextView>(R.id.txt3)
        val password = findViewById<TextView>(R.id.txt4)
        val country = findViewById<TextView>(R.id.txt5)
        val fname = intent.getStringExtra("Firstname")
        val Lname = intent.getStringExtra("Lastname")
        val emailID = intent.getStringExtra("email")
        val pass = intent.getStringExtra("password")
        val cuntry = intent.getStringExtra("country")
        firstname.text = "Username : "+fname
        lastname.text = "Lastname : "+Lname
        email.text = "Email Id : "+emailID
        password.text="Password : "+pass
        country.text="Country : "+cuntry

    }
}