package com.example.smartheath.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.smartheath.R

class OptionsActivity : AppCompatActivity() {
    private lateinit var DocLogInButton: Button
    private lateinit var ClientLogInButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)

        // Log In As Doctor
        DocLogInButton = findViewById(R.id.doc_login)
        DocLogInButton.setOnClickListener {
            logInDoctor()
        }

        // Log In As Client
        ClientLogInButton = findViewById(R.id.client_login)
        ClientLogInButton.setOnClickListener {
            logInClient()
        }
    }

    private fun logInDoctor() {
        val intent = Intent(this, DoctorLoginActivity::class.java)
        startActivity(intent)
    }

    private fun logInClient() {
        val intent = Intent(this, ClientLoginActivity::class.java)
        startActivity(intent)
    }
}