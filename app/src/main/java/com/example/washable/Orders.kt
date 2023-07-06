package com.example.washable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Orders : AppCompatActivity() {

        private lateinit var placeorderbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders)

        placeorderbtn=findViewById(R.id.PlaceOrder)
        placeorderbtn.setOnClickListener {
            val intent = Intent( this,placeorder::class.java)
            startActivity(intent)
    }
}}