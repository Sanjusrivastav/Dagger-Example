package com.example.dagger.Componant

import com.example.dagger.Analytics.AnalyticsModule
import com.example.dagger.AnalyticsService
import com.example.dagger.ApplicationScope
import com.example.dagger.Mixpanel
import dagger.Component
import dagger.Provides
import dagger.Subcomponent
import javax.inject.Singleton


@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {

    fun getUserRegistrationComponent() : UserRegistrationComponent
    //fun getAnalyticsService(): AnalyticsService

}