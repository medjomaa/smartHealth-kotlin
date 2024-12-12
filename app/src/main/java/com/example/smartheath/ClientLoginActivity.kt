package com.example.smartheath

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.smartheath.controller.ClientLogActivity
import com.example.smartheath.controller.ClientRegisterActivity

class ClientLoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_login) // Your layout file

        // Initialize buttons
        val buttonLogCl: Button = findViewById(R.id.buttonlogcl)
        val buttonRegCl: Button = findViewById(R.id.buttonregcl)

        // Set onClickListener for login button
        buttonLogCl.setOnClickListener {
            val intent = Intent(this, ClientLogActivity::class.java) // Activity for login
            startActivity(intent)
        }

        // Set onClickListener for register button
        buttonRegCl.setOnClickListener {
            val intent = Intent(this, ClientRegisterActivity::class.java) // Activity for registration
            startActivity(intent)
        }
    }
}

