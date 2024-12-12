package com.example.smartheath.controller

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.smartheath.R
import com.example.smarthealth.model.UserRepository

class DoctorLogActivity : AppCompatActivity() {
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_log)

        emailEditText = findViewById(R.id.emaildoclog)
        passwordEditText = findViewById(R.id.pwddoclog)

        val loginButton: Button = findViewById(R.id.btnlogdoc)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            val userRepository = UserRepository()
            val doctor = userRepository.getDoctor(email)

            if (doctor != null && doctor.user.password == password) { // Accessing password from User object
                Toast.makeText(this, "Doctor Login successful. Welcome, ${doctor.user.name}!", Toast.LENGTH_SHORT).show()
                // Proceed to next activity (e.g., doctor's dashboard)
            } else {
                Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
