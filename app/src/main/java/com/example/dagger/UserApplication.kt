package com.example.dagger

import android.app.Application
import com.example.dagger.Componant.AppComponent
import com.example.dagger.Componant.DaggerAppComponent

class UserApplication:Application (){
     lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().build()

    }
}