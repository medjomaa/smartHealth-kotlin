package com.example.smartheath.view

import ProfileFragment
import SearchDiseaseFragment
import SearchDoctorFragment
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_client.*

class ClientActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client)

        setSupportActionBar(toolbar)

        buttonProfile.setOnClickListener {
            loadFragment(ProfileFragment())
        }

        buttonSearchDisease.setOnClickListener {
            loadFragment(SearchDiseaseFragment())
        }

        buttonSearchDoctor.setOnClickListener {
            loadFragment(SearchDoctorFragment())
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
