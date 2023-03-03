package com.example.dagger.Componant

import com.example.dagger.Analytics.AnalyticsModule
import com.example.dagger.AnalyticsService
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {

    fun getAnalyticsService(): AnalyticsService

}