package com.example.apireqresin_jsonarraylist_10.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apireqresin_jsonarraylist_10.R
import com.example.apireqresin_jsonarraylist_10.model.DataModelJson
import kotlinx.android.synthetic.main.items_rcclrvw_actvtmain.view.*

class AdapterRecyclerView (private val context: Context, private val dataList: MutableList<DataModelJson>) :
    RecyclerView.Adapter<AdapterRecyclerView.HolderRecyclerView>() {

  //  private lateinit var context: Context

    class HolderRecyclerView(view: View) : RecyclerView.ViewHolder(view){

        var userNameTextView: TextView? = null

        init {
            userNameTextView = view.findViewById(R.id.txtVw_userName_id)
        }
    }

    override fun onBindViewHolder(holder: HolderRecyclerView, position: Int) {
        val data = dataList.get(position)

        holder.userNameTextView?.text = holder.itemView.findViewById(R.id.txtVw_userName_id)
        holder.userNameTextView = holder.itemView.txtVw_userName_id
        val fullName = "${data.firstName} ${data.lastName}"







    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderRecyclerView {
        val inflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.items_rcclrvw_actvtmain, parent, false)
        return HolderRecyclerView(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}
