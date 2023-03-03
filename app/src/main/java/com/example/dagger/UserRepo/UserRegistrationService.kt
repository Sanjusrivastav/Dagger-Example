package com.example.dagger.UserRepo

import com.example.dagger.NotificationService
import com.example.dagger.UserRepository
import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor (
    private val userRepository: UserRepository,
    @Named ("Message")private val NotificationService : NotificationService
    )
{
    fun registrationUser(email:String ,password:String){
        userRepository.saveUser(email,password)
            NotificationService.send(email,"no-reply","User Registered")



    }

}
/*
Unit Testing
Single Responsibility
Lifetime of  these Object
Extensible
 */




