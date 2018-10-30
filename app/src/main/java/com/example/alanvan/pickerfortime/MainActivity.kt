package com.example.alanvan.pickerfortime

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showTimePicker(view: View) {
        val newFragment = TimePickerFragment()
        newFragment.show(supportFragmentManager, getString(R.string.timepicker))
    }

    fun processTimePickerResult(hour: Int, minute: Int) {
        val hourString = Integer.toString(hour)
        val minuteString = Integer.toString(minute)
        val timeMessage = getString(R.string.time_message) + hourString + ":" + minuteString

        Toast.makeText(this, timeMessage, Toast.LENGTH_SHORT).show()
    }
}
