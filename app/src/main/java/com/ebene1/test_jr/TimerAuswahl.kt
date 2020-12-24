package com.ebene1.test_jr

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class TimerAuswahl : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer_auswahl)

        // Enables Always-on
        setAmbientEnabled()
    }
}