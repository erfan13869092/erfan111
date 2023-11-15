package com.example.myerfan

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class Firebase : FirebaseMessagingService() {
    private val notificationTest = NotificationTest()
    override fun onMessageReceived(remoteMessage: RemoteMessage) {


        if (remoteMessage.data.isNotEmpty()) {

        }

        remoteMessage.notification?.let {
            notificationTest.onCreateNotification(it.title.toString(), it.body.toString(), this)
        }

    }
}