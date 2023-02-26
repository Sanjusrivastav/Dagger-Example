package com.example.dagger

import javax.inject.Inject

class UserRegistrationService @Inject constructor (
    private val emailService: EmailService,
    private val userRepository: UserRepository
    )
{
    fun registrationUser(email:String ,password:String){
        emailService.send(email,"no-reply","User Registered")
        userRepository.saveUser(email,password)


    }

}
/*
Unit Testing
Single Responsibility
Lifetime of  these Object
Extensible
 */




