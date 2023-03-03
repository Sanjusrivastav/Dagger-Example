package com.example.dagger.Notification

import com.example.dagger.ApplicationScope
import com.example.dagger.MessageService
import com.example.dagger.NotificationService
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class NotificationServiceModule {

    @Named("Message")
    @ApplicationScope
    @Provides
    fun getMessageService(retryCount:Int): NotificationService {
        return MessageService(retryCount)
    }

    @ApplicationScope
    @Named("email")
    @Provides
    fun getEmailService(): NotificationService {
        return NotificationService.EmailService()
    }



}