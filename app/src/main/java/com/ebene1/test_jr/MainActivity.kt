package com.ebene1.test_jr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ebene1.test_jr.Constants_Kategorien.Companion.initializeCategories

val kategorien = initializeCategories()
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupKategorien()
        //vefsefs
        //android Studio funktioniert

    }
    private fun setupKategorien(){
        val rView: RecyclerView = findViewById(R.id.kateorienRV)
        rView.layoutManager = LinearLayoutManager(this)
        rView.adapter = kategorienAdapterRV(kategorien,this)
    }

}
