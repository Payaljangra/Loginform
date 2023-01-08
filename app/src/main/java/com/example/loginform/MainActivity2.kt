package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val view1 = findViewById<TextView>(R.id.txt1)
        val view2 = findViewById<TextView>(R.id.txt2)
        val firstname = findViewById<EditText>(R.id.firstname)
        val lastname = findViewById<EditText>(R.id.lastname)
        val mailid = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val radioGroup = findViewById<RadioGroup>(R.id.rg)
        val rb1 = findViewById<RadioButton>(R.id.rb1)
        val rb2 = findViewById<RadioButton>(R.id.rb2)
        val rb3 = findViewById<RadioButton>(R.id.rb3)
        val checkBox = findViewById<CheckBox>(R.id.checkbox)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val id2= spinner.onItemSelectedListener

        val select = arrayOf("Select Country","Afghanistan","America","India","Brazil")
        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,select)
        spinner.adapter = adapter

        val login_btn = findViewById<Button>(R.id.login_btn)
        login_btn.setOnClickListener{
            val l = Intent(this,MainActivity::class.java)
            startActivity(l)

        }

        val signup_button = findViewById<Button>(R.id.Signup_btn)
        signup_button.setOnClickListener{
            val id1 =radioGroup.checkedRadioButtonId
            val id2 = checkBox.isChecked
            if(firstname.text.toString().isEmpty() || lastname.text.toString().isEmpty() || mailid.text.toString().isEmpty() || password.text.toString().isEmpty() || id1<0 )
            {
                Toast.makeText(applicationContext,"Please enter all the details",Toast.LENGTH_SHORT).show()
            }
            if(id2==false)
            {
                Toast.makeText(applicationContext,"Please check the box",Toast.LENGTH_SHORT).show()
            }

            else {
                val id3 = spinner.onItemSelectedListener
                val s = Intent(this, MainActivity3::class.java)
                s.putExtra("Firstname", firstname.text.toString())
                s.putExtra("Lastname", lastname.text.toString())
                s.putExtra("email", mailid.text.toString())
                s.putExtra("password", password.text.toString())
                s.putExtra("country",id3.toString())
                startActivity(s)
            }

        }


    }
}