package com.example.smartheath.controller

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.smartheath.R
import com.example.smarthealth.model.UserRepository

class ClientLogActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_log)

        emailEditText = findViewById(R.id.emailcllog)
        passwordEditText = findViewById(R.id.pwdcllog)
        val loginButton: Button = findViewById(R.id.btnlogcl)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            // Logic to authenticate normal user using UserRepository (implement authentication logic)
            val userRepository = UserRepository()
            val user = userRepository.getUser(email) // Implement this method to retrieve user from Firebase

            if (user != null && user.password == password) {
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                // Proceed to next activity (e.g., main screen)
            } else {
                Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
