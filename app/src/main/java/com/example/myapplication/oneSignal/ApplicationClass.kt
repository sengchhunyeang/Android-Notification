package com.example.myapplication.oneSignal

import android.app.Application
import androidx.constraintlayout.motion.widget.Debug
import com.onesignal.OneSignal
import com.onesignal.debug.LogLevel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// NOTE: Replace the below with your own ONESIGNAL_APP_ID
val ONESIGNAL_APP_ID = "a6a66783-6cba-4085-824c-df0ab194bdd0"

class ApplicationClass : Application() {
    override fun onCreate() {
        super.onCreate()
// Verbose Logging set to help debug issues, remove before releasing your app.
        OneSignal.Debug.logLevel = LogLevel.VERBOSE

        // OneSignal Initialization
        OneSignal.initWithContext(this, ONESIGNAL_APP_ID)

        // requestPermission will show the native Android notification permission prompt.
        // NOTE: It's recommended to use a OneSignal In-App Message to prompt instead.
        CoroutineScope(Dispatchers.IO).launch {
            OneSignal.Notifications.requestPermission(false)
        }
    }
}