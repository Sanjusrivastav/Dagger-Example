package com.example.dagger

import android.content.ContentValues
import android.util.Log
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton


interface NotificationService {
    fun send(to: String, from: String, body: String) {
    }

@ApplicationScope
    class EmailService @Inject constructor() : NotificationService {
        override fun send(to: String, from: String, body: String) {
            Log.d(ContentValues.TAG, "Email Sent")

        }
    }
}

@ApplicationScope
class MessageService @Inject constructor(private  val retryCount : Int):NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d(ContentValues.TAG, "Message send -Retry Count $retryCount")

    }
}