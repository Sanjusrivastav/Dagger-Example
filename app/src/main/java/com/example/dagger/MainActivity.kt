package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        val userRegistrationService = component.getUserRegistrationService()
        val emailService= component.getEmailService()
        val userRepository = component.getUserRepository()

        userRegistrationService.registrationUser("SanjanaSrivastav1997@gmail.com","12345")
    }
}