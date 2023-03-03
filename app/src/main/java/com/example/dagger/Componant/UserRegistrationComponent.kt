package com.example.dagger.Componant

import com.example.dagger.ApplicationScope
import com.example.dagger.MainActivity
import com.example.dagger.Notification.NotificationServiceModule
import com.example.dagger.UserRepo.UserRepositoryModule
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component (dependencies = [AppComponent::class], modules =[UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent : AppComponent {

    fun inject (mainActivity: MainActivity) // mainActivity is a Consumer


@Component.Factory
    interface Factory{
        fun create (@BindsInstance retryCount : Int,appComponent: AppComponent) : UserRegistrationComponent
    }
}