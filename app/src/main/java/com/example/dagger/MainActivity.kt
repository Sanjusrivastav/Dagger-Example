package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger.UserRepo.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    
     // Field Inject
    @Inject
    lateinit var  userRegistrationService : UserRegistrationService

    @Inject
    lateinit var emailService :EmailService

    @Inject
    lateinit var fireBaseRepository: FireBaseRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         //val component = DaggerUserRegistrationComponent.factory().create(3)
             //.NotificationServiceModule(NotificationServiceModule(3))

//         val component = (application as UserApplication).userRegistrationComponent
//        component.inject(this)

        val appComponent =(application as UserApplication).appComponent
         val userRegistrationComponent = appComponent.getUserRegistrationComponent()
       userRegistrationComponent.inject( this)


        userRegistrationService.registrationUser("SanjanaSrivastav1997@gmail.com","12345")
    }
}