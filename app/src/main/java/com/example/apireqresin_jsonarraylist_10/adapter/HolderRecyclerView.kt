package com.example.apireqresin_jsonarraylist_10.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apireqresin_jsonarraylist_10.R

class HolderRecyclerViewx(view: View) : RecyclerView.ViewHolder(view){

    var userName: TextView? = null

    init {
        userName = view.findViewById(R.id.txtVw_userName_id)
    }
}