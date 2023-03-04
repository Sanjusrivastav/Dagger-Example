package com.example.dagger.Analytics

import com.example.dagger.AnalyticsService
import com.example.dagger.ApplicationScope
import com.example.dagger.Mixpanel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {

    @Singleton
    @Provides
     fun getAnalytics(): AnalyticsService {
         return Mixpanel()
     }

}