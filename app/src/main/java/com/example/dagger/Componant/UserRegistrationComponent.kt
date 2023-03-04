package com.example.dagger.Componant

import com.example.dagger.ActivityScope
import com.example.dagger.MainActivity
import com.example.dagger.Notification.NotificationServiceModule
import com.example.dagger.UserRepo.UserRepositoryModule
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

 @ActivityScope
 //@Subcomponent ( modules =[UserRepositoryModule::class, NotificationServiceModule::class])
 @Component (dependencies = [AppComponent::class], modules = [UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun inject (mainActivity: MainActivity) // mainActivity is a Consumer


// @Subcomponent.Factory
//    interface Factory{
//        fun create (@BindsInstance retryCount : Int) : UserRegistrationComponent
//    }

//    @Component.Builder
//    interface Builder
//     fun build() :UserRegistrationComponent
//
//     fun retryCount(@BindsInstance retryCount: Int): Builder
//
//     fun appComponent(appComponent: AppComponent) :Builder
}