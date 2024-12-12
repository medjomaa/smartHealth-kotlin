package com.example.smarthealth.model

data class Doctor(
    val specialization: String,
    val user: User // Ensure this expects a User object
)
