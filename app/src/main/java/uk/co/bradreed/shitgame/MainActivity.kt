package uk.co.bradreed.shitgame

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window.FEATURE_NO_TITLE
import android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN)

        requestWindowFeature(FEATURE_NO_TITLE)

//        setContentView(R.layout.activity_main)
    }
}