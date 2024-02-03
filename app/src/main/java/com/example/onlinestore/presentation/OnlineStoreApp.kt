package com.example.onlinestore.presentation

import android.app.Application
import com.example.onlinestore.di.BASE_URL
import com.parse.Parse
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class OnlineStoreApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Parse.enableLocalDatastore(this)
        Parse.initialize(
            Parse.Configuration.Builder(this)
                .server(BASE_URL)
                .build()
        )
    }
}