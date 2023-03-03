package com.example.dagger

import android.content.ContentValues.TAG
import android.util.Log
import java.util.prefs.NodeChangeEvent
import javax.inject.Named

interface AnalyticsService {
    fun trackEvent(eventName:String,eventType:String)

}
//@Named("Mixpanel")
class Mixpanel :AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG,"Mixpanel-$eventName-$eventType")

    }

}
//@Named("FireBaseAnalytics")
//class FireBaseAnalytics :AnalyticsService {
//    override fun trackEvent(eventName: String, eventType: String) {
//        Log.d(TAG, "FireBaseAnalytics-$eventName-$eventType")
//
//    }
//}
