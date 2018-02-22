package com.example.sanjeevkumar.sayings

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    val delayTime=2000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var handler=Handler()
        var run= Runnable {
            var intent=Intent(this,MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        handler.postDelayed(run,delayTime)
    }
}
