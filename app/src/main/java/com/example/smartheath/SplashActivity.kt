package com.example.smartheath


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private lateinit var logo: ImageView
    private val splashTimeOut = 7000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        logo = findViewById(R.id.logo)

        Handler().postDelayed({
            val i = Intent(this@SplashActivity, OptionsActivity::class.java)
            startActivity(i)
            finish()
        }, splashTimeOut)

        val myAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.mysplashanimation)
        logo.startAnimation(myAnim)
    }
}