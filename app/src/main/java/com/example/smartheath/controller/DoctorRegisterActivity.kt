package com.example.smartheath.controller

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.smartheath.R
import android.widget.Toast
import com.example.smarthealth.model.Doctor
import com.example.smarthealth.model.User // Ensure this line is present
import com.example.smarthealth.model.UserRepository

class DoctorRegisterActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var specializationEditText: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_register)

        nameEditText = findViewById(R.id.namedocreg)
        emailEditText = findViewById(R.id.emaildocreg)
        passwordEditText = findViewById(R.id.pwddocreg)
        specializationEditText = findViewById(R.id.specializationdocreg)

        val registerButton: Button = findViewById(R.id.btnregdoc)

        registerButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val specialization = specializationEditText.text.toString()

            // Validate input fields
            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || specialization.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Create a new Doctor instance using composition
            val newDoctor = Doctor(specialization, User(name, email, password))
            UserRepository().saveDoctor(newDoctor)
            Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show()
            // Proceed to login or next activity
        }
    }
}
