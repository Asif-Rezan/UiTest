package com.asifrezan.uitest.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import com.asifrezan.uitest.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        setContentView(R.layout.activity_splash_screen)


        val splashTimer = object : Thread() {
            override fun run() {
                try {
                    sleep(3000)

                } catch (e: InterruptedException) {
                    e.printStackTrace()

                } finally {
                    val intent = Intent(applicationContext, WelcomeActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }
        splashTimer.start()


    }
}