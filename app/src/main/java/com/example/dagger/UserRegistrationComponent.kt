package com.example.dagger

import dagger.Component


@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService() : UserRegistrationService

    fun getEmailService(): EmailService

    fun getUserRepository(): UserRepository


}