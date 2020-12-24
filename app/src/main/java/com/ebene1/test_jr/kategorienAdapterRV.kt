package com.ebene1.test_jr

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ebene1.test_jr.Constants_Kategorien.Companion.initializeTimer
import java.util.*

class kategorienAdapterRV(val items: ArrayList<TimerCategories>, val context: Context) : RecyclerView.Adapter<kategorienAdapterRV.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): kategorienAdapterRV.ViewHolder {
      return ViewHolder(
              LayoutInflater.from(context).inflate(
                      R.layout.layout_kategorien,
                      parent,
                      false
              )
      )
    }

    override fun onBindViewHolder(holder: kategorienAdapterRV.ViewHolder, position: Int) {
        val model: TimerCategories = items[position]

        holder.imageView.setImageResource(model.getImage())
        holder.nameCategory.text = model.getName()
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView :ImageView = itemView.findViewById(R.id.image)
        val nameCategory : TextView = itemView.findViewById(R.id.nameCategory)

        init {
            itemView.setOnClickListener {v: View ->
                val position :Int = adapterPosition
                initializeTimer(position)
            }
        }
    }

}