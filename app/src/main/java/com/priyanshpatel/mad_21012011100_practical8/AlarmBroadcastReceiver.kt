package com.priyanshpatel.mad_21012011100_practical8

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmBroadcastReceiver : BroadcastReceiver() {
    companion object{

        val  ALARMKEY = "Service"
        val ALARMSTART = "Start"
        val ALARMSTOP = "Stop"

    }

    override fun onReceive(context: Context, intent: Intent) {

        if (intent!=null)
        {
            val data = intent.getStringExtra(ALARMKEY)

            if (data != null)
            {
                val intentservice = Intent(context,AlarmService::class.java)

                if (data == ALARMSTART)
                {
                    context.startService(intentservice)
                }

                else
                {
                    context.stopService(intentservice)

                }
            }

            }
        }
    }


