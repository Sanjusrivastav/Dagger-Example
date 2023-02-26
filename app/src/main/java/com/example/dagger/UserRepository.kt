package com.example.dagger

import android.content.ContentValues
import android.util.Log
import javax.inject.Inject

class UserRepository@Inject constructor() {
    fun saveUser(email:String, password: String){
        Log.d(ContentValues.TAG,"User Saved in DB")
    }
}