package com.example.washable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    private lateinit var signup2btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        signup2btn=findViewById(R.id.button2)

        signup2btn.setOnClickListener {
            val intent = Intent( this,Signupactivity::class.java)
            startActivity(intent)
    }
}}