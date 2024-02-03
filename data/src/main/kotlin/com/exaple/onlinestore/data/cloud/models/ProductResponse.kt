package com.exaple.onlinestore.data.cloud.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProductResponse(
    @SerializedName("items")
    val items: List<ProductData>
) : Parcelable