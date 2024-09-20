//import android.app.Application
//import android.app.NotificationChannel
//import android.app.NotificationManager
//import android.os.Build
//import com.onesignal.OneSignal
//
//class MyApplication : Application() {
//    override fun onCreate() {
//        super.onCreate()
//
//        // Initialize OneSignal
//        OneSignal.initWithContext(this)
//        OneSignal.setAppId("YOUR_ONESIGNAL_APP_ID")
//
//        // Set notification opened handler
//        OneSignal.setNotificationOpenedHandler { result ->
//            val data = result.notification.additionalData
//            val targetScreen = data?.getString("targetScreen")
//
//            // Store targetScreen in a global or singleton object
//            NotificationHandler.targetScreen = targetScreen
//        }
//
//        // Set notification will show in foreground handler
//        OneSignal.setNotificationWillShowInForegroundHandler { notificationReceivedEvent ->
//            // Handle notifications when the app is in the foreground
//            val notification = notificationReceivedEvent.notification
//            notificationReceivedEvent.complete(notification) // Show the notification
//        }
//    }
//}
//object NotificationHandler {
//    var targetScreen: String? = null
//}
