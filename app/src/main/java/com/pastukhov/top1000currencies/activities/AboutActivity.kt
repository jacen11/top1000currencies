package com.pastukhov.top1000currencies.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.pastukhov.top1000currencies.R

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
