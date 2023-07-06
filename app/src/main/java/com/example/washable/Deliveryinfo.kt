package com.example.washable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class Deliveryinfo : AppCompatActivity() {
    private lateinit var orderconfirm: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deliveryinfo)
       orderconfirm=findViewById(R.id.submitButton)

       orderconfirm.setOnClickListener {
            val intent = Intent( this,Orderplaced::class.java)
            startActivity(intent)

        }
}}