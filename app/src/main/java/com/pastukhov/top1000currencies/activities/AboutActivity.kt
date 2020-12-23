package com.pastukhov.top1000currencies.activities

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pastukhov.top1000currencies.R
import kotlinx.android.synthetic.main.activity_about.*
import com.google.android.gms.ads.AdRequest

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        buttonRateApp.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=${applicationContext.packageName}")
                )
            )
        }
    }
}
