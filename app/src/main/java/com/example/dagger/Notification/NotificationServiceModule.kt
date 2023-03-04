package com.example.dagger.Notification

import com.example.dagger.*
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class NotificationServiceModule {



    @ActivityScope
    @Named("Message")
    @Provides
    fun getMessageService(): NotificationService {
        return MessageService(3)
    }


    @Named("email")
    @Provides
    fun getEmailService(): NotificationService {
        return EmailService()
    }



}