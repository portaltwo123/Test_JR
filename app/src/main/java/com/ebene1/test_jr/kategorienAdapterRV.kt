package com.ebene1.test_jr

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class kategorienAdapterRV(val items: ArrayList<TimerCategories>, val context: Context) : RecyclerView.Adapter<TimerCategories.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimerCategories.ViewHolder {
      return ViewHolder(
              LayoutInflater.from(context).inflate(
                      R.layout.layout_kategorien,
                      parent,
                      false
              )
      )
    }

    override fun onBindViewHolder(holder: TimerCategories.Viewholder, position: Int) {
        
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView :ImageView = itemView.findViewById(R.id.image)
        val nameCategory : TextView = itemView.findViewById(R.id.nameCategory)
    }

}