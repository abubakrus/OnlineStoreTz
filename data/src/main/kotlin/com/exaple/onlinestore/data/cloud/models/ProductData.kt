package com.exaple.onlinestore.data.cloud.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProductData(
    @SerializedName("available")
    val available: Int,
    @SerializedName("description")
    val description: String,
    @SerializedName("feedback")
    val feedback: FeedbackData,
    @SerializedName("id")
    val id: String,
    @SerializedName("info")
    val info: List<InfoData>,
    @SerializedName("ingredients")
    val ingredients: String,
    @SerializedName("price")
    val price: PriceData,
    @SerializedName("subtitle")
    val subtitle: String,
    @SerializedName("tags")
    val tags: List<String>,
    @SerializedName("title")
    val title: String
) : Parcelable