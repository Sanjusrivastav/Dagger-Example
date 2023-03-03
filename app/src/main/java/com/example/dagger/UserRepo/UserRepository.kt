package com.example.dagger

import android.content.ContentValues
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


interface UserRepository {
    fun saveUser(email: String, password: String) {

    }
}
@ApplicationScope
class SQlRepository @Inject constructor( val analyticsService: AnalyticsService) : UserRepository { // user saved
        override fun saveUser(email: String, password: String) {
            Log.d(ContentValues.TAG, "User Saved in DB")
            analyticsService.trackEvent("saveUser","CREATE")

        }
    }

class FireBaseRepository @Inject constructor( val analyticsService: AnalyticsService):UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(ContentValues.TAG, "User Saved in FireBase")
        analyticsService.trackEvent("saveUser","CREATE")


    }
}


