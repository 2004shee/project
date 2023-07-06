package com.example.washable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class placeorder : AppCompatActivity() {

    private lateinit var EnterOrder:Button


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placeorder)

        EnterOrder=findViewById(R.id.EnterOrder)

        EnterOrder.setOnClickListener {
            val intent = Intent( this,Deliveryinfo::class.java)
            startActivity(intent)


        }


        }


    }



