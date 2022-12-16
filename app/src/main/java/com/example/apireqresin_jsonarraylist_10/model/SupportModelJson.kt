package com.example.apireqresin_jsonarraylist_10.model


import com.google.gson.annotations.SerializedName

data class SupportModelJson(
    @SerializedName("text")
    val text: String,
    @SerializedName("url")
    val url: String
)