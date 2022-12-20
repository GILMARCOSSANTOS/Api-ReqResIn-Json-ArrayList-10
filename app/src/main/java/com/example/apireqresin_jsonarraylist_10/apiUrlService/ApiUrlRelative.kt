package com.example.apireqresin_jsonarraylist_10.apiUrlService

import com.example.apireqresin_jsonarraylist_10.model.DataModelJson
import retrofit2.Call
import retrofit2.http.GET

interface ApiUrlRelative {
    @GET("users?page=2")
    fun getApiEndUrl(): Call<MutableList<DataModelJson>>
}