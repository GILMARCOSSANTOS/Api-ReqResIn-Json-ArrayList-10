package com.example.apireqresin_jsonarraylist_10.model


import com.google.gson.annotations.SerializedName

data class ReqresJson(
    @SerializedName("data")
    val `data`: List<DataModelJson>,
    @SerializedName("page")
    val page: Int,
    @SerializedName("per_page")
    val perPage: Int,
    @SerializedName("support")
    val support: SupportModelJson,
    @SerializedName("total")
    val total: Int,
    @SerializedName("total_pages")
    val totalPages: Int
)