package edu.washington.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val logTag = "ActivitySpy"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(logTag, "onCreate event fired")
        if (savedInstanceState == null) {
            Log.i(logTag, "savedInstanceState of onCreate is null")
        } else {
            savedInstanceState?.keySet()?.forEach {
                Log.i(logTag, "savedInstanceState of onCreate contains the $it key")
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(logTag, "onStart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(logTag, "onResume event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(logTag, "onPause event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(logTag, "onStop event fired")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(logTag, "onRestart event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(logTag, "onDestroy event fired")
        Log.e(logTag, "We are going down, Captain!")
    }
}