package com.example.dagger

import android.content.ContentValues
import android.util.Log
import javax.inject.Inject

class EmailService  @Inject constructor(){
    fun send (to:String,from :String, body:String){
        Log.d(ContentValues.TAG,"Email Sent")

    }
}