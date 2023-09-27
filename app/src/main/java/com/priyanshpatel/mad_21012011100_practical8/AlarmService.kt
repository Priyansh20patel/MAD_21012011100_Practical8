package com.priyanshpatel.mad_21012011100_practical8

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class AlarmService : Service() {

    lateinit var player: MediaPlayer
    override fun onBind(intent: Intent): IBinder {
         TODO("This is an Alarm Clock")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        if (intent != null) {
            player = MediaPlayer.create(this, R.raw.alarm)
            player.start()
        }
        return START_STICKY
    }

    override fun onDestroy() {
        player.stop()
        super.onDestroy()
    }
}