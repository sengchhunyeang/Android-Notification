package com.example.myapplication.oneSignalTwoDevice

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import okhttp3.Call
import okhttp3.Callback
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import okio.IOException
import org.json.JSONArray
import org.json.JSONObject

@Composable
fun SendPushNotification(targetPlayerId: List<String>) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            sendPushNotification(
                targetPlayerId,
                "Hello Friend",
                "This is a test notification"
            )
        }) {

        }
    }
}

fun sendPushNotification(
    subscriptionIds: List<String>,
    title: String,
    message: String
) {

    val appId = "a6a66783-6cba-4085-824c-df0ab194bdd0"

    val restApiKey = "M2ExMjkxY2MtZjEzOS00NmMwLTg1YWYtYjc5M2VmZjhkZWM0"

    // Create OkHttpClient
    val client = OkHttpClient()


    // Create the JSON request body
    val jsonBody = JSONObject().apply {
        put("app_id", appId)
        put("headings", JSONObject().put("en", title))
        put("contents", JSONObject().put("en", message))

        // Convert the List<String> into a JSONArray
        put("include_subscription_ids", JSONArray(subscriptionIds))
    }


    val body = jsonBody.toString().toRequestBody(
        "application/json; charset=utf-8".toMediaTypeOrNull()
    )

    // Build the request
    val request = Request.Builder()
        .url("https://api.onesignal.com/notifications")
        .post(body)
        .addHeader("Content-Type", "application/json; charset=utf-8")
        .addHeader("Authorization", "Basic $restApiKey") // Add your OneSignal REST API key
        .build()
    Log.d("Request notification", "Request: $request")


    // Execute the request
    client.newCall(request).enqueue(object : Callback {
        override fun onFailure(call: Call, e: IOException) {
            Log.d("Response notification", "Failed to send notification: ${e.message}")
        }

        override fun onResponse(call: Call, response: Response) {
            if (response.isSuccessful) {
                Log.d(
                    "Response notification",
                    "Notification sent successfully: ${response.body?.string()}"
                )
            } else {
                Log.d(
                    "Response notification",
                    "Failed to send notification. Error: ${response.code} - ${response.body?.string()}"
                )
            }
        }
    })
}
