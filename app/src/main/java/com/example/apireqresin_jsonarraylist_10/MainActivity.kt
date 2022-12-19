package com.example.apireqresin_jsonarraylist_10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apireqresin_jsonarraylist_10.adapter.AdapterRecyclerView
import com.example.apireqresin_jsonarraylist_10.model.DataModelJson


//import com.example.apireqresin_jsonarraylist_10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val dataList: MutableList<DataModelJson> = mutableListOf()
    private lateinit var adapterRecyclerView: AdapterRecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Setup Android NetWorking
        // AndroidNetNetworking.initialize(this)
       // AndroidNet
        

    }
}