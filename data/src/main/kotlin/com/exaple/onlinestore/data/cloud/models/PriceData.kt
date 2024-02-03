package com.exaple.onlinestore.data.cloud.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class PriceData(
    @SerializedName("discount")
    val discount: Int,
    @SerializedName("price")
    val price: String,
    @SerializedName("priceWithDiscount")
    val priceWithDiscount: String,
    @SerializedName("unit")
    val unit: String
) : Parcelable