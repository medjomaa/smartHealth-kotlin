package com.example.smartheath.controller

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.smartheath.R
import com.example.smarthealth.model.User
import com.example.smarthealth.model.UserRepository

class ClientRegisterActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_register)

        nameEditText = findViewById(R.id.nameclreg)
        emailEditText = findViewById(R.id.emailclreg)
        passwordEditText = findViewById(R.id.pwdclreg)

        val registerButton: Button = findViewById(R.id.btnregcl)

        registerButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            val newUser = User(name, email, password)
            UserRepository().saveUser(newUser)
            Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show()
            // Proceed to login or next activity
        }
    }
}
