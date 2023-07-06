package com.example.washable


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth

class Signupactivity : AppCompatActivity() {
    private lateinit var firstNameEditText: TextInputEditText
    private lateinit var lastNameEditText: TextInputEditText
    private lateinit var emailEditText: TextInputEditText

    private lateinit var passwordEditText: TextInputEditText
    private lateinit var confirmPasswordEditText: TextInputEditText
    private lateinit var registerButton: MaterialButton
    private lateinit var signInButton: TextView
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupactivity)

        firstNameEditText = findViewById(R.id.edtsignupfullname)
        lastNameEditText = findViewById(R.id.edtsignuplastname)
        emailEditText = findViewById(R.id.edtsignupemail)

        passwordEditText = findViewById(R.id.edtsignuppass)
        confirmPasswordEditText = findViewById(R.id.edtsignupconfirmnpass)
        registerButton = findViewById(R.id.buttonsignup)
        signInButton = findViewById(R.id.signinbutton)
        auth = FirebaseAuth.getInstance()




        signInButton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        registerButton.setOnClickListener {
            signupuser()
        }

    }
    private fun signupuser(){
        val email=emailEditText.text.toString()
        val pass=passwordEditText.text.toString()
        val confirmpass =confirmPasswordEditText.text.toString()
        if(email.isBlank()||pass.isBlank()||confirmpass.isBlank()){
            Toast.makeText(this,"Password and Email cant be blank!",Toast.LENGTH_LONG).show()
         return
        }else if (pass != confirmpass){
            Toast.makeText(this,"Password does not match",Toast.LENGTH_LONG).show()
            return
        }
        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if(it.isSuccessful){
                Toast.makeText(this,"Successfully signed up",Toast.LENGTH_LONG).show()
                startActivity(Intent(this, MainActivity3::class.java))
                finish()
            }else{
                Toast.makeText(this," sign up Failed",Toast.LENGTH_LONG).show()

            }}}}