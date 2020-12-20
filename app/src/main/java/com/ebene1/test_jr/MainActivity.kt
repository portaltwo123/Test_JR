package com.ebene1.test_jr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.widget.Toolbar
import com.ebene1.test_jr.Constants_Kategorien.Companion.initializeCategories

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val kategorien = initializeCategories()



    }
    private fun setupKategorien(){
        kategorienRV.layoutManager = LinearLayout
    }

}