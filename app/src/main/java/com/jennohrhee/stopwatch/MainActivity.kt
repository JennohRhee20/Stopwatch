package com.jennohrhee.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.os.SystemClock
import android.view.View

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate has been called.")
    }

    var time = 0L
    var isRunning = false
    var currentTime = 0L

    fun start(view: View)
    {
        if(isRunning == false) {
            chronometer_main_timer.base = (SystemClock.elapsedRealtime() - currentTime)
            chronometer_main_timer.start()
            isRunning = true
        }
    }

    fun stop(view: View)
    {
        if(isRunning == true)
        {
            chronometer_main_timer.stop()
            currentTime = SystemClock.elapsedRealtime() - chronometer_main_timer.base
            isRunning = false
        }
    }

    fun reset(view: View)
    {
        chronometer_main_timer.stop()
        chronometer_main_timer.base = SystemClock.elapsedRealtime()
        currentTime = 0L
        isRunning = false
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart has been called.")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume has been called.")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause has been called.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop has been called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy has been called")
    }
}