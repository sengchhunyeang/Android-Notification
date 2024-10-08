package com.example.myapplication.notification

import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import com.example.myapplication.R
import kotlin.random.Random

class NotificationHandler(private val context: Context) {
    private val notificationManager = context.getSystemService(NotificationManager::class.java)
    private val notificationChannelID = "notification_channel_id"

    // SIMPLE NOTIFICATION
    fun showSimpleNotification() {
        val notification = NotificationCompat.Builder(context, notificationChannelID)
            .setContentTitle("Wing Transfer 3000 Riel")
            .setContentText("ទឹកប្រាក់របស់អ្នកត្រូវបានដក ")
            .setSmallIcon(R.drawable.wing)
            .build()  // finalizes the creation
        notificationManager.notify(Random.nextInt(), notification)
    }
}