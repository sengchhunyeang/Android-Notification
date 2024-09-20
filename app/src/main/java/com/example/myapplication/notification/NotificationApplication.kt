//package com.example.myapplication.notification
//
//import android.Manifest
//import android.app.Application
//import android.app.NotificationChannel
//import android.app.NotificationManager
//import android.content.Context
//import android.os.Build
//import androidx.annotation.RequiresApi
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.LaunchedEffect
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.core.app.NotificationCompat
//import com.example.myapplication.R
//import com.google.accompanist.permissions.ExperimentalPermissionsApi
//import com.google.accompanist.permissions.isGranted
//import com.google.accompanist.permissions.rememberPermissionState
//import com.onesignal.OneSignal
//import kotlin.random.Random
//
//class NotificationApplication : Application() {
//    override fun onCreate() {
//        super.onCreate()
//        val notificationChannel = NotificationChannel(
//            "notification_id",
//            "Notification name",
//            NotificationManager.IMPORTANCE_HIGH
//        )
//        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
//        // Setting up the channel
//        notificationManager.createNotificationChannel(notificationChannel)
//        OneSignal.initWithContext(this)
//        OneSignal.setAppId("YOUR_ONESIGNAL_APP_ID")
//    }
//}
