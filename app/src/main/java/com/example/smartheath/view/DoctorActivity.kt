package com.example.smartheath.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.smartheath.R
import kotlinx.android.synthetic.main.activity_doctor.*

class DoctorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor)

        setSupportActionBar(toolbar)

        buttonProfileDoc.setOnClickListener {
            loadFragment(ProfileDocFragment())
        }

        buttonViewDisease.setOnClickListener {
            loadFragment(ViewDiseaseFragment())
        }

        buttonViewPatient.setOnClickListener {
            loadFragment(ViewPatientFragment())
        }

        buttonLogout.setOnClickListener {
            // Handle logout functionality
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
