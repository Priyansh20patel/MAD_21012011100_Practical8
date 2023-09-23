package com.priyanshpatel.mad_21012011100_practical8

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TimePicker
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val addAlarm:MaterialCardView=findViewById(R.id.card)
        val card:MaterialCardView=findViewById(R.id.card2)

        card.visibility = View.GONE
        addAlarm.setOnClickListener{
            card.visibility=View.VISIBLE

            TimePickerDialog(this,{tp,hour,minute-> setAlarmTime(hour,minute)},11,0,false).show()
        }

    }
fun setAlarmTime(hour:Int,minutes:Int){
    //card.visibility=View.VISIBLE
}


  }