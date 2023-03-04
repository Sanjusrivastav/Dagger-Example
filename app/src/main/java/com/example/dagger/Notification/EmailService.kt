package com.example.dagger

import android.content.ContentValues
import android.util.Log
import javax.inject.Inject


interface NotificationService {
    fun send(to: String, from: String, body: String) {

    }
}

    class EmailService @Inject constructor() : NotificationService {
        override fun send(to: String, from: String, body: String) {
            Log.d(ContentValues.TAG, "Email Sent")

        }
    }

@ActivityScope
class MessageService @Inject constructor(private  val retryCount : Int):NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d(ContentValues.TAG, "Message send -Retry Count $retryCount")

    }
}