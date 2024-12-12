package com.example.smartheath

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.smartheath.controller.DoctorLogActivity
import com.example.smartheath.controller.DoctorRegisterActivity

class DoctorLoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_login) // Ensure this matches your layout file name

        // Initialize buttons
        val buttonLogDoc = findViewById<Button>(R.id.buttonlogdoc)
        val buttonRegDoc = findViewById<Button>(R.id.buttonregdoc)

        // Set click listener for login button
        buttonLogDoc.setOnClickListener {
            val intent = Intent(this, DoctorLogActivity::class.java) // Ensure DoctorLogActivity is defined
            startActivity(intent)
        }

        // Set click listener for register button
        buttonRegDoc.setOnClickListener {
            val intent = Intent(this, DoctorRegisterActivity::class.java) // Ensure DoctorRegisterActivity is defined
            startActivity(intent)
        }
    }
}
