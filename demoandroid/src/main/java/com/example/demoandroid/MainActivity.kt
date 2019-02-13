package com.example.demoandroid;

import android.os.Bundle
import com.contentsquare.logger.i

class MainActivity : android.support.v7.app.AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        i("MainActivity", "MainActivity started")
    }
}
