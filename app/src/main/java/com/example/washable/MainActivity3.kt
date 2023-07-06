package com.example.washable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText


import com.google.firebase.auth.FirebaseAuth


class MainActivity3 : AppCompatActivity() {
    private lateinit var emailEditText: TextInputEditText
    private lateinit var passwordEditText: TextInputEditText
    private lateinit var loginButton: MaterialButton
    private lateinit var signupbun:TextView
    private lateinit var auth: FirebaseAuth





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)



        emailEditText = findViewById(R.id.edtloginemail)
        passwordEditText = findViewById(R.id.edtsigninpass)
        loginButton = findViewById(R.id.buttonlog)
        signupbun =findViewById(R.id.signupbutt)
        auth=FirebaseAuth.getInstance()



        signupbun.setOnClickListener {
            val intent = Intent( this,Signupactivity::class.java)
            startActivity(intent)


        }

        loginButton.setOnClickListener {

            login()
        }
    }
    private fun login(){
        val email=emailEditText.text.toString()
        val pass=passwordEditText.text.toString()
        if(email.isBlank()||pass.isBlank()){
            Toast.makeText(this,"Password and Email cant be blank!",Toast.LENGTH_LONG).show()
            return
        }
        auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if(it.isSuccessful){
                Toast.makeText(this, "Successfully signed in", Toast.LENGTH_LONG).show()
                var enda = Intent(this, Homepage::class.java)
                startActivity(enda)
                finish()
                }else{
                Toast.makeText(this," Log in Failed",Toast.LENGTH_LONG).show()


            }
        }
    }






}
