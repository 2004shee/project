package com.example.washable



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Homepage : AppCompatActivity() {
    private lateinit var orderbtn: Button
    private lateinit var vieworderbtn: Button
    private lateinit var deliveryinfobtn:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        orderbtn=findViewById(R.id.btnOrderNow)
        vieworderbtn=findViewById(R.id.btnViewOrders)
        deliveryinfobtn=findViewById(R.id.btnManageAccount)


        orderbtn.setOnClickListener {
            val intent = Intent( this,placeorder::class.java)
            startActivity(intent)


        }
        vieworderbtn.setOnClickListener {
            val intent = Intent( this,Orders::class.java)
            startActivity(intent)


        }

        deliveryinfobtn.setOnClickListener {
            val intent = Intent( this,Deliveryinfo::class.java)
            startActivity(intent)


        }}}

