package com.example.smarthealth.model

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class UserRepository {
    private val database: DatabaseReference = FirebaseDatabase.getInstance().reference

    fun saveUser(user: User) {
        val userId = database.child("users").push().key // Generate unique ID for user
        if (userId != null) {
            database.child("users").child(userId).setValue(user)
        }
    }

    fun saveDoctor(doctor: Doctor) {
        val doctorId = database.child("doctors").push().key // Generate unique ID for doctor
        if (doctorId != null) {
            database.child("doctors").child(doctorId).setValue(doctor)
        }
    }

    fun getUser(email: String): User? {
        // Implement retrieval logic from Firebase here (not shown for brevity)
        return null // Placeholder return value; implement actual retrieval logic.
    }

    fun getDoctor(email: String): Doctor? {
        // Implement retrieval logic from Firebase here.
        // This is just a placeholder; replace it with actual Firebase retrieval logic.

        // Example of creating a Doctor with a User for demonstration purposes:
        return Doctor(
            specialization = "General Medicine",
            user = User(name = "Dr. Smith", email = email, password = "examplePassword") // Replace with actual data retrieval
        )
    }
}
